package com.mphasis.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.mphasis.dao.LocationMasterDAOImple;
import com.mphasis.model.dto.FlightMaster;
import com.mphasis.model.dto.LocationMaster;

import com.mphasis.myutils.MyUtility;

@Controller
@SessionAttributes("fm")
public class FirstController {
	
	
	@RequestMapping(value="/search", method=RequestMethod.POST)
	public String getLocation(Model model,HttpServletRequest request,LocationMasterDAOImple lm) {
		String  flyDate= null;
		String src = request.getParameter("location_name");
		String dest = request.getParameter("location_name1");
		
			flyDate = request.getParameter("flyDate");
			//SimpleDateFormat bookingDate= new SimpleDateFormat("YYYY-MM-DD");
			//date = bookingDate.format(flyDate);
			//System.out.println("Date"+date);
		
		
		System.out.println("src "+src);
		System.out.println("dest "+dest);
		System.out.println("dop "+flyDate);
		System.out.println("printing"+MyUtility.getMySessionFactory());
		
		int src_Id= lm.getLId(src);
		if(src_Id==0) {
			return "Redirect";
		}
		System.out.println(src_Id+"src_id");
		
		int dest_Id=lm.getLId(dest);
		if(dest_Id==0) {
			return "Redirect";
		}
		System.out.println(dest_Id+"dest_id");
		
		List <FlightMaster> fm = lm.getFlightDetails(src_Id, dest_Id, flyDate);
		if(fm.isEmpty()) {
			return "Redirect";
		}
		System.out.println("fm"+fm);
		model.addAttribute("fm",fm);
	
		return "SuccessMine";
		
	}

	
	@RequestMapping(value="/ascend", method=RequestMethod.POST)
	public String sortAscend(Model model, LocationMasterDAOImple lm1,HttpServletRequest request) {
//		Session session = MyUtility.getMySessionFactory().openSession();
		HttpSession session = request.getSession();
		List<FlightMaster> li = (ArrayList<FlightMaster>)session.getAttribute("fm");;
		Date  flyDate= li.get(0).getDepartDate();
		int src_Id = li.get(0).getLocationMaster1().getLocationId();
		int dest_Id = li.get(0).getLocationMaster2().getLocationId();
		
			
		List <FlightMaster> fm = lm1.getAscending(src_Id, dest_Id, flyDate);
		if(fm.isEmpty()) {
			return "Redirect";
		}
		System.out.println("fm"+fm);
		model.addAttribute("fm",fm);
	
		return "SuccessMine";
		
	}
	@RequestMapping(value="/descend", method=RequestMethod.POST)
	public String sortDescend(Model model, LocationMasterDAOImple lm2,HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		List<FlightMaster> li = (ArrayList<FlightMaster>)session.getAttribute("fm");;
		Date  flyDate= li.get(0).getDepartDate();
		int src_Id = li.get(0).getLocationMaster1().getLocationId();
		int dest_Id = li.get(0).getLocationMaster2().getLocationId();
		List <FlightMaster> fm = lm2.getDescending(src_Id, dest_Id, flyDate);
		if(fm.isEmpty()) {
			return "Redirect";
		}
		System.out.println("fm"+fm);
		model.addAttribute("fm",fm);
	
		
		return "SuccessMine";
	}
	
	@RequestMapping(value = "/popoye", method = RequestMethod.GET)
	public String pingpong() {
		return "searchPage";
	}



}
