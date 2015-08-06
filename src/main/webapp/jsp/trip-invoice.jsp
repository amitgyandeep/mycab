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
</head>

<body id="page-top" data-spy="scroll" data-target=".navbar-custom">
<div class="container">
<div class="row">
<div class="col-lg-9"></div>
<div class="col-lg-3"><p style="float:right;"><img src="img/live-support.png" style="float:left;"><a href="logoutAction" class="top-link">SIGN OUT</a><a href="#" class="top-link">FAQs</a><a href="#" class="top-link">Link</a></p></div>

</div>

</div>
	
	<div id="navigation-sticky-wrapper" class="sticky-wrapper" style="height: 92px;"><div style="height: 108px;" class="sticky-wrapper is-sticky" id="navigation-sticky-wrapper"><div style="height: 108px; position: relative; top: -20px;" class="sticky-wrapper" id="navigation-sticky-wrapper"><div id="navigation-sticky-wrapper" class="sticky-wrapper is-sticky" style="height: 108px;"><div id="navigation-sticky-wrapper" class="sticky-wrapper is-sticky" style="height: 108px;"><div id="navigation-sticky-wrapper" class="sticky-wrapper" style="height: 107px;"><div id="navigation-sticky-wrapper" class="sticky-wrapper is-sticky" style="height: 107px;"><div id="navigation-sticky-wrapper" class="sticky-wrapper is-sticky" style="height: 107px;"><div id="navigation-sticky-wrapper" class="sticky-wrapper is-sticky" style="height: 107px;"><div id="navigation-sticky-wrapper" class="sticky-wrapper is-sticky" style="height: 107px;"><div id="navigation-sticky-wrapper" class="sticky-wrapper is-sticky" style="height: 107px;"><div style="height: 107px;" class="sticky-wrapper" id="navigation-sticky-wrapper"><div id="navigation-sticky-wrapper" class="sticky-wrapper" style="height: 107px;"><div id="navigation-sticky-wrapper" class="sticky-wrapper" style="height: 107px;"><div style="height: 112px;" class="sticky-wrapper is-sticky" id="navigation-sticky-wrapper"><div id="navigation-sticky-wrapper" class="sticky-wrapper is-sticky" style="height: 112px;"><div style="height: 112px;" class="sticky-wrapper is-sticky" id="navigation-sticky-wrapper"><div id="navigation-sticky-wrapper" class="sticky-wrapper is-sticky" style="height: 112px;"><div style="height: 112px;" class="sticky-wrapper is-sticky" id="navigation-sticky-wrapper"><div style="height: 112px;" class="sticky-wrapper is-sticky" id="navigation-sticky-wrapper"><div style="height: 112px;" class="sticky-wrapper is-sticky" id="navigation-sticky-wrapper"><div style="height: 113px;" class="sticky-wrapper is-sticky" id="navigation-sticky-wrapper"><div style="height: 112px;" class="sticky-wrapper is-sticky" id="navigation-sticky-wrapper"><div style="height: 112px;" class="sticky-wrapper is-sticky" id="navigation-sticky-wrapper"><div id="navigation-sticky-wrapper" class="sticky-wrapper is-sticky" style="height: 112px;"><div style="height: 112px;" class="sticky-wrapper is-sticky" id="navigation-sticky-wrapper"><div id="navigation-sticky-wrapper" class="sticky-wrapper is-sticky" style="height: 112px;"><div style="height: 112px;" class="sticky-wrapper is-sticky" id="navigation-sticky-wrapper"><div id="navigation-sticky-wrapper" class="sticky-wrapper" style="height: 112px;"><div style="height: 112px;" class="sticky-wrapper" id="navigation-sticky-wrapper"><div id="navigation-sticky-wrapper" class="sticky-wrapper is-sticky" style="height: 112px;"><div style="position: fixed; top: 0px;" id="navigation">
        
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
    </div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div>

    <section class="home-section color-dark bg-white">
  <div class="container">
<div class="row">
      
     <div class="col-sm-3 pull-right text-right">Home &gt; <a href="#">Trip Initial Invoice</a>
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
		
		<div class="col-md-4 profile">
        <div class="row left-aside-osd">
        <div class="row">
<div class="col-lg-6"><span> <a href="#&quot;">My profile</a></span></div><div class="col-lg-6"><span> <a href="#&quot;"> Edit</a></span></div>
</div>
<div class="row">
<div class="col-lg-6"><img class="img-profile" src="img/avatar.png"></div><div class="col-lg-6"><s:property value="#session.customerInSession.customerName"/></div>
</div>
<div class="row">
<h6 class="col-lg-12">Edit Information</h6>
<span class="col-lg-12"><a href="#">Upcoming Events</a><a></a></span>
<span class="col-lg-12"><a href="#">Useful Info / Links</a></span>
<span class="col-lg-12"><a href="#">Upcoming Trips</a></span>
<span class="col-lg-12"><a href="tripDetailAvailability">New Trip</a></span>
<span class="col-lg-12"><a href="showChangePassword">Change password</a></span>

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
<div class="col-md-7">
  <h3>Trip Invoice</h3>
<br>
<div class="row">
<div class="col-lg-9"> 

<div class="row">  
  <span class="col-lg-9"><strong>Security Deposit:</strong></span> <span class="col-lg-3">Rs. <s:property value="#session.tripInvoice.securityDeposit"/></span></div>
