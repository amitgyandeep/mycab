<%@ taglib prefix="s" uri="/struts-tags" %>
<html lang="en"><head>
    <meta charset="utf-8">
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta content="" name="description">
    <meta content="" name="author">
    <title>Orange Self Drive</title>
	<!-- css -->
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
	 <link rel="stylesheet" href="css/datepicker.css">
<style>
.tegline{
    background: rgba(0, 0, 0, 0) url("../img/bg-form.png") repeat scroll 0 0;
    color: #f36f21;
    height: 24px;
    text-shadow: 2px 5px 6px #000;
}
.mar{
	margin-top:10px;
}
select{
	width:100% !important;
}
</style>
<style type="text/css">
.table-condensed > thead > tr > th, .table-condensed > tbody > tr > th, .table-condensed > tfoot > tr > th, .table-condensed > thead > tr > td, .table-condensed > tbody > tr > td, .table-condensed > tfoot > tr > td {
    padding: 2px;
}
</style>
</head>

<body data-target=".navbar-custom" data-spy="scroll" id="page-top">
<div class="container">
<div class="row">
<div class="col-lg-9"></div>
<div class="col-lg-3"><p style="float:right;"><img src="img/live-support.png" style="float:left;"><a href="userLogin" class="top-link">SIGN IN</a><a href="#" class="top-link">FAQs</a><a href="#" class="top-link">Link</a></p></div>

</div>

</div>
	
	<div style="height: 92px;" class="sticky-wrapper" id="navigation-sticky-wrapper"><div id="navigation-sticky-wrapper" class="sticky-wrapper is-sticky" style="height: 108px;"><div style="height: 108px; position: relative; top: -20px;" class="sticky-wrapper" id="navigation-sticky-wrapper"><div style="height: 108px;" class="sticky-wrapper is-sticky" id="navigation-sticky-wrapper"><div style="height: 108px;" class="sticky-wrapper is-sticky" id="navigation-sticky-wrapper"><div id="navigation-sticky-wrapper" class="sticky-wrapper is-sticky" style="height: 107px;"><div style="height: 107px;" class="sticky-wrapper" id="navigation-sticky-wrapper"><div id="navigation-sticky-wrapper" class="sticky-wrapper is-sticky" style="height: 112px;"><div id="navigation-sticky-wrapper" class="sticky-wrapper is-sticky" style="height: 112px;"><div style="position: fixed; top: 0px;" id="navigation">
        
        <nav class="navbar navbar-custom" role="navigation">
                              <div class="container">
                                    <div class="row">
                                          <div class="col-md-4">
                                                   <div class="site-logo">
                                                            <a href="dashboard" class="brand"><img src="img/logo.png"></a>
                                                    </div>
                                          </div>
                                          

                                          <div class="col-md-8">
                         
                                                      <!-- Brand and toggle get grouped for better mobile display -->
                                          <div class="navbar-header">
                                                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#menu">
                                                <i class="fa fa-bars"></i>
                                                </button>
                                          </div>
                                                      <!-- Collect the nav links, forms, and other content for toggling -->
                                                      <div id="menu" class="navbar-collapse collapse" style="height: 1px;">
                                                            <ul class="nav navbar-nav navbar-right">
                                                                  <li class="active"><a href="dashboard">Home</a></li>
                                                                  <li class=""><a href="osd">OSD</a></li>
																   <li class=""><a href="tripMachines">Trip Machines</a></li>
                                                                  <li class=""><a href="tariffs">Tariffs</a></li>	
                                                                  <li><a href="#works">Blog</a></li>				                                                                  
                                                                  
                                                                  <li class=""><a href="#contact">Contact</a></li>
                                                            </ul>
                                                      </div>
                                                      <!-- /.Navbar-collapse -->
                             
                                          </div>
                                    </div>
                              </div>
                              <!-- /.container -->
                        </nav>
    </div></div></div></div></div></div></div></div></div></div>
