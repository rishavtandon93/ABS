$(function() {

$("#loginvalid").validate({
rules: {
	email: {

        required: true,
        email: true
                                                                                                 
	},

password: {
    required: true,
  
}

}
});


	





$("#registervalid").validate({
	rules: {
		custName: {
	        required: true,
	        nowhitespace: true,
	        lettersonly: true,
	        maxlength: 20
		},
		dob: {
			required: true,
	        date: true
				

		},
		
		email: {
	        required: true,
	        email:true
	        },
		
		password: {

		    required: true,
		    minlength:5,
		    maxlength:12
	     	},
		
	}
	});


	





$("#searchvalid").validate({
	rules: {
		from: {
	        required: true,
	        nowhitespace: true,
	        lettersonly: true,
	        maxlength: 20
		},
		to: {
			required: true,
			 nowhitespace: true,
		        lettersonly: true,
		        maxlength: 20
			   	

		},
		
		date: {
	        required: true
	        
	        
	    

		},
		seats: {

		    required: true,
		    range:[1,200]
	     	}
		
	}
	});










});







