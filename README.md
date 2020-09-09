# parcelport-api-integration
Java integration for the Parcelport API

# Usage example

		// Connect to the parcelport API
		ParcelPortClient client = new ParcelPortClient("username", "password");
		client.connect("https://apitest.parcelport.co.nz");
		
		// A list for warning messages (hopefully empty) about missing mandatory parameters in the pickup address.
		List<String> pickupAddressWarningMessages = new ArrayList<String>();
		
		Address pickupAddress = new Address.Builder()
				.body("20 South Street")
				.number("20")
				.street("South Street")
				.suburb("Tawa")
				.city("Wellington")
				.country("NZ").postcode("5028")
				.build(pickupAddressWarningMessages);
		
		// A list for warning messages (hopefully empty) warning about missing mandatory parameters in the delivery address.
		List<String> deliveryAddressWarningMessages = new ArrayList<String>();
		
		Address deliveryAddress = new Address.Builder()
				.body("14/386 Richmond Road")
				.number("14/386")
				.street("Richmond Road")
				.suburb("Grey Lynn")
				.city("Auckland")
				.country("NZ").postcode("1021")
				.build(deliveryAddressWarningMessages);
		
		// A list for warning messages (hopefully empty) warning about missing mandatory parameters in the parcel details.
		List<String> parcelWarningMessages = new ArrayList<String>();
		
		Parcel parcel = new Parcel.Builder()
				.length(10.0)
				.width(10.0)
				.height(10.0)
				.weight(BigDecimal.valueOf(1.0))
				.build(false, parcelWarningMessages);
		
		List<Parcel> parcels = new ArrayList<Parcel>();
		parcels.add(parcel);
		
		ParcelPortQuote allQuotes = client.getQuotes(pickupAddress, deliveryAddress, parcels);
