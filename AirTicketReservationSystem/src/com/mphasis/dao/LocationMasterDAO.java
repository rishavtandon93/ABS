package com.mphasis.dao;

import com.mphasis.model.dto.LocationMaster;

import java.util.Date;
import java.util.List;

import com.mphasis.model.dto.FlightMaster;


public interface LocationMasterDAO {
	
	//public LocationMaster getLname(long locationId);
	 public int getLId(String LocationName);
	 public List <FlightMaster> getFlightDetails(int srcId, int destId, String bookingDate);
	 public List <FlightMaster> getAscending(int srcId, int destId, Date bookingDate);
	 public List <FlightMaster> getDescending(int srcId, int destId, Date bookingDate);

}
