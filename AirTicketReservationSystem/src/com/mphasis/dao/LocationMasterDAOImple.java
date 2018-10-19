package com.mphasis.dao;


import java.util.Date;
import java.util.List;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.mphasis.model.dto.FlightMaster;
import com.mphasis.model.dto.LocationMaster;
import com.mphasis.myutils.MyUtility;

public class LocationMasterDAOImple implements LocationMasterDAO {

	@SuppressWarnings("unchecked")
	@Override
	public int getLId(String LocationName) {
	Session session = MyUtility.getMySessionFactory().openSession();
	String sql1="from LocationMaster L where L.locationName='"+LocationName+"'";
	Query<LocationMaster> list = (Query<LocationMaster>)session.createQuery(sql1);
    try {
	LocationMaster lm1 = (LocationMaster) list.getSingleResult();
    int id= lm1.getLocationId();
    return id;
    }catch (NoResultException e) {
		return 0;
	}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<FlightMaster> getFlightDetails(int srcId, int destId, String bookingDate) {
		Session session = MyUtility.getMySessionFactory().openSession();
		String sql1="from FlightMaster f where f.locationMaster1.locationId='"+srcId+"'and f.locationMaster2.locationId='"+destId+"' and f.departDate='"+bookingDate+"'";
		Query<FlightMaster> list = (Query<FlightMaster>)session.createQuery(sql1);
	    
		List<FlightMaster> fm = list.getResultList();
		
		return  fm;
	    	
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<FlightMaster> getAscending(int srcId, int destId, Date  bookingDate) {
		Session session = MyUtility.getMySessionFactory().openSession();
		String sql1="from FlightMaster f where f.locationMaster1.locationId='"+srcId+"'and f.locationMaster2.locationId='"+destId+"' and f.departDate='"+bookingDate+"'order by fare ASC";
		Query<FlightMaster> list = (Query<FlightMaster>)session.createQuery(sql1);
	    
		List<FlightMaster> fm = list.getResultList();
		
		return  fm;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<FlightMaster> getDescending(int srcId, int destId, Date  bookingDate) {
		Session session = MyUtility.getMySessionFactory().openSession();
		String sql1="from FlightMaster f where f.locationMaster1.locationId='"+srcId+"'and f.locationMaster2.locationId='"+destId+"' and f.departDate='"+bookingDate+"' order by fare DESC";
		Query<FlightMaster> list = (Query<FlightMaster>)session.createQuery(sql1);
	    
		List<FlightMaster> fm = list.getResultList();
		
		return  fm;
	}

	/*@Override
	public List<FlightMaster> getFlightDetails(int srcId, int destId) {
		Session session = MyUtility.getMySessionFactory().openSession();
		String sql1="from FlightMaster f where f.locationMaster1.locationId='"+srcId+"'and f.locationMaster2.locationId='"+destId+"'";
		Query<FlightMaster> list = (Query<FlightMaster>)session.createQuery(sql1);
	    List<FlightMaster> fm = list.getResultList();
	   // System.out.println(((FlightMaster) fm).getFNo());
	    //String fId = ((FlightMaster) fm).getFNo();
		return  fm;
	}*/

	/*	@Override
	public LocationMaster getLname(long locationId) {
		Connection con;
		LocationMaster lmaster = null;
		
		try {
			 con = MyUtility.getMydataSource().getConnection();
			 String sql = "select * from location_master where location_id=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setLong(1, locationId);
			ResultSet rst = pst.executeQuery();
			while(rst.next()) {
				if(lmaster==null) {
					lmaster = new LocationMaster();
					lmaster.setLocationId(rst.getInt("location_id"));
					lmaster.setLocationName(rst.getString("location_name"));
												
				}
								
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lmaster;
	}*/

}