<section class="home-slide text-light" id="intro">

		<!-- Carousel -->
    	<div data-ride="carousel" class="carousel slide" id="carousel-example-generic">
			<!-- Indicators -->
			<ol class="carousel-indicators">
			  	<li class="" data-slide-to="0" data-target="#carousel-example-generic"></li>
			    <li class="active" data-target="#carousel-example-generic" data-slide-to="1"></li>
			    <li class="" data-target="#carousel-example-generic" data-slide-to="2"></li>
			</ol>
			<!-- Wrapper for slides -->
			<div class="carousel-inner">
			    <div class="item">
			    	<img alt="First slide" src="img/1.jpg">
			    	<!-- Static Header -->
                    <div class="header-text hidden-xs">
                    <div class="container">
                    <div class="col-md-12 text-center">
 
                    <div class="col-lg-4 tab-contact">
                      <form class="bookform form-inline row" id="form1" action="availability" theme="simple" method="post">
                                  <div class="row">
                                  <div class="form-group col-md-6 col-sm-6 col-xs-12">
                                  <div class="input-group">
                                  <input type="text" onkeydown="return false;" id="datepicker1" required="" placeholder="Pick Up Date" class="form-control hasDatepicker" name="customerRequestObject.startDate">
                                   <div class="input-group-addon"><i class="fa fa-calendar"></i></div>
                                  </div>
                                  </div>
                                 <div class="form-group col-lg-6 col-sm-6 col-xs-12">
                                 <span></span>
												<s:select class="form-control" style="color:gray;" name="customerRequestObject.startTime"
						list="#{'12:00 AM':'12:00 AM','1:00 AM':'1:00 AM','2:00 AM':'2:00 AM','3:00 AM':'3:00 AM','4:00 AM':'4:00 AM','5:00 AM':'5:00 AM','6:00 AM':'6:00 AM','7:00 AM':'7:00 AM','8:00 AM':'8:00 AM','9:00 AM':'9:00 AM','10:00 AM':'10:00 AM','11:00 AM':'11:00 AM','12:00 PM':'12:00 PM','1:00 PM':'1:00 PM','2:00 PM':'2:00 PM','3:00 PM':'3:00 PM','4:00 PM':'4:00 PM','5:00 PM':'5:00 PM','6:00 PM':'6:00 PM','7:00 PM':'7:00 PM','8:00 PM':'8:00 PM','9:00 PM':'9:00 PM','10:00 PM':'10:00 PM','11:00 PM':'11:00 PM'}"
													theme="simple">
												</s:select>
											</div>
                                  </div>
                                  <div class="row">
                                  <div class="form-group col-md-6 col-sm-6 col-xs-12">
                                  <div class="input-group">
                                  <input type="text" id="datepicker2" required="" onkeydown="return false;" placeholder="Drop Off Date" class="form-control hasDatepicker" name="customerRequestObject.endDate">
                                  <div class="input-group-addon"><i class="fa fa-calendar"></i></div>
                                  </div>
                                 </div>
                                 <div class="form-group col-lg-6 col-sm-6 col-xs-12">
                                 <span></span>
					<s:select class="form-control" style="color:gray;" name="customerRequestObject.endTime"
						list="#{'12:00 AM':'12:00 AM','1:00 AM':'1:00 AM','2:00 AM':'2:00 AM','3:00 AM':'3:00 AM','4:00 AM':'4:00 AM','5:00 AM':'5:00 AM','6:00 AM':'6:00 AM','7:00 AM':'7:00 AM','8:00 AM':'8:00 AM','9:00 AM':'9:00 AM','10:00 AM':'10:00 AM','11:00 AM':'11:00 AM','12:00 PM':'12:00 PM','1:00 PM':'1:00 PM','2:00 PM':'2:00 PM','3:00 PM':'3:00 PM','4:00 PM':'4:00 PM','5:00 PM':'5:00 PM','6:00 PM':'6:00 PM','7:00 PM':'7:00 PM','8:00 PM':'8:00 PM','9:00 PM':'9:00 PM','10:00 PM':'10:00 PM','11:00 PM':'11:00 PM'}"
													theme="simple">
												</s:select>
											</div>
                                 </div>
                                 <div class="row">
                                 <div class="form-group col-md-12 col-sm-6 col-xs-12">
                                 <div class="input-group">
                               <!--   <input type="text" placeholder="Enter Your City Or HUB" class="form-control hasDatepicker"> -->
													<input list="carHub1" name="customerRequestObject.carHub.name" 
														placeholder="Enter Your City Or HUB"
														class="form-control hasDatepicker" autocomplete="off" required="">
													<datalist id="carHub1">
														<s:iterator value="#session.carHubs">
															<option value='<s:property value="name"/>'>
														</s:iterator>

													</datalist>
													<div class="input-group-addon"><i class="glyphicon glyphicon-map-marker"></i></div>
                                 </div>
                                 </div>
                                 </div>
                                 <div class="row">
                                 <div class="form-group col-lg-12 col-sm-6 col-xs-12">
                                 <div class="input-group">
                              <!--    <input type="text" id="datepicker" placeholder="Enter Your Vehicle" class="form-control hasDatepicker"> -->
                                 <input list="cars1"  placeholder="Enter Your Vehicle" class="form-control hasDatepicker" name="customerRequestObject.carModel.name" autocomplete="off" required="">
													<datalist id="cars1">
														<s:iterator value="#session.cars">
															<option value='<s:property value="model.name"/>'>
														</s:iterator>

													</datalist>
                                  <div class="input-group-addon"><i class="glyphicon glyphicon-map-marker"></i></div>
                                  </div>
                                  </div>
                                  </div>
                                  <div class="row">
                                  <div class="form-group col-lg-12 col-sm-6 col-xs-12">
                                  <button class="btn btn-danger col-lg-12 pull-left" type="submit"><i class="icon-search"></i>START YOUR TRIP</button>
                                  </div>
                             </form>
                            </div>
                            </div>
