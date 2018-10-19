package com.mphasis.dao;

import org.hibernate.Session;

//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//
//import org.hibernate.query.Query;
//import org.hibernate.Session;
//
//import com.mphasis.model.dto.BookingInfo;
//import com.mphasis.model.dto.Customer;
//import com.mphasis.model.dto.FlightMaster;
import com.mphasis.myutils.MyUtility;

public class CancelDAOImple implements CancelDAO {

	@SuppressWarnings("rawtypes")
	@Override
	public int cancelBooking(int bookId) {
		int res = 1;
		Session session = MyUtility.getMySessionFactory().openSession();
		try {
		session.getTransaction().begin();
//		String sql1="delete from BookingInfo where bookingId='"+bookId+"'";
		session.createQuery
		("delete from BookingInfo where bookingId='"+bookId+"'").executeUpdate();
		session.getTransaction().commit();	
		}catch(Exception e) {
			e.printStackTrace();
			res=0;
		}
		return res;
	}

}
