<%@ taglib prefix="s" uri="/struts-tags"%>
<html lang="en"><head>
    <meta charset="utf-8">
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta content="" name="description">
    <meta content="" name="author">

    <title>Orange Self Drive | Customers</title>
	
    <!-- css -->
    <link rel="icon" type="image/x-icon" href="img/favicon.ico">
    <link type="text/css" rel="stylesheet" href="css/bootstrap.min.css">
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
	<link href="css/nivo-lightbox.css" rel="stylesheet">
	<link href="css/nivo-lightbox-theme/default/default.css" rel="stylesheet" type="text/css">
	<link href="css/owl.carousel.css" rel="stylesheet" media="screen">
    <link href="css/owl.theme.css" rel="stylesheet" media="screen">
	<link href="css/flexslider.css" rel="stylesheet">
	<link href="css/animate.css" rel="stylesheet">
    <link href="css/bootstrap-social.css" rel="stylesheet">
    <link rel="stylesheet" href="css/style.css">
	<link rel="stylesheet" href="color/default.css">
<link rel="stylesheet" type="text/css" href="css/jquery.dataTables.css">
<script src="js/jquery.dataTables.js"></script>
<link rel="stylesheet" href="css/jquery.dataTables.css" type="text/css" media="all" />
	
<style type="text/css">
    ul{
        padding: 0;
        list-style: none;
        background: #f2f2f2;
    }
    ul li{
        display: inline-block;
        position: relative;
        line-height: 21px;
        text-align: left;
    }
    ul li a{
        display: block;
        padding: -1px 11px;
        color: #333;
        text-decoration: none;
    }
    ul li a:hover{
        color: #fff;
        background: #939393;
    }
    ul li ul.dropdown{
        min-width: 125px; /* Set width of the dropdown */
        background: #f2f2f2;
        display: none;
        position: absolute;
        z-index: 999;
        left: 0;
    }
    ul li:hover ul.dropdown{
        display: block;	/* Display the dropdown */
    }
    ul li ul.dropdown li{
        display: block;
    }
</style>

</head>

<body>
<div class="col-md-12 col-xs-pull4" style="width:100%;">
 <!--  <h3>OSD CUSTOMERS</h3> 
  <br> -->
  <s:actionmessage/>

  <table id="example" class="table table-striped table-bordered table-responsive">
        <thead>
			<tr>
				<th>Sl.No</th>
				<th>Name</th>
				<th>Mobile</th>
				<th>Email</th>
				<th>Address</th>
				<th>Sex</th>
				<th>Adhar</th>
				<th>Passport</th>
				<th>D L </th>
				<th>Pickup</th>
				<th>Car</th>
				<th>Documents</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
		<s:if test="#request.customerList !=null && #request.customerList.size()>0">
				<s:iterator value="#request.customerList" var="car" status="count">
				<tr><td style="padding: 0 13px;"><s:property value="#count.count" /></td>
				<td style="padding: 0 13px;"><s:property value="customerName" /></td>
				<td style="padding: 0 13px;"><s:property value="mobileNumber" /></td>
				<td style="padding: 0 13px;" id='<s:property value="id" />Email'><s:property value="email" /></td>
				<td style="padding: 0 13px;"><s:property value="address" /></td>
				<td style="padding: 0 13px;"><s:property value="sex" /></td>
				<td style="padding: 0 13px;"><s:property value="adharNumber" /></td>
				<td style="padding: 0 13px;"><s:property value="passportNumber" /></td>
				<td style="padding: 0 13px;"><s:property value="dlNumber" /></td>
				<td style="padding: 0 13px;"><s:property value="pickupLocation" /></td>
				<td style="padding: 0 13px;"><s:property value="preferedCar" /></td>
				<td style="padding: 0px 6px;">
				<s:iterator value="docs" status="count" var="document">
				<a  href='/images/<s:property value="%{#document.path}"/>'><s:property value="%{#document.fileType}"/></a></br>
				</s:iterator>
				</td>
				<td style="padding: 0 13px;"><!-- <a href="#"><input type="button" value="Approve"/></a>  -->
				 <ul>
        <li>
            <a href="#">Option &#9662;</a>
            <ul class="dropdown">
                 <li><a href='approveUser?inputText=<s:property value="id" />' >Approve</a></li>
                <li><a  href="#">Hold</a></li>
                <li><a href="#" >Reject</a></li>
            </ul>
        </li>
    </ul>
			</td>
			</s:iterator>
			</s:if>
		</tbody>
    </table>
  
  
</div>


	<%-- <section style="baclground:#000;" class="black-section color-dark bg-black">
          <div class="container">
          <div class="row">
          <div class="col-lg-4">
          <form novalidate="novalidate" id="newsletter-form" class="content-form clearfix" action="#" method="post">
                        <input type="text" value="Subscribe to our Newsletter">
                        <input type="submit" value="Go">
                        </form>
    
            </div> 
            <!-- /Section: PROMOTERS -->
            <div class="col-lg-4">
            <div style="padding:0px; height:55px;" class="infobox-orange text-center"><h4>PROMOTERS   <img width="100" src="img/orange-cabs.png"></h4></div>
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
</div></section> --%>
	<!-- /Section: about -->
	
	
	<!-- Section: services -->
<%--     
<section class="home-section color-dark bg-white">
      <div class="container">
      <div class="row">
      <div class="col-lg-8 text-center"><a href="#">ADDRESS:</a> Orange Self Drive C-5, Shanti Kunj, Church Road, Opp. D-3, Vasant Kunj, New Delhi - 110 070, INDIA </div>
      <div class="col-lg-4 border"><a href="">Help Line:</a> +91 9871268833<br><a href="#">EMAIL:</a> info@orangeselfdrive.com</div>
      <div></div>
</div></div></section>  --%> 
<!-- /Section: services -->
<!-- <footer>
		<div class="container">
			<div class="row">
				<div class="col-md-7 col-md-offset-3">
					
					<div class="text-center">
						<a href="#intro" class="totop"><i class="fa fa-angle-up fa-3x"></i></a>

						<p>Copyright 2015 ORANGE SELF DRIVE | All Rights Reserved | Privacy Policy | Terms &amp; Conditions | Disclaimer <a href="http://theparish.in"  target="_blank"> Design:  The Parish </a>|<a href="#"> Powered By:</a><a href="http://www.telematics4u.com" target="_blank">Telematics4u</a>  </p>
					</div>
				</div>
			</div>	
		</div>
	</footer> -->

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


<script type="text/javascript" charset="utf8" src="js/jquery-1.11.1.min.js"></script>
	<script type="text/javascript" charset="utf8" src="js/jquery.dataTables.min.js"></script>

</section></section>
	<script type="text/javascript" charset="utf-8">
			$(document).ready(function() {
				$('#example').dataTable({
				  'pagingType' : 'simple_numbers'
				});

			} );
		</script>


</body></html>