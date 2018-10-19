package com.mphasis.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import javax.persistence.NoResultException;
import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.mphasis.model.dto.BookingInfo;
import com.mphasis.model.dto.Customer;
import com.mphasis.model.dto.FlightMaster;
import com.mphasis.model.dto.LocationMaster;
import com.mphasis.myutils.MyUtility;

public class BookDAOImple implements BookDAO {

	/*@SuppressWarnings("unchecked")
	@Override
	public void addBooking(String flightno, int custid, int seats,int price, Date depdate) {
		Session session = MyUtility.getMySessionFactory().openSession();
		session.beginTransaction();
		BookingInfo bi = new BookingInfo();
		FlightMaster fg = new FlightMaster();
		CustomerMaster cm = new CustomerMaster();
		fg.setFNo(flightno);
		cm.setCId(custid);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDateTime now = LocalDateTime.now();
		bi.setBookingDate(dtf.format(now));
		bi.setFlightMaster(fg);
		bi.setCustomerMaster(cm);
		bi.setSeatsBook(seats);
		bi.setPrice(price);
		bi.setDepartDate(depdate);
		session.save(bi);
		session.getTransaction().commit();
		

}*/
	
	@SuppressWarnings("unchecked")
	@Override
	public BookingInfo addBooking(String flightno, int custid, int seats,int price, Date depdate) {
		//Session session = MyUtility.getMySessionFactory().openSession();
		//session.beginTransaction();
		BookingInfo bi = new BookingInfo();
		FlightMaster fg = new FlightMaster();
		Customer cm = new Customer();
		fg.setFNo(flightno);
		cm.setcId(custid);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDateTime now = LocalDateTime.now();
		bi.setBookingDate(dtf.format(now));
		bi.setFlightMaster(fg);
		bi.setCustomerMaster(cm);
		bi.setSeatsBook(seats);
		bi.setPrice(price);
		bi.setDepartDate(depdate);
		//session.save(bi);
		//session.getTransaction().commit();
		return bi;
		

}
	
	@SuppressWarnings("unchecked")
	@Override
	public BookingInfo confirmBooking(String flightno, int custid, int seats,int price, Date depdate) {
		Session session = MyUtility.getMySessionFactory().openSession();
		session.beginTransaction();
		BookingInfo bkg = new BookingInfo();
		FlightMaster ftm = new FlightMaster();
		Customer ctm = new Customer();
		ftm.setFNo(flightno);
		ctm.setcId(custid);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDateTime now = LocalDateTime.now();
		bkg.setBookingDate(dtf.format(now));
		bkg.setFlightMaster(ftm);
		bkg.setCustomerMaster(ctm);
		bkg.setSeatsBook(seats);
		bkg.setPrice(price);
		bkg.setDepartDate(depdate);
		session.save(bkg);
		session.getTransaction().commit();
		return bkg;
		

}

	@SuppressWarnings("unchecked")
	@Override
	public List<FlightMaster> getBookingDeets(String flightno) {
		Session session = MyUtility.getMySessionFactory().openSession();
		String sql1="from FlightMaster f where f.fNo='"+flightno+"'";
		Query<FlightMaster> list = (Query<FlightMaster>)session.createQuery(sql1);
	    
		List<FlightMaster> fm = list.getResultList();
		
		return  fm;
		
	}
}
/*
@SuppressWarnings("unchecked")
@Override
public int addBooking(String flightno, int custid, int seats,int price, Date depdate) {
	int rst=0;
	DataSource ds = MyUtility.getMydataSource();
	try {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDateTime now = LocalDateTime.now();
		System.out.println("from system date"+dtf.format(now));
		String sql = "insert into booking_info(booking_date,f_no,c_id,seats_book,price,depart_date) values"
				+ "('"+dtf.format(now)+"' as booking_date,'"+flightno+"' as f_no,'"+custid+"' as c_id,'"+seats+"'"
						+ "as seats_book,select fare from flight_master where f_no='"+flightno+"',"
								+ "select depart_date from flight_master where f_no='"+flightno+"')";
		PreparedStatement stmt =ds.getConnection()
			.prepareStatement(sql);
		 rst = stmt.executeUpdate();
		 System.out.println("rst "+rst);
		//stmt.setString();
		//stmt.setString();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

		return rst;

}*/