<!--                            <div class="col-lg-5 pull-right"><h1 class="tegline">aao trip karein</h1></div>-->                          </div>
                        </div>
                    </div><!-- /header-text -->
			    </div>
			    <div class="item active">
			    	<img alt="First slide" src="img/1.jpg">
			    	<!-- Static Header -->
                    <div class="header-text hidden-xs">
                    <div class="container">
                    <div class="col-md-12 text-center">
 
                    <div class="col-lg-4 tab-contact">
                      <form class="bookform form-inline row" id="form2" action="availability" theme="simple" method="post">
                                  <div class="row">
                                  <div class="form-group col-md-6 col-sm-6 col-xs-12">
                                  <div class="input-group">
                                  <input type="text" id="datepicker3" onkeydown="return false;" placeholder="Pick Up Date" class="form-control hasDatepicker" name="customerRequestObject.startDate" required="">
                                   <div class="input-group-addon"><i class="fa fa-calendar"></i></div>
                                  </div>
                                  </div>
                                 <div class="form-group col-lg-6 col-sm-6 col-xs-12">
                                 <span></span>
                                <s:select class="form-control" style="color:gray;" name="customerRequestObject.startTime"
						list="#{'12:00 AM':'12:00 AM','1:00 AM':'1:00 AM','2:00 AM':'2:00 AM','3:00 AM':'3:00 AM','4:00 AM':'4:00 AM','5:00 AM':'5:00 AM','6:00 AM':'6:00 AM','7:00 AM':'7:00 AM','8:00 AM':'8:00 AM','9:00 AM':'9:00 AM','10:00 AM':'10:00 AM','11:00 AM':'11:00 AM','12:00 PM':'12:00 PM','1:00 PM':'1:00 PM','2:00 PM':'2:00 PM','3:00 PM':'3:00 PM','4:00 PM':'4:00 PM','5:00 PM':'5:00 PM','6:00 PM':'6:00 PM','7:00 PM':'7:00 PM','8:00 PM':'8:00 PM','9:00 PM':'9:00 PM','10:00 PM':'10:00 PM','11:00 PM':'11:00 PM'}"
													theme="simple">
												</s:select>
										</div>
                                  </div>
                                  <div class="row">
                                  <div class="form-group col-md-6 col-sm-6 col-xs-12">
                                  <div class="input-group">
                                  <input type="text" id="datepicker4" onkeydown="return false;" placeholder="Drop Off Date" class="form-control hasDatepicker" name="customerRequestObject.endDate" required="">
                                  <div class="input-group-addon"><i class="fa fa-calendar"></i></div>
                                  </div>
                                 </div>
                                 <div class="form-group col-lg-6 col-sm-6 col-xs-12">
                                 <span></span><s:select class="form-control" style="color:gray;" name="customerRequestObject.endTime"
						list="#{'12:00 AM':'12:00 AM','1:00 AM':'1:00 AM','2:00 AM':'2:00 AM','3:00 AM':'3:00 AM','4:00 AM':'4:00 AM','5:00 AM':'5:00 AM','6:00 AM':'6:00 AM','7:00 AM':'7:00 AM','8:00 AM':'8:00 AM','9:00 AM':'9:00 AM','10:00 AM':'10:00 AM','11:00 AM':'11:00 AM','12:00 PM':'12:00 PM','1:00 PM':'1:00 PM','2:00 PM':'2:00 PM','3:00 PM':'3:00 PM','4:00 PM':'4:00 PM','5:00 PM':'5:00 PM','6:00 PM':'6:00 PM','7:00 PM':'7:00 PM','8:00 PM':'8:00 PM','9:00 PM':'9:00 PM','10:00 PM':'10:00 PM','11:00 PM':'11:00 PM'}"
													theme="simple">
												</s:select>
										</div>
                                 </div>
                                 <div class="row">
                                 <div class="form-group col-md-12 col-sm-6 col-xs-12">
                                 <div class="input-group">
                              <!--    <input type="text" placeholder="Enter Your City Or HUB" class="form-control hasDatepicker"> -->
                               	<input list="carHubs2" required="" 
														placeholder="Enter Your City Or HUB"
														class="form-control hasDatepicker" name="customerRequestObject.carHub.name" autocomplete="off">
													<datalist id="carHubs2">
														<s:iterator value="#session.carHubs">
															<option value='<s:property value="name"/>'>
														</s:iterator>

													</datalist>
                                 <div class="input-group-addon"><i class="glyphicon glyphicon-map-marker"></i></div>
                                 </div>
                                 </div>
                                 </div>
                                 <div class="row">
                                 <div class="form-group col-lg-12 col-sm-6 col-xs-12">
                                 <div class="input-group">
                               <!--   <input type="text" id="datepicker" placeholder="Enter Your Vehicle" class="form-control hasDatepicker"> -->
                                 <input list="cars2" required=""
														placeholder="Enter Your Vehicle"
														class="form-control hasDatepicker" name="customerRequestObject.carModel.name" autocomplete="off">
													<datalist id="cars2">
														<s:iterator value="#session.cars">
															<option value='<s:property value="model.name"/>'>
														</s:iterator>

													</datalist>
                                  <div class="input-group-addon"><i class="glyphicon glyphicon-map-marker"></i></div>
                                  </div>
                                  </div>
                                  </div>
                                  <div class="row">
                                  <div class="form-group col-lg-12 col-sm-6 col-xs-12">
                                  <button class="btn btn-danger col-lg-12 pull-left" type="submit"><i class="icon-search"></i>START YOUR TRIP</button>
                                  </div>
                             </form>
                            </div>
                            </div>
