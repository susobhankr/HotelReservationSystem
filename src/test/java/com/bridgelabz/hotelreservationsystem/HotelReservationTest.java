package com.bridgelabz.hotelreservationsystem;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationTest {
	
	@Test
	public void givenHotelDetailsIfProperReturnTrue() {
		HotelReservation hotelReservation = new HotelReservation();
		HotelDetails hotelDetails = hotelReservation.addHotel("LakeWood", 110);
		Assert.assertEquals("LakeWood", hotelDetails.getHotelName());
		
	}
	
	@Test
	public void givenHotelDetailsIfNotProperReturnFalse() {
		HotelReservation hotelReservation = new HotelReservation();
		HotelDetails hotelDetails = hotelReservation.addHotel("LakeWoo", 110);
		Assert.assertEquals("LakeWood", hotelDetails.getHotelName());
		
	}

}
