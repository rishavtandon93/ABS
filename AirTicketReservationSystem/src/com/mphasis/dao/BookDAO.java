package com.mphasis.dao;

import java.util.Date;
import java.util.List;

import com.mphasis.model.dto.BookingInfo;
import com.mphasis.model.dto.FlightMaster;

public interface BookDAO {
	
	 public BookingInfo addBooking(String flightno, int custid, int seats,int price, Date depdate);
	 public List<FlightMaster> getBookingDeets(String flightno);
	 public BookingInfo confirmBooking(String flightno, int custid, int seats,int price, Date depdate);
	 


}