<!--                            <div class="col-lg-5 pull-right"><h1 class="tegline">aao trip karein</h1></div>-->                          </div>
                        </div>
                    </div><!-- /header-text -->
			    </div>
			    <div class="item">
			    	<img alt="First slide" src="img/1.jpg">
			    	<!-- Static Header -->
                    <div class="header-text hidden-xs">
                    <div class="container">
                    <div class="col-md-12 text-center">
 
                    <div class="col-lg-4 tab-contact">
                      <form class="bookform form-inline row" id="form3" action="availability" theme="simple" method="post">
                                  <div class="row">
                                  <div class="form-group col-md-6 col-sm-6 col-xs-12">
                                  <div class="input-group">
                                  <input type="text" id="datepicker5" required="" onkeydown="return false;" placeholder="Pick Up Date" class="form-control hasDatepicker" name="customerRequestObject.startDate">
                                   <div class="input-group-addon"><i class="fa fa-calendar"></i></div>
                                  </div>
                                  </div>
                                 <div class="form-group col-lg-6 col-sm-6 col-xs-12">
                                 <span></span><s:select class="form-control" style="color:gray;" name="customerRequestObject.startTime"
						list="#{'12:00 AM':'12:00 AM','1:00 AM':'1:00 AM','2:00 AM':'2:00 AM','3:00 AM':'3:00 AM','4:00 AM':'4:00 AM','5:00 AM':'5:00 AM','6:00 AM':'6:00 AM','7:00 AM':'7:00 AM','8:00 AM':'8:00 AM','9:00 AM':'9:00 AM','10:00 AM':'10:00 AM','11:00 AM':'11:00 AM','12:00 PM':'12:00 PM','1:00 PM':'1:00 PM','2:00 PM':'2:00 PM','3:00 PM':'3:00 PM','4:00 PM':'4:00 PM','5:00 PM':'5:00 PM','6:00 PM':'6:00 PM','7:00 PM':'7:00 PM','8:00 PM':'8:00 PM','9:00 PM':'9:00 PM','10:00 PM':'10:00 PM','11:00 PM':'11:00 PM'}"
													theme="simple">
												</s:select>
									</div>
                                  </div>
                                  <div class="row">
                                  <div class="form-group col-md-6 col-sm-6 col-xs-12">
                                  <div class="input-group">
                                  <input type="text" id="datepicker6"  required="" onkeydown="return false;" placeholder="Drop Off Date" class="form-control hasDatepicker" name="customerRequestObject.endDate">
                                  <div class="input-group-addon"><i class="fa fa-calendar"></i></div>
                                  </div>
                                 </div>
                                 <div class="form-group col-lg-6 col-sm-6 col-xs-12">
                                 <span></span>
										<s:select class="form-control" style="color:gray;"
											name="customerRequestObject.endTime"
											list="#{'12:00 AM':'12:00 AM','1:00 AM':'1:00 AM','2:00 AM':'2:00 AM','3:00 AM':'3:00 AM','4:00 AM':'4:00 AM','5:00 AM':'5:00 AM','6:00 AM':'6:00 AM','7:00 AM':'7:00 AM','8:00 AM':'8:00 AM','9:00 AM':'9:00 AM','10:00 AM':'10:00 AM','11:00 AM':'11:00 AM','12:00 PM':'12:00 PM','1:00 PM':'1:00 PM','2:00 PM':'2:00 PM','3:00 PM':'3:00 PM','4:00 PM':'4:00 PM','5:00 PM':'5:00 PM','6:00 PM':'6:00 PM','7:00 PM':'7:00 PM','8:00 PM':'8:00 PM','9:00 PM':'9:00 PM','10:00 PM':'10:00 PM','11:00 PM':'11:00 PM'}"
											theme="simple">
										</s:select>
									</div>
                                 </div>
                                 <div class="row">
                                 <div class="form-group col-md-12 col-sm-6 col-xs-12">
                                 <div class="input-group">
                               <!--   <input type="text" placeholder="Enter Your City Or HUB" class="form-control hasDatepicker"> -->
                                 	<input list="carHubs3" required="" 
														placeholder="Enter Your City Or HUB"
														class="form-control hasDatepicker" name="customerRequestObject.carHub.name" autocomplete="off">
													<datalist id="carHubs3">
														<s:iterator value="#session.carHubs">
															<option value='<s:property value="name"/>'>
														</s:iterator>

													</datalist>
                                 <div class="input-group-addon"><i class="glyphicon glyphicon-map-marker"></i></div>
                                 </div>
                                 </div>
                                 </div>
                                 <div class="row">
                                 <div class="form-group col-lg-12 col-sm-6 col-xs-12">
                                 <div class="input-group">
                               <!--   <input type="text" id="datepicker" placeholder="Enter Your Vehicle" class="form-control hasDatepicker"> -->
                                 <input list="cars3" required=""
														placeholder="Enter Your Vehicle"
														class="form-control hasDatepicker" name="customerRequestObject.carModel.name" autocomplete="off">
													<datalist id="cars3">
														<s:iterator value="#session.cars">
															<option value='<s:property value="model.name"/>'>
														</s:iterator>

													</datalist>
                                  <div class="input-group-addon"><i class="glyphicon glyphicon-map-marker"></i></div>
                                  </div>
                                  </div>
                                  </div>
                                  <div class="row">
                                  <div class="form-group col-lg-12 col-sm-6 col-xs-12">
                                  <button class="btn btn-danger col-lg-12 pull-left" type="submit"><i class="icon-search"></i>START YOUR TRIP</button>
                                  </div>
                                  </div>
                             </form>
                            </div>
                            </div>
