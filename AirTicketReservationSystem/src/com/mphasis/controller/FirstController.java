package com.mphasis.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

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
		
		
		System.out.println("src "+src);
		System.out.println("dest "+dest);
		System.out.println("dop "+flyDate);
		System.out.println("printing"+MyUtility.getMySessionFactory());
		
		int src_Id= lm.getLId(src);
		System.out.println(src_Id+"src_id");
		
		int dest_Id=lm.getLId(dest);
		System.out.println(dest_Id+"dest_id");
		
		List <FlightMaster> fm = lm.getFlightDetails(src_Id, dest_Id, flyDate);
		System.out.println("fm"+fm);
		model.addAttribute("fm",fm);
	
		
		return "SuccessMine";
		
	}

}
