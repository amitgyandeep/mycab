<%@ taglib prefix="s" uri="/struts-tags"%>
<html lang="en"><head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Orange Self Drive</title>
	
    <!-- css -->
    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link type="text/css" rel="stylesheet" href="font-awesome/css/font-awesome.min.css">
	<link rel="stylesheet" href="css/nivo-lightbox.css">
	<link type="text/css" rel="stylesheet" href="css/nivo-lightbox-theme/default/default.css">
	<link media="screen" rel="stylesheet" href="css/owl.carousel.css">
    <link media="screen" rel="stylesheet" href="css/owl.theme.css">
	<link rel="stylesheet" href="css/flexslider.css">
	<link rel="stylesheet" href="css/animate.css">
    <link rel="stylesheet" href="css/bootstrap-social.css">
    <link href="css/style.css" rel="stylesheet">
	<link href="color/default.css" rel="stylesheet">
	 <link rel="stylesheet" href="css/datepicker.css">
<style>
.header-text h2 span {
    border-radius: 1px 1px 14px 14px;
    color: #fff;
    padding: 7px 60px 1px 45px;
    text-transform: uppercase;
}
.header-text h3 span {
    color: #fff;
    font-size: 20px;
    font-weight: 100;
    text-transform: uppercase;
}
.profile span,.profile div,.profile h6{
	color:#fff;
}
.img-profile{
	border-radius:100px;
	border:2px solid #fff;
}
.upload{
	margin-top:-2px;
}
.btn-default {
    background-color: #fff;
    border-color: #ccc;
    color: #333;
}
.btn-default:hover {
    background-color:#E6E6E6;
    border-color: #ccc;
    color: #333;
}
span a {
    color: #fff;
}
span a:hover {
    color: #000;
}
</style>
<style type="text/css">
.table-condensed > thead > tr > th, .table-condensed > tbody > tr > th, .table-condensed > tfoot > tr > th, .table-condensed > thead > tr > td, .table-condensed > tbody > tr > td, .table-condensed > tfoot > tr > td {
    padding: 2px;
}
</style>
 <style>
.error, label{
	color:red;
}
</style> 


</head>

<body id="page-top" data-spy="scroll" data-target=".navbar-custom">
<div class="container">
<div class="row">
<div class="col-lg-9"></div>
<div class="col-lg-3"><p style="float:right;"><img src="img/live-support.png" style="float:left;"><a href="userLogin" class="top-link">SIGN IN</a><a href="#" class="top-link">FAQs</a><a href="#" class="top-link">Link</a></p></div>

</div>