<!--                            <div class="col-lg-5 pull-right"><h1 class="tegline">aao trip karein</h1></div>-->                          </div>
                        </div>
                    </div><!-- /header-text -->
			    </div>
			<!-- Controls -->
			<a data-slide="prev" href="#carousel-example-generic" class="left carousel-control">
		    	<span class="glyphicon glyphicon-chevron-left"></span>
			</a>
			<a data-slide="next" href="#carousel-example-generic" class="right carousel-control">
		    	<span class="glyphicon glyphicon-chevron-right"></span>
			</a>
		</div><!-- /carousel -->

	</section>
	<!-- /Section: intro -->
	
	
    <!-- Navigation -->
     
    <!-- /Navigation -->  

	<!-- Section: about -->
    <section class="home-section color-dark bg-white">
      <div class="container">

		
      <div class="row">
		
			<div class="col-md-6">
            <div data-wow-delay="0.4s" data-wow-offset="0" class="wow flipInY animated animated animated animated animated" style="visibility: visible;-webkit-animation-delay: 0.4s; -moz-animation-delay: 0.4s; animation-delay: 0.4s;">
    <h5>Trip Machines<span class="more text-center"> - Our self drive fleet at a glance</span></h5>
    </div>
    

    <div id="myCarousel" class="carousel slide" data-interval="3000" data-ride="carousel">
        <!-- Wrapper for carousel items -->

        <div class="carousel-inner">

            <div class="item">

                <h2><img class="img-responsive" alt="" src="img/Toyota-Innova.png"></h2>

                <div class="carousel-caption" style="position: relative;top: -36px;">

                 <div class="col-lg-12">
                  <div class="col-lg-4"><button type="button" class="btn btn-danger mar">Toyota Innova</button></div>
                  <div class="col-lg-4"> <button type="button" class="btn btn-danger mar">Rs. 109 / Day</button></div>
                  <div class="col-lg-4"><button type="button" class="btn btn-danger event mar">Trip Now</button></div>
                  </div>
                  </div>

            </div>

            <div class="item">

                <h2><img class="img-responsive" alt="" src="img/ford-figo.png"></h2>

                <div class="carousel-caption" style="position: relative;top: -36px;">

                 <div class="col-lg-12">
                  <div class="col-lg-4"><button type="button" class="btn btn-danger mar">Ford Figo</button></div>
                  <div class="col-lg-4"> <button type="button" class="btn btn-danger mar">Rs. 49 / Day</button></div>
                  <div class="col-lg-4"><button type="button" class="btn btn-danger event mar">Trip Now</button></div>
                  </div>
                  </div>

               </div>
               
               
               <div class="item">

                <h2><img class="img-responsive" alt="" src="img/ford.png"></h2>

                <div class="carousel-caption" style="position: relative;top: -36px;">

                 <div class="col-lg-12">
                  <div class="col-lg-4"><button type="button" class="btn btn-danger mar">Ford EcoSport</button></div>
                  <div class="col-lg-4"> <button type="button" class="btn btn-danger mar">Rs. 49 / Day</button></div>
                  <div class="col-lg-4"><button type="button" class="btn btn-danger event mar">Trip Now</button></div>
                  </div>
                  </div>

               </div>

            <div class="item active">

                <h2><img class="img-responsive" alt="" src="img/MERCEDES-E-CLASS.png"></h2>

                <div class="carousel-caption" style="position: relative;top: -36px;">

                  <div class="col-lg-12">
                  <div class="col-lg-4"><button type="button" class="btn btn-danger mar">Mercedes E Class</button></div>
                  <div class="col-lg-4"> <button type="button" class="btn btn-danger mar">Rs. 379 / Day</button></div>
                  <div class="col-lg-4"><button type="button" class="btn btn-danger event mar">Trip Now</button></div>
                  </div>
                  </div>

            </div>
            
             

        </div>
        

        <!-- Carousel controls -->

        <a class="carousel-control left" href="#myCarousel" data-slide="prev">

            <span class="glyphicon glyphicon-chevron-left"></span>

        </a>

        <a class="carousel-control right" href="#myCarousel" data-slide="next">

            <span class="glyphicon glyphicon-chevron-right"></span>

        </a>

    </div>


			    
      
           </div>
			<div data-wow-delay="0.4s" data-wow-offset="0" class="wow flipInY animated animated animated animated animated" style="visibility: visible;-webkit-animation-delay: 0.4s; -moz-animation-delay: 0.4s; animation-delay: 0.4s;">
            <div class="col-md-6">	
            <div class="infobox-inner">	
			<h2>EVENTS</h2>		
