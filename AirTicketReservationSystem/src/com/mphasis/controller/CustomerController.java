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
	
	@Autowired
	CustomerDao customerDao;

	
	/*@RequestMapping(method=RequestMethod.POST,value="/register")
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
	}*/
Customer cust=null;
	
	@RequestMapping(method=RequestMethod.POST,value="/register")
	public String registerCustomer(Customer customer,Model model) {
		
		
		
		try {
			
			  //Long id = new CustomerDao().save(customer);
			Long id=customerDao.save(customer);
			
			
			System.out.println(id);
			 model.addAttribute("cus",customer);
			 return "login";
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/loginn")
	public String loginCustomer(Model model,Customer customer) {
		this.cust=customer;
		
		try {
			String email = cust.getEmail();
			String password = cust.getPassword();
			System.out.println(email);
			System.out.println(password);
			
			
			
			
			/*String email = request.getParameter("email");
			String password = request.getParameter("password");*/
			
			//@SuppressWarnings("unused")
			Customer customer1 = customerDao.getByEmailandPassword(email,password);
			System.out.println(customer1.getCustName());
			//Customer custo =(Customer) new CustomerDao().save(customer);
			
			//System.out.println(customer1.getCustName());
			
			model.addAttribute("cust",customer1);
			model.addAttribute("custo", customer1);
			cust=customer1;
			return "searchPage";
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("login failure");
			return "login";
		}
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/redirectToRegister")
	public String pingPong()
	{
		return "register";
	}
	
	@RequestMapping(value = "/popoye", method = RequestMethod.GET)
	
	public String pingPongAgain() {
		
		return "searchPage";
		}
		

	
	
	

	
	

}