</div>
	
	<div id="navigation-sticky-wrapper" class="sticky-wrapper" style="height: 92px;"><div style="height: 108px;" class="sticky-wrapper is-sticky" id="navigation-sticky-wrapper"><div style="height: 108px; position: relative; top: -20px;" class="sticky-wrapper" id="navigation-sticky-wrapper"><div id="navigation-sticky-wrapper" class="sticky-wrapper is-sticky" style="height: 108px;"><div id="navigation-sticky-wrapper" class="sticky-wrapper is-sticky" style="height: 108px;"><div id="navigation-sticky-wrapper" class="sticky-wrapper" style="height: 107px;"><div id="navigation-sticky-wrapper" class="sticky-wrapper is-sticky" style="height: 107px;"><div id="navigation-sticky-wrapper" class="sticky-wrapper is-sticky" style="height: 107px;"><div id="navigation-sticky-wrapper" class="sticky-wrapper is-sticky" style="height: 107px;"><div id="navigation-sticky-wrapper" class="sticky-wrapper is-sticky" style="height: 107px;"><div id="navigation-sticky-wrapper" class="sticky-wrapper is-sticky" style="height: 107px;"><div style="height: 107px;" class="sticky-wrapper" id="navigation-sticky-wrapper"><div id="navigation-sticky-wrapper" class="sticky-wrapper" style="height: 107px;"><div id="navigation-sticky-wrapper" class="sticky-wrapper" style="height: 107px;"><div style="height: 112px;" class="sticky-wrapper is-sticky" id="navigation-sticky-wrapper"><div id="navigation-sticky-wrapper" class="sticky-wrapper is-sticky" style="height: 112px;"><div style="height: 112px;" class="sticky-wrapper is-sticky" id="navigation-sticky-wrapper"><div id="navigation-sticky-wrapper" class="sticky-wrapper is-sticky" style="height: 112px;"><div style="height: 112px;" class="sticky-wrapper is-sticky" id="navigation-sticky-wrapper"><div style="height: 112px;" class="sticky-wrapper is-sticky" id="navigation-sticky-wrapper"><div style="height: 112px;" class="sticky-wrapper is-sticky" id="navigation-sticky-wrapper"><div style="height: 113px;" class="sticky-wrapper is-sticky" id="navigation-sticky-wrapper"><div style="height: 112px;" class="sticky-wrapper is-sticky" id="navigation-sticky-wrapper"><div style="height: 112px;" class="sticky-wrapper is-sticky" id="navigation-sticky-wrapper"><div id="navigation-sticky-wrapper" class="sticky-wrapper is-sticky" style="height: 112px;"><div style="height: 112px;" class="sticky-wrapper is-sticky" id="navigation-sticky-wrapper"><div id="navigation-sticky-wrapper" class="sticky-wrapper is-sticky" style="height: 112px;"><div style="height: 112px;" class="sticky-wrapper" id="navigation-sticky-wrapper"><div style="height: 112px;" class="sticky-wrapper" id="navigation-sticky-wrapper"><div id="navigation-sticky-wrapper" class="sticky-wrapper is-sticky" style="height: 112px;"><div id="navigation" style="position: fixed; top: 0px;">
        
        <nav role="navigation" class="navbar navbar-custom">
                              <div class="container">
                                    <div class="row">
                                          <div class="col-md-4">
                                                   <div class="site-logo">
                                                            <a class="brand" href="dashboard"><img src="img/logo.png"></a>
                                                    </div>
                                          </div>
                                          

                                          <div class="col-md-8">
                         
                                                      <!-- Brand and toggle get grouped for better mobile display -->
                                          <div class="navbar-header">
                                                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#menu">
                                                <i class="fa fa-bars"></i>
                                                </button>
                                          </div>
                                                      <!-- Collect the nav links, forms, and other content for toggling -->
                                                     <div id="menu" class="navbar-collapse collapse" style="height: 1px;">
                                                            <ul class="nav navbar-nav navbar-right">
                                                                  <li class=""><a href="dashboard">Home</a></li>
                                                                  <li class=" "><a href="osd">OSD</a></li>
																   <li class=""><a href="tripMachines">Trip Machines</a></li>
                                                                  <li class=""><a href="tariffs">Tariffs</a></li>	
                                                                  <li><a href=" ">Blog</a></li>				                                                                  
                                                                  
                                                                  <li class=""><a href=" ">Contact</a></li>
                                                            </ul>
                                                      </div>
                                                      <!-- /.Navbar-collapse -->
                             
                                          </div>
                                    </div>
                              </div>
                              <!-- /.container -->
                        </nav>
    </div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div>

    <section class="home-section color-dark bg-white">
  <div class="container">
<div class="row">
      
     <div class="col-sm-3 pull-right text-right">Home &gt; <a href="#">User Registration Page</a>
      </div>
      
        </div>
<div class="row">
      
     <div class="col-sm-3 pull-right text-right">
<img src="img/share-link.png">
  </div>
      
        </div>
  </div>



<section class="home-section color-dark bg-white">

  
  
      <div class="container">

		
       <div class="row ">
		
		<div class="col-md-4">
        <div class="row left-aside-osd">
        <div class="col-lg-12">    
        <h4>SIGN UP</h4>
        <p style="color:#000;">exclusive access for offer and promotions</p>
<form novalidate="novalidate" id="newsletter-form" class="content-form clearfix" action="#" method="post">
                        <input type="text" value="Enter your Email Address">
                        <input type="submit" value="Go" style="background:#000000;">
                        </form>
                        </div>
                        </div>
                        <div class="row left-aside-osd">
                        <div class="col-lg-12">
  <h4>QUICK CONTACT <img src="img/shite-supports.png"></h4>
            </div>


            </div>
<div class="row" style="border-top:10px solid #fff;">
<div class="col-lg-12">
  <h4>DOWNLOAD APP</h4>
    <a href="#"><img src="img/google-play.png"></a>
            </div>
</div>
		</div>
<div class="col-md-8">
  <h3>Registration Form</h3>
<br>
<div class="row">
<s:if test="#request.saved=='saved'">
   <div style="color:green;">
      Registration Successfully Completed 
   </div>
</s:if>

	<s:if test="#request.errorOccured=='errorOccured'">
							
								<li style="color: red;">something went wrong</li>
							
						</s:if>
	<s:if test="#request.inuseEmail=='inuseEmail'">
							
								<li style="color: red;">Email is in use</li>
							
						</s:if>
	<s:if test="#request.inuseMobile=='inuseMobile'">
							
								<li style="color: red;">Mobile Number is in use</li>
							
						</s:if>
