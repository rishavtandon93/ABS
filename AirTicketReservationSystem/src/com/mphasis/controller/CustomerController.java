package com.mphasis.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mphasis.dao.CustomerDao;
import com.mphasis.model.dto.Customer;

@Controller
public class CustomerController {
	
	/*@RequestMapping(method=RequestMethod.POST,value="/")
	public String getOne(){
		return "login";
	}*/
	
	@RequestMapping(method=RequestMethod.POST,value="/register")
	public String registerCustomer(
			HttpServletRequest request) {
		
		try {
			
			String startDateStr = request.getParameter("dob");
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date date = sdf.parse(startDateStr);
			
			Customer customer = new Customer();
			customer.setCustName(request.getParameter("custName"));
			customer.setDob(date);
			customer.setEmail(request.getParameter("email"));
			customer.setPassword(request.getParameter("password"));
			
			new CustomerDao().save(customer);
			
			
			
			return "login";
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/loginn")
	public String loginCustomer(HttpServletRequest request,	Model model) {
		
		try {
			
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			
			Customer customer = new CustomerDao().getByEmailandPassword(email,password);
			
			
			System.out.println(customer.getCustName());
			
			model.addAttribute("customer",customer);
			
			return "searchPage";
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("login failure");
			return null;
		}
	}
	
	

}
