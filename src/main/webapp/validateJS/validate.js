(function($, W, D) {
	var JQUERY4U = {};

	JQUERY4U.UTIL = {
		setupFormValidation : function() {
			
			// product master form validation
			$("#registration-Form").validate({
				rules : {
					'customer.customerName' : {
						required : true,
						lettersonly : true,
						specialChar:true
					},
					'customer.mobileNumber' : {
						required : true,
						number : true,
						EqualTo:true
					},
					'customer.email' : {
						required : true,
						email : true
					},
					'customer.address' : {
						required : true
					},
					'customer.adharNumber' : {
						required : true
					},
					'adharFile' : {
						
						required : true
					},
					'passportFile' : {
						specialChar:true,
						required : true
					},
					'dLFile' : {
						
						required : true
					},
					'customer.dob':{
						required:true
					},
					'customer.dlNumber':{
						specialChar:true,
						required:true
					},
					'customer.dlExpiryDate':{
						required:true
					},
					'customer.securityQuestion':{
						required:true
					},
					'customer.securityAnswer':{
						required:true
					},
					'customer.contactPerson':{
						specialChar:true,
						required:true
					},
					'customer.contactNumber':{
						required:true,
						number : true,
						EqualTo:true
					},
					'customer.dlExpiryDate':{
						required:true
					},
					'customer.pickupLocation':{
						required:true
					}
			
				},
				messages : {
					'customer.customerName' : {
						required : "Please enter customer name",
						lettersonly : "Letters only please!",
						specialChar : "Letters only please!"
					},
					'customer.mobileNumber' : {
						required : "Please enter Mobile Number",
						EqualTo:"value must be of 10 digit"
					},
					'customer.contactNumber': {
						required : "Please enter Mobile Number",
						EqualTo:"value must be of 10 digit"
					},
				},
				submitHandler : function(form) {
					form.submit();
				}
			});
			
		}
	}

	// when the dom has loaded setup form validation rules
	$(D).ready(function($) {
		JQUERY4U.UTIL.setupFormValidation();
	});

	jQuery.validator.addMethod("lettersonly", function(value, element) {
		return this.optional(element) || value == value.match(/^[a-zA-Z\s]+$/);
	});

	jQuery.validator.addMethod("alphaNumericonly", function(value, element) {
		return this.optional(element)
				|| value == value.match(/^[a-zA-Z0-9\s]+$/);
	});
	
	jQuery.validator.addMethod('lessThanEqual', function(value, element, param) {
	    return this.optional(element) || parseInt(value) <= 8;
	});
	jQuery.validator.addMethod('EqualTo', function(value, element, param) {
		 return this.optional(element) || (/^\d{10,}$/).test(value.replace(/[\s()+\-\.]|ext/gi, ''));
	});
	$.validator.addMethod('filesize', function(value, element, param) {
	   
	    return this.optional(element) || (element.files[0].size <= param) ;
	});
	$.validator.addMethod("specialChar", function(value, element) {
	     return this.optional(element) || /([0-9a-zA-Z\s])$/.test(value);
	  });
	

})(jQuery, window, document);