<s:form class="form-signin" enctype="multipart/form-data" method="post" action="registrationAction" theme="simple"  id="registration-Form"  >
<div class="col-lg-4">        
  <label class="sr-only" for="name">Name</label>
        <input type="text" autofocus="" required="" placeholder="Name" class="form-control"  name="customer.customerName" value='<s:property value="#request.customer.customerName"/>' />
  <br>
        <label class="sr-only" for="inputEmail">Email address</label>
        <input type="text" autofocus="" required="" id="customerEmail" placeholder="Email address" class="form-control"  name="customer.email" value='<s:property value="#request.customer.email"/>' />
  <br>
  <label class="sr-only" for="inputEmail">Mobile</label>
        <input type="text" autofocus="" required="" placeholder="Mobile" class="form-control" name="customer.mobileNumber" maxlength="10" value='<s:property value="#request.customer.mobileNumber"/>' />
  <br>
        <label class="sr-only" for="inputPassword">Address</label>
        <input type="text" required="" placeholder="Address" class="form-control"  name="customer.address" value='<s:property value="#request.customer.address"/>' />
  
  <br>
  <label class="sr-only" for="inputEmail">Date of Birth</label>
        <input type="text" autofocus="" required="" placeholder="Date of Birth" class="form-control" id="datepicker" name="customer.dob" value='<s:property value="#request.customer.dob"/>' />
  <br>
  <label class="sr-only" for="inputEmail">Emergency Contact Name</label>
        <input type="text" autofocus="" required="" placeholder="Emergency Contact Name" class="form-control"  name="customer.contactPerson" value='<s:property value="#request.customer.contactPerson"/>' />
  <br>
  <label class="sr-only" for="inputEmail">Emergency Contact Number</label>
        <input type="text" maxlength="10" autofocus="" required="" placeholder="Emergency Contact Number" class="form-control"  name="customer.contactNumber" value='<s:property value="#request.customer.contactNumber"/>' />
  <br>
       
</div>
  

<div class="col-lg-4">        
        <label for="inputEmail" class="sr-only">Aadhar Card No.</label>
        <input type="text"  class="form-control" placeholder="Aadhar Card No." required="" autofocus="" name="customer.adharNumber" value='<s:property value="#request.customer.adharNumber"/>' />
  <br>
  <label for="inputEmail" class="sr-only">Passport No</label>
        <input type="text"  class="form-control" placeholder="Passport No" required="" autofocus="" name="customer.passportNumber" value='<s:property value="#request.customer.passportNumber"/>' />
  <br>
        <label for="inputPassword" class="sr-only">DL No.</label>
        <input type="text"  class="form-control" placeholder="DL No." required="" name="customer.dlNumber" value='<s:property value="#request.customer.dlNumber"/>' />
  
  <br>
  <label for="inputEmail" class="sr-only">DL Issuing Authority</label>
        <input type="text"  class="form-control" placeholder="DL Issuing Authority" required="" autofocus="" name="customer.drivingLicenceauthority" value='<s:property value="#request.customer.drivingLicenceauthority"/>' />
  <br>
  <label for="inputEmail" class="sr-only">DL Issuing State</label>
        <input type="text"  class="form-control" placeholder="DL Issuing State" required="" autofocus="" name="customer.drivingLicenceLocation"  value='<s:property value="#request.customer.drivingLicenceLocation"/>' />
  <br>
  <label for="inputEmail" class="sr-only">Preferred Car</label>
        <input type="text"  class="form-control" placeholder="Preferred Car" required="" autofocus="" name="customer.preferedCar"  value='<s:property value="#request.customer.preferedCar"/>' />
<br>
  <label for="inputEmail" class="sr-only">Preferred Hub</label>
        <input type="text"  class="form-control" placeholder="Preferred Hub" required="" autofocus="" name="customer.pickupLocation" value='<s:property value="#request.customer.pickupLocation"/>' />
  <br>
       
</div>
<div class="col-lg-3">        
<!-- <a onClick="$('#pdffile').click();" class="btn btn-default upload">Upload image</a> -->
<input type="file"   name="adhar" class="btn btn-default upload" required=""><br/>
<!-- <a class="btn btn-default upload" onClick="$('#pdffile').click();">Upload image</a> -->
<input type="file"   name="passport" class="btn btn-default upload" > <br/>
<!-- <a class="btn btn-default upload" onClick="$('#pdffile').click();">Upload image</a> -->
<input type="file"   name="drivingLicence" class="btn btn-default upload" ><br/>
<div class="row">
<div class="col-lg-11">
	
				<input type="radio" name="customer.sex" value="male" checked="checked">Male
					<input type="radio" name="customer.sex" value="female">Female<br/><br/>
<button class="btn btn-lg btn-denger btn-block" type="submit">Save</button>
<span style="font-size: 11px;line-height: 15px;top: 56px; position:relative;">Please allow 24 hrs to verify your credentials. You will be intimated via sms / email.</span>
</div>
</div>
</div>
</s:form>
  
</div>
</div>