<p>Event heading event heading event heading event heading <br>
                        <span class="more"><a href="#">Read more...</a></span></p>
  					
			<p>Event heading event heading event heading event heading <br>
                        <span class="more"><a href="#">Read more...</a></span>			</p>
<p>Event heading event heading event heading event heading <br>
                        <span class="more"><a href="#">Read more...</a></span></p>
               </div>
           <div class="infobox-inner" style=" height: 100px;">	
           <div class="col-lg-6"><h4 style="margin: 14px -15px;">DOWNLOAD APP</h4></div><div class="col-lg-6"><a href="#"><img src="img/google-play.png" style=""></a></div>
            </div>
            
        </div>

		

        </div>		
		</div>
</div>
	<section style="baclground:#000;" class="black-section color-dark bg-black">
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
 <!--    <script src="js/jquery.min.js"></script>	 --> 
  <script src="js/jquery-1.9.1.min.js"></script>  
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




</section>
<script src="js/bootstrap-datepicker.js"></script>
        <script type="text/javascript">
            // When the document is ready
            $(document).ready(function () {
                
                $('#datepicker1').datepicker({
                    format: "dd/mm/yyyy",
                    orientation: "top left",
                    startDate: new Date(),
                    autoclose: true
                });  
            
            });
        </script>
        <script type="text/javascript">
            // When the document is ready
            $(document).ready(function () {
                
                $('#datepicker2').datepicker({
                    format: "dd/mm/yyyy",
                    orientation: "top left",
                    startDate: new Date(),
                    autoclose: true
                });  
            
            });
        </script>
        <script type="text/javascript">
            // When the document is ready
            $(document).ready(function () {
                
                $('#datepicker3').datepicker({
                    format: "dd/mm/yyyy",
                    orientation: "top left",
                    startDate: new Date(),
                    autoclose: true
                });  
            
            });
        </script>
        <script type="text/javascript">
            // When the document is ready
            $(document).ready(function () {
                
                $('#datepicker4').datepicker({
                    format: "dd/mm/yyyy",
                    orientation: "top left",
                    startDate: new Date(),
                    autoclose: true
                });  
            
            });
        </script>
        <script type="text/javascript">
            // When the document is ready
            $(document).ready(function () {
                
                $('#datepicker5').datepicker({
                    format: "dd/mm/yyyy",
                    orientation: "top left",
                    	 startDate: new Date(),
                    	 autoclose: true
                    	 
                });  
               
            });
        </script>
        <script type="text/javascript">
            $(document).ready(function () {
                $('#datepicker6').datepicker({
                    format: "dd/mm/yyyy",
                    orientation: "top left",
                    startDate: new Date(),
                    autoclose: true
                });  
            
            });
        </script>
     
</body></html>