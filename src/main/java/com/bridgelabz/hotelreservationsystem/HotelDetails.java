package com.bridgelabz.hotelreservationsystem;

	public class HotelDetails {
		private String hotelName;
		private double regularCustomerCost;
		
		
		public HotelDetails() {
		}
		
		
		public HotelDetails(String hotelName, double regularCustomerCost) {
			super();
			this.hotelName = hotelName;
			this.regularCustomerCost = regularCustomerCost;
		}
		public String getHotelName() {
			return hotelName;
		}
		public void setHotelName(String hotelName) {
			this.hotelName = hotelName;
		}
		public double getRegularCustomerCost() {
			return regularCustomerCost;
		}
		public void setRegularCustomerCost(double regularCustomerCost) {
			this.regularCustomerCost = regularCustomerCost;
		}
		
		
		@Override
		public String toString() {
			return "HotelDetails [hotelName=" + hotelName + ", regularCustomerCost=" + regularCustomerCost + "]";
		}
		
		
		
	}

