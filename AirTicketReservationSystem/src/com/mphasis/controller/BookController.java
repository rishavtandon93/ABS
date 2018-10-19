package com.mphasis.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.mphasis.dao.BookDAOImple;
import com.mphasis.dao.LocationMasterDAOImple;
import com.mphasis.model.dto.AirlineMaster;
import com.mphasis.model.dto.BookingInfo;
import com.mphasis.model.dto.Customer;
import com.mphasis.model.dto.FlightMaster;


@Controller
@SessionAttributes({"lfm","pbi","pb"})
public class BookController {

	FlightMaster flm = new FlightMaster();
	BookingInfo paymentbi = new BookingInfo();
	AirlineMaster arm = new AirlineMaster();
	Customer crm = new Customer();
	@RequestMapping(value="/book", method=RequestMethod.POST)
	public String confirmTicket(Model model,@RequestParam(value="myradio") String fno,
			                 @RequestParam(value="seats") int seats,BookDAOImple bd) {
		
		
		List<FlightMaster> lm = bd.getBookingDeets(fno);
		Date depdate = lm.get(0).getDepartDate();
		int price = lm.get(0).getFare();
		paymentbi = bd.addBooking(fno, 1,seats,price,depdate);
		flm.setFNo(fno); 
		flm.setFare(lm.get(0).getFare());
		flm.setDepartDate(lm.get(0).getDepartDate());
		flm.setAvaSeats(seats);
		arm.setAName(lm.get(0).getAirlineMaster().getAName());
		flm.setAirlineMaster(arm);
		model.addAttribute("pbi", paymentbi);
		model.addAttribute("lfm", flm);
		return "confirm";
		
	}
	
/*	@RequestMapping(value="/payment", method=RequestMethod.POST)
	public String bookTicket(Model model,@RequestParam(value="myradio") String fno,
			                 @RequestParam(value="seats") int seats,BookDAOImple bd) {
		
		
		List<FlightMaster> lfm = bd.getBookingDeets(fno);
		Date depdate = lfm.get(0).getDepartDate();
		int price = lfm.get(0).getFare();
		//bd.addBooking(fno, 1,seats,price,depdate);
		BookingInfo paymentbi = bd.addBooking(fno, 1,seats,price,depdate);
		FlightMaster flm = new FlightMaster();
		flm.setFNo(fno);
	    System.out.println(paymentbi);
		model.addAttribute("pbi", paymentbi);
		model.addAttribute("lfm", flm);
		return "confirm";
		
	}*/
	
	@RequestMapping(value="/payment", method=RequestMethod.POST)
	public String bookTicket(Model model,
			                 BookDAOImple bd) {
		
		
		//List<FlightMaster> lfm = bd.getBookingDeets(fno);
		//Date depdate = lfm.get(0).getDepartDate();
		//int price = lfm.get(0).getFare();
		//bd.addBooking(fno, 1,seats,price,depdate);
		String fno=flm.getFNo();
		int seats = flm.getAvaSeats();
		int price = flm.getFare();
		Date depdate = flm.getDepartDate();
		System.out.println("fno "+fno);
		System.out.println("seats "+seats);
		BookingInfo paymentbi = bd.confirmBooking(fno, 1,seats,price,depdate);
	    System.out.println(paymentbi.getCustomerMaster().getCustName());
	    crm.setCustName(paymentbi.getCustomerMaster().getCustName());
		model.addAttribute("pb", paymentbi);
		return "Success";
		
	}
	
	@RequestMapping(value="/bookfinal", method=RequestMethod.POST)
	public String pongping() {
		
		return "payment";
		
	}
}
