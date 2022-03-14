package com.bridgelabz.hotelreservationsystem;
	import java.util.ArrayList;
import java.util.List;

	
	public class HotelReservation {
		
		static List<HotelDetails> list = new ArrayList<>();
		
		/*
		 * Ability to add add hotel
		 */
		public HotelDetails addHotel(String hName,double rate) {
			HotelDetails hotelDetails = new HotelDetails();
			hotelDetails.setHotelName(hName);
			hotelDetails.setRegularCustomerCost(rate);
			list.add(hotelDetails);
			return hotelDetails;
		}
		
		public static void main(String[] args) {
			System.out.println("Welcome to hotel reservation system");
		}
	}
