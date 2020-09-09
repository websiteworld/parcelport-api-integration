# parcelport-api-integration
Java integration for the Parcelport API

# Usage example

		ParcelPortClient client = new ParcelPortClient("pptest", "1234abcd");
		client.connect("https://apitest.parcelport.co.nz");
		
		List<String> pickupAddressWarningMessages = new ArrayList<String>();
		
		Address pickupAddress = new Address.Builder()
				.body("20 South Street")
				.number("20")
				.street("South Street")
				.suburb("Tawa")
				.city("Wellington")
				.country("NZ").postcode("5028")
				.build(pickupAddressWarningMessages);
		
		List<String> deliveryAddressWarningMessages = new ArrayList<String>();
		
		Address deliveryAddress = new Address.Builder()
				.body("14/386 Richmond Road")
				.number("14/386")
				.street("Richmond Road")
				.suburb("Grey Lynn")
				.city("Auckland")
				.country("NZ").postcode("1021")
				.build(deliveryAddressWarningMessages);
		
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
