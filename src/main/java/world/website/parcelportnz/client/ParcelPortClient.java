package world.website.parcelportnz.client;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;

import world.website.parcelportnz.client.request.Address;
import world.website.parcelportnz.client.request.Parcel;
import world.website.parcelportnz.client.response.ParcelPortQuote;

/** 
 * A client for the ParcelPort API. 
 * See {@link https://github.com/ParcelPort/ParcelPort.API}
 *
 * @author John Deverall
 * @email john@websitebuilder.co.nz
 */
public class ParcelPortClient {

	// environment
	private String environmentUrl;
	
	// credentials
	private String loginUsername;
	private String password;

	// Token properties
	private String accessToken;
	private String tokenType;
	private Integer expiresIn;
	private String clientId;
	private String username;
	private String issued;
	private String expires;

	private CloseableHttpClient httpClient = HttpClients.createDefault();

	private static ObjectMapper mapper;
	
	// Used for setting a mock http client for unit testing
	void setHttpClient(CloseableHttpClient client) {
		this.httpClient = client;
	}

	/** 
	 * Creates a client to the ParcelPort API.
	 * @param username
	 * @param password
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
	public ParcelPortClient(String username, String password) {
		this.loginUsername = username;
		this.password = password;
		mapper = new ObjectMapper();
	}

	/** 
	 * Creates a client to the ParcelPort API. 
	 * @param username
	 * @param password
	 * @param objectMapper The cached Jackson2 object mapper from the client (improves performance).
	 */
	public ParcelPortClient(String username, String password, ObjectMapper objectMapper) { 
		mapper = objectMapper;
	}

	/**
	 * Connect to the ParcelPort API using credentials suppied in the constructor.
	 * @return true if the connection is successfully made. False otherwise. 
	 * @throws IOException 
	 */
	public final boolean connect() throws IOException { 
		return connect("https://api.parcelport.co.nz");
	}
	
	/**
	 * Connect to the ParcelPort API using credentials supplied in the constructor.
	 * @return true if the connection is successfully made. False otherwise.
	 * @param environmentUrl Useful for connecting to environments that are not production (e.g. test). 
	 * @throws IOException
	 */
	public final boolean connect(String environmentUrl) throws IOException {
		this.environmentUrl = environmentUrl;
		
		HttpPost tokenRequest = new HttpPost(environmentUrl + "/token");

		List<NameValuePair> authenticationValues = new ArrayList<NameValuePair>();
		authenticationValues.add(new BasicNameValuePair("username", loginUsername));
		authenticationValues.add(new BasicNameValuePair("password", password));
		authenticationValues.add(new BasicNameValuePair("grant_type", "password"));
		UrlEncodedFormEntity urlEncodedFormEntity = new UrlEncodedFormEntity(authenticationValues);
		tokenRequest.setEntity(urlEncodedFormEntity);
		tokenRequest.addHeader("Content-Type", "application/x-www-form-urlencoded");
		CloseableHttpResponse response = httpClient.execute(tokenRequest);
		if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
			BufferedInputStream in = new BufferedInputStream(response.getEntity().getContent());
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			String responseString = reader.readLine();

			JSONObject jsonObject = new JSONObject(responseString);
			accessToken = jsonObject.getString("access_token");
			tokenType = jsonObject.getString("token_type");
			expiresIn = jsonObject.getInt("expires_in");
			clientId = jsonObject.getString("client_id");
			username = jsonObject.getString("userName");
			issued = jsonObject.getString(".issued");
			expires = jsonObject.getString(".expires");
			return true;
		}
		throw new IOException(response.toString());
	}

	/**
	 * Method to retrieve shipping price by accessing ParcelPort api.
	 * 
	 * @param shippingInfo - Shipping details based on which shipping info is
	 *                     calculated
	 * @throws IOException
	 * @throws ClientProtocolException
	 * @throws JSONException
	 */
	public ParcelPortQuote getQuotes(Address pickupAddress, Address deliveryAddress, List<Parcel> parcels)
			throws ClientProtocolException, IOException, JSONException {
		HttpPost tokenRequest = new HttpPost(environmentUrl + "/api/1.0/shippingoptions?client_id=" + clientId);
		tokenRequest.addHeader("Content-Type", "application/json");
		tokenRequest.addHeader("Authorization", "Bearer " + accessToken);
		String requestBody = createRequestBody(pickupAddress, deliveryAddress, parcels);
		tokenRequest.setEntity(new StringEntity(requestBody));
		CloseableHttpResponse response = httpClient.execute(tokenRequest);
		BufferedInputStream in = new BufferedInputStream(response.getEntity().getContent());
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
			return mapper.readValue(reader, ParcelPortQuote.class);
		}
		throw new IOException(response.toString());
	}
	
	private String createRequestBody(Address pickupAddress, Address deliveryAddress, List<Parcel> parcels) {
		JSONObject pickup = new JSONObject(pickupAddress);
		JSONObject delivery = new JSONObject(deliveryAddress);
		JSONArray parcelArray = new JSONArray(parcels.toArray());
		JSONObject requestBody = new JSONObject();
		requestBody.put("parcels", parcelArray);
		requestBody.put("DeliveryAddress", delivery);
		requestBody.put("PickupAddress", pickup);
		return requestBody.toString();
	}
}
