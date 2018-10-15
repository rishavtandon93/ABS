package com.mphasis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.mphasis.model.dto.FlightMaster;
import com.mphasis.model.dto.LocationMaster;
import com.mphasis.myutils.MyUtility;

public class LocationMasterDAOImple implements LocationMasterDAO {

	@Override
	public int getLId(String LocationName) {
	Session session = MyUtility.getMySessionFactory().openSession();
	String sql1="from LocationMaster L where L.locationName='"+LocationName+"'";
	Query<LocationMaster> list = (Query<LocationMaster>)session.createQuery(sql1);
    LocationMaster lm1 = (LocationMaster)list.getSingleResult();
    System.out.println(lm1.getLocationId());
    int id= lm1.getLocationId();
    return id;
	}
	
	@Override
	public List<FlightMaster> getFlightDetails(int srcId, int destId, String bookingDate) {
		Session session = MyUtility.getMySessionFactory().openSession();
		String sql1="from FlightMaster f where f.locationMaster1.locationId='"+srcId+"'and f.locationMaster2.locationId='"+destId+"' and f.departDate='"+bookingDate+"'";
		Query<FlightMaster> list = (Query<FlightMaster>)session.createQuery(sql1);
	    List<FlightMaster> fm = list.getResultList();
	   // System.out.println(((FlightMaster) fm).getFNo());
	    //String fId = ((FlightMaster) fm).getFNo();
		return  fm;
	}


}
