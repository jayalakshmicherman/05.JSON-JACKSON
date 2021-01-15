package com.cognizant.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
public class Customer {

		@JsonProperty("cid")
		private int customerId;
		
		@JsonProperty("cname")
		private String customerName;
		
		@JsonProperty("cemail")
		private String customerEmail;
		public int getCustomerId() {
			return customerId;
		}
		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public String getCustomerEmail() {
			return customerEmail;
		}
		public void setCustomerEmail(String customerEmail) {
			this.customerEmail = customerEmail;
		}
		@Override
		public String toString() {
			return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerEmail="
					+ customerEmail + "]";
		}
		
}