</div>
</div>
	<section class="black-section color-dark bg-black" style="baclground:#000;">
          <div class="container">
          <div class="row">
          <div class="col-lg-4">
          <form method="post" action="#" class="content-form clearfix" id="newsletter-form" novalidate="novalidate">
                        <input type="text" value="Subscribe to our Newsletter">
                        <input type="submit" value="Go">
                        </form>
    
            </div> 
            <!-- /Section: PROMOTERS -->
            <div class="col-lg-4">
            <div class="infobox-orange text-center" style="padding:0px; height:55px;"><h4>PROMOTERS   <img width="100" src="img/orange-cabs.png"></h4></div>
            </div>
            <!-- /Section: PROMOTERS -->
           <!-- /Section: social icon -->
            <div class="col-lg-4">
            <div class="infobox-orange">
           <div class="text-center">
            <a class="btn btn-social-icon btn-facebook" onClick="_gaq.push(['_trackEvent', 'btn-social-icon', 'click', 'btn-facebook']);"><i class="fa fa-facebook"></i></a>
            <a onClick="_gaq.push(['_trackEvent', 'btn-social-icon', 'click', 'btn-google']);" class="btn btn-social-icon btn-google"><i class="fa fa-google-plus"></i></a>
             <a onClick="_gaq.push(['_trackEvent', 'btn-social-icon', 'click', 'btn-twitter']);" class="btn btn-social-icon btn-twitter"><i class="fa fa-twitter"></i></a>
            <a onClick="_gaq.push(['_trackEvent', 'btn-social-icon', 'click', 'btn-instagram']);" class="btn btn-social-icon btn-instagram"><i class="fa fa-instagram"></i></a>
            <a onClick="_gaq.push(['_trackEvent', 'btn-social-icon', 'click', 'btn-linkedin']);" class="btn btn-social-icon btn-linkedin"><i class="fa fa-linkedin"></i></a>
            <a onClick="_gaq.push(['_trackEvent', 'btn-social-icon', 'click', 'btn-pinterest']);" class="btn btn-social-icon btn-pinterest"><i class="fa fa-pinterest"></i></a>
            </div>                 
            </div>
            <!-- /Section: social-icon -->		  
            </div>	
            </div>
</div></section>
	<!-- /Section: about -->
	
	
	<!-- Section: services -->
    
<section class="home-section color-dark bg-white">
      <div class="container">
      <div class="row">
      <div class="col-lg-8 text-center"><a href="#">ADDRESS:</a> Orange Self Drive C-5, Shanti Kunj, Church Road, Opp. D-3, Vasant Kunj, New Delhi - 110 070, INDIA </div>
      <div class="col-lg-4 border"><a href="">Help Line:</a> +91 9871268833<br><a href="#">EMAIL:</a> info@orangeselfdrive.com</div>
      <div></div>
</div></div></section>  
<!-- /Section: services -->
<footer>
		<div class="container">
			<div class="row">
				<div class="col-md-7 col-md-offset-3">
					
					<div class="text-center">
						<a class="totop" href="#intro"><i class="fa fa-angle-up fa-3x"></i></a>

						<p>Copyright 2015 ORANGE SELF DRIVE | All Rights Reserved | Privacy Policy | Terms &amp; Conditions | Disclaimer <a href="http://theparish.in"  target="_blank"> Design:  The Parish </a>|<a href="#"> Powered By:</a><a href="http://www.telematics4u.com" target="_blank">Telematics4u</a>  </p>
					</div>
				</div>
			</div>	
		</div>
	</footer>

    <!-- Core JavaScript Files -->
    <script src="js/jquery.min.js"></script>	 
    <script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.sticky.js"></script>
	<script src="js/jquery.flexslider-min.js"></script>
    <script src="js/jquery.easing.min.js"></script>	
	<script src="js/jquery.scrollTo.js"></script>
	<script src="js/jquery.appear.js"></script>
	<script src="js/stellar.js"></script>
	<script src="js/wow.min.js"></script>
	<script src="js/owl.carousel.min.js"></script>
	<script src="js/nivo-lightbox.min.js"></script>

    <script src="js/custom.js"></script>
 <script src="validateJS/jquery.validate.min.js"></script>
<script src="validateJS/validate.js"></script> 



</section></section>
<script src="js/bootstrap-datepicker.js"></script>
        <script type="text/javascript">
            // When the document is ready
            $(document).ready(function () {
            	var dt = new Date();
            	dt.setFullYear(new Date().getFullYear()-18);
            	
                $('#datepicker').datepicker({
                    format: "dd/mm/yyyy",
                    orientation: "bottom left",
                    endDate:dt,
                   /*  endDate: '+0d', */
                    autoclose: true
                });  
            
            });
        </script>
</body></html>