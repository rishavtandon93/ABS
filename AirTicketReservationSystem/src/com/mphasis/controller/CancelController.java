package com.mphasis.controller;

//import java.util.Date;
//import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//import com.mphasis.dao.BookDAOImple;
import com.mphasis.dao.CancelDAOImple;
//import com.mphasis.model.FlightMaster;


@Controller
public class CancelController {
	
//	int result = 0;
	@RequestMapping(value="/cancel", method=RequestMethod.POST)
	public String confirmTicket(Model model,@RequestParam(value="bookid") int bId,
			                 CancelDAOImple cd) {
		
		int result = cd.cancelBooking(bId);
		if(result==0) {
			return "Failure";
		}
		return "cancel";
		
	}

}