<div class="row">  
<span class="col-lg-9">Adnl security deposit (Upgrade) </span><span class="col-lg-3">Rs. . . . . . .  .</span></div>
<div class="row">  
<span class="col-lg-9"><strong>Trip Cost:</strong></span><span class="col-lg-3">Rs. <s:property value="#session.tripInvoice.tripCost"/></span></div>
<s:if test="#session.previousInvoice!=null">
<div class="row">  
<span class="col-lg-9">Reschedule Charges:</span><span class="col-lg-3">Rs. <s:property value="#session.tripInvoice.rescheduleCharges"/></span></div>
<div class="row">  
<span class="col-lg-9">Already Paid:</span><span class="col-lg-3">Rs. <s:property value="#session.tripInvoice.previousPaidCharges"/></span></div>
</s:if>
  <div class="row">  
  <span class="col-lg-9">(See Calculation/Auto Calculated)</span><span class="col-lg-3"></span></div>
  <div class="row">  
  <span class="col-lg-9">Adjusted from Wallet:</span><span class="col-lg-3">Rs. <s:property value="#session.tripInvoice.adjustedFromWallet"/></span></div>
  <div class="row">  
  <span class="col-lg-9">Less Discount:	</span><span class="col-lg-3">Rs. <s:property value="#session.tripInvoice.discount"/></span></div>
  <div class="row">  
  <span class="col-lg-9"><strong>Service Tax: </strong></span><span class="col-lg-3">Rs. <s:property value="#session.tripInvoice.serviceTax"/></span></div>
    <div class="row">  
  <span class="col-lg-9"><strong>Total:</strong></span><span class="col-lg-3"><b>Rs. <s:property value="#session.tripInvoice.total"/></b></span></div>

  
  <div class="row">  
  <span class="col-lg-6">T&amp;C Selection:</span><span class="col-lg-6"></span></div>
 
    <div class="row">  
  <span class="col-lg-6"><form  action="jsp/posttozaakpay.jsp" theme="simple">

<input type="hidden" name="merchantIdentifier" value="c6263df20ab34292b576fc06aedda8d5" />
	<input type="hidden" id="orderId" name="orderId" />


<!-- Not a mandatory parameter ! <input type="hidden" name="returnUrl" value="" /> -->
<input type="hidden" name="buyerEmail" value="achuth.raj@gmail.com"  />
	<input type="hidden" name="buyerFirstName" value="Tejomaya" />
	<input type="hidden" name="buyerLastName" value="Urs" />
	<input type="hidden" name="buyerAddress" value="124" />
	<input type="hidden" name="buyerCity" value="Bangalore" />
<input type="hidden" name="buyerState" value="Karnataka" />
<input type="hidden" name="buyerCountry" value="Indian" /> 
	<input type="hidden" name="buyerPincode" value="560003" />
	<input type="hidden" name="buyerPhoneNumber" value="9945211059" />
<input type="hidden" name="txnType" value="1" />
<input type="hidden" name="zpPayOption" value="1" />
	
	<input type="hidden" name="mode" value="1" />
	<input type="hidden" name="currency" value="INR" />

<input type="hidden" name="amount" value='<s:property value="(#session.tripInvoice.total*100).intValue()"/>' />
<input type="hidden" name="merchantIpAddress" value="127.0.0.1" />
<input type="hidden" name="purpose" value="1" />


<input type="hidden" name="productDescription" value="Zaakpay subscription fee" />
	<input type="hidden" name="txnDate" id="txnDate" />

	
	<script>
	document.getElementById("orderId").value= "OSDTXN" + String(new Date().getTime());
	var today = new Date();
	var dateString = String(today.getFullYear()).concat("-").concat(String(today.getMonth()+1)).concat("-").concat(String(today.getDate()));
	document.getElementById("txnDate").value= dateString;
	</script>


<button class="btn btn-warning" type="submit">Pay Now</button>
</form></span><span class="col-lg-6"></span></div>

</div>

  

<div class="col-lg-3">
<div class="row">
<div class="col-lg-12">

</div>
</div>
<div class="row">
<div class="col-lg-12">
<br>
<br>
<span>Remember to pay the secondary invoice, if applicable, after the trip ends.
</span>
</div>
</div>
</div>


  
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
            <a onClick="_gaq.push(['_trackEvent', 'btn-social-icon', 'click', 'btn-facebook']);" class="btn btn-social-icon btn-facebook"><i class="fa fa-facebook"></i></a>
            <a class="btn btn-social-icon btn-google" onClick="_gaq.push(['_trackEvent', 'btn-social-icon', 'click', 'btn-google']);"><i class="fa fa-google-plus"></i></a>
             <a class="btn btn-social-icon btn-twitter" onClick="_gaq.push(['_trackEvent', 'btn-social-icon', 'click', 'btn-twitter']);"><i class="fa fa-twitter"></i></a>
            <a class="btn btn-social-icon btn-instagram" onClick="_gaq.push(['_trackEvent', 'btn-social-icon', 'click', 'btn-instagram']);"><i class="fa fa-instagram"></i></a>
            <a class="btn btn-social-icon btn-linkedin" onClick="_gaq.push(['_trackEvent', 'btn-social-icon', 'click', 'btn-linkedin']);"><i class="fa fa-linkedin"></i></a>
            <a class="btn btn-social-icon btn-pinterest" onClick="_gaq.push(['_trackEvent', 'btn-social-icon', 'click', 'btn-pinterest']);"><i class="fa fa-pinterest"></i></a>
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
      <div class="col-lg-8 text-center"><a href="#">ADDRESS:</a> Orange SELF DRIVE C-5, Shanti Kunj, Church Road, Opp. D-3, Vasant Kunj, New Delhi - 110 070, INDIA </div>
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

						<p>Copyright 2015 Orange Self Drive | All Rights Reserved | Privacy Policy | Terms &amp; Conditions | Disclaimer <a href="http://theparish.in"  target="_blank"> Design:  The Parish </a>|<a href="#"> Powered By:</a><a href="http://www.telematics4u.com" target="_blank">Telematics4u</a>  </p>
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




</section></section></body></html>