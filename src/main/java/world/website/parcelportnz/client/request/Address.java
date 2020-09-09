package world.website.parcelportnz.client.request;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents an Address for the ParcelPort API. 
 * See {@link https://github.com/ParcelPort/ParcelPort.API}.
 */
public class Address {

	private String address_body;
	private String address_city;
	private String address_country;
	private String address_postcode;
	private String address_number;
	private String address_street;
	private String address_suburb;
	
	private Address() {}
	
	public String getAddress_body() {
		return address_body;
	}

	public String getAddress_city() {
		return address_city;
	}

	public String getAddress_country() {
		return address_country;
	}

	public String getAddress_postcode() {
		return address_postcode;
	}

	public String getAddress_number() {
		return address_number;
	}

	public String getAddress_street() {
		return address_street;
	}

	public String getAddress_suburb() {
		return address_suburb;
	}
	
	public static class Builder { 
		
		private String body;
		private String city;
		private String country;
		private String postcode;
		private String number;
		private String street;
		private String suburb;
		
		public Builder body(String body) { 
			this.body = body;
			return this;
		}
		
		public Builder city(String city) { 
			this.city = city;
			return this;
		}
		
		public Builder country(String country) { 
			this.country = country;
			return this;
		}
		
		public Builder postcode(String postcode) {
			this.postcode = postcode;
			return this;
		}
		
		public Builder number(String number) { 
			this.number = number;
			return this;
		}
		
		public Builder street(String street) { 
			this.street = street;
			return this;
		}
		
		public Builder suburb(String suburb) { 
			this.suburb = suburb;
			return this;
		}
		
		/**
		 * Create an Address for the ParcelPort API. 
		 * @param warnings A list of warnings indicating required API information is not supplied.
		 * @return
		 */
		public Address build(List<String> warnings) {
			Address address = new Address();
			address.address_body = body;
			address.address_city = city;
			address.address_country = country;
			address.address_postcode = postcode;
			address.address_number = number;
			address.address_street = street;
			address.address_suburb = suburb;
			
			address.validate();
			
			return address;
		}
	}

	private List<String> validate() { 
		List<String> requiredFields = new ArrayList<String>();
		if (address_body == null) requiredFields.add("body");
		if (address_city == null) requiredFields.add("city");
		if (address_country == null) requiredFields.add("country");
		if (address_postcode == null) requiredFields.add("postcode");
		if (address_number == null) requiredFields.add("number");
		if (address_street == null) requiredFields.add("street");
		if (address_suburb == null) requiredFields.add("suburb");
		return requiredFields;
	}
	
}
