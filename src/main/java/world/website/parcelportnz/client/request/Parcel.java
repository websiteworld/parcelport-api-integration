package world.website.parcelportnz.client.request;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a Parcel for the ParcelPort API. 
 * See {@link https://github.com/ParcelPort/ParcelPort.API}.
 */
public class Parcel {

	// length - [Require Length of the parcel cm]
	private Double length;

	// width - [Require Width of the parcel cm]
	private Double width;

	// height - [Require Length of the parcel cm]
	private Double height;

	// weight - [Require Weight of the parcel Kg]
	private BigDecimal weight;

	// volumn - [Optional Volumn of the parcel]
	private Double volumn;

	// kind - [Optional default is 0, 1 if using satchel]
	private Integer kind;

	// group_id - [Optional add the satchel code if using satchel]
	private String group_id;

	// cust_ref - [Optional reference of the item]
	private String cust_ref;

	// insurance_required - [Require if International, true / false]
	private Boolean insurance_required;

	// insured_value_amount - [Require if International, insured value]
	private BigDecimal insured_value_amount;

	// currency - [Optional, Default NZD, insured value currency]
	private String currency;

	// parcel_contents [Require if International]
	private ParcelContents parcel_contents;

	// parcel_contents [Require if International]
	public class ParcelContents {

		// description - [Require if International, description of your products]
		private String description;

		// quantity - [Require if International, quantity of your products]
		private Integer quantity;

		// weight - [Require if International, weight of your products]
		private BigDecimal weight;

		// value - [Require if International, value of your products]
		private BigDecimal value;

		public String getDescription() {
			return description;
		}

		public Integer getQuantity() {
			return quantity;
		}

		public BigDecimal getWeight() {
			return weight;
		}

		public BigDecimal getValue() {
			return value;
		}

		public void validate(List<String> requiredFields) {
			if (description == null)
				requiredFields.add("international description");
			if (quantity == null)
				requiredFields.add("international quantity");
			if (weight == null)
				requiredFields.add("international weight");
			if (value == null)
				requiredFields.add("value");
		}
	}

	private Parcel() {
	}

	public Double getLength() {
		return length;
	}

	public Double getWidth() {
		return width;
	}

	public Double getHeight() {
		return height;
	}

	public BigDecimal getWeight() {
		return weight;
	}

	public Double getVolumn() {
		return volumn;
	}

	public Integer getKind() {
		return kind;
	}

	public String getGroup_id() {
		return group_id;
	}

	public String getCust_ref() {
		return cust_ref;
	}

	public Boolean getInsurance_required() {
		return insurance_required;
	}

	public BigDecimal getInsured_value_amount() {
		return insured_value_amount;
	}

	public String getCurrency() {
		return currency;
	}

	public ParcelContents getParcel_contents() {
		return parcel_contents;
	}

	public static class Builder {

		public enum SatchelCode {
			
			a5("Satchel 150x210 Small A5 Size"), a5b("Satchel Small A5 Bubble"), a4("Satchel 210x297 A4 Size"), a4b("A4 Bubble"), med("280x350 Medium Size"), medb("Medium Bubble"), a3("297x420 Large A3 Size"), xl("450x450 Extra Large A2 Size");

			private final String description;

			SatchelCode(String description) {
				this.description = description;
			}
		}

		private Double length;
		private Double width;
		private Double height;
		private BigDecimal weight;

		// volumn - [Optional Volumn of the parcel]
		private Double volumn;

		// kind - [Optional default is 0, 1 if using satchel]
		private Integer kind;

		// group_id - [Optional add the satchel code if using satchel]
		private String group_id;

		// cust_ref - [Optional reference of the item]
		private String cust_ref;

		// insurance_required - [Require if International, true / false]
		private Boolean insurance_required;

		// insured_value_amount - [Require if International, insured value]
		private BigDecimal insured_value_amount;

		// currency - [Optional, Default NZD, insured value currency]
		private String currency;

		// description - [Require if International, description of your products]
		private String internationalContentDescription;

		// quantity - [Require if International, quantity of your products]
		private Integer internationalQuantity;

		// weight - [Require if International, weight of your products]
		private BigDecimal internationalWeight;

		// value - [Require if International, value of your products]
		private BigDecimal internationalValue;

		public Builder length(Double length) {
			this.length = length;
			return this;
		}

		public Builder width(Double width) {
			this.width = width;
			return this;
		}

		public Builder height(Double height) {
			this.height = height;
			return this;
		}

		public Builder weight(BigDecimal weight) {
			this.weight = weight;
			return this;
		}

		public Builder volumn(Double volumn) {
			this.volumn = volumn;
			return this;
		}

		public Builder satchel(boolean isSatchel) {
			this.kind = isSatchel ? 1 : 0;
			return this;
		}

		public Builder satchelCode(SatchelCode satchelCode) {
			this.group_id = satchelCode.name();
			return this;
		}

		public Builder customerReference(String customerReference) {
			this.cust_ref = customerReference;
			return this;
		}

		public Builder insuranceRequired(boolean insuranceRequired) {
			this.insurance_required = insuranceRequired;
			return this;
		}

		public Builder insuranceRequired(BigDecimal insuredValueAmount) {
			this.insured_value_amount = insuredValueAmount;
			return this;
		}

		public Builder currency(String currencyCode) {
			this.currency = currencyCode;
			return this;
		}

		public Builder internationalParcelContentDescription(String description) {
			this.internationalContentDescription = description;
			return this;
		}

		public Builder internationalQuantity(Integer quantity) {
			this.internationalQuantity = quantity;
			return this;
		}

		public Builder internationalWeight(BigDecimal weight) {
			this.internationalWeight = weight;
			return this;
		}

		public Builder internationalValue(BigDecimal value) {
			this.internationalValue = value;
			return this;
		}

		/**
		 * Create a Parcel for the ParcelPort API. 
		 * @param isInternational Used to trigger validation for fields that are mandatory when shipping internationally.
		 * @param warnings A list of warnings indicating required API information is not supplied.
		 * @return
		 */
		public Parcel build(boolean isInternational, List<String> warnings) {
			Parcel parcel = new Parcel();

			parcel.length = this.length;
			parcel.width = this.width;
			parcel.height = this.height;
			parcel.weight = this.weight;

			parcel.volumn = this.volumn;

			parcel.kind = this.kind;
			parcel.group_id = this.group_id;
			parcel.cust_ref = this.cust_ref;
			parcel.insurance_required = this.insurance_required;
			parcel.insured_value_amount = this.insured_value_amount;
			parcel.currency = this.currency;

			if (isInternational) {
				parcel.parcel_contents = parcel.new ParcelContents();
				parcel.parcel_contents.description = internationalContentDescription;
				parcel.parcel_contents.quantity = internationalQuantity;
				parcel.parcel_contents.value = internationalValue;
				parcel.parcel_contents.weight = internationalWeight;
			}

			parcel.validate(isInternational);

			return parcel;
		}
	}

	private List<String> validate(boolean isInternational) {
		List<String> requiredFields = new ArrayList<String>();
		if (length == null)
			requiredFields.add("length");
		if (width == null)
			requiredFields.add("width");
		if (height == null)
			requiredFields.add("height");
		if (height == null)
			requiredFields.add("weight");

		if ((kind != null) && (group_id == null))
			requiredFields.add("satchelCode");

		if (isInternational) {
			if (insurance_required == null)
				requiredFields.add("insuranceRequired");
			if (insured_value_amount == null)
				requiredFields.add("insuredValueAmount");
			if (parcel_contents == null)
				requiredFields.add("parcelContents");
			if (parcel_contents != null) {
				parcel_contents.validate(requiredFields);
			}
		}

		return requiredFields;
	}

}
