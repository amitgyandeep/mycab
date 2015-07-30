<%@ taglib prefix="s" uri="/struts-tags"%>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
 <link rel="stylesheet" type="text/css" href="css/css2/jquery.dataTables.css">

<style type="text/css">
#menu li
{
    list-style: none;
    float: left;
    margin-right: 0.5em;
}

#menu li
{
    list-style: none;
}

#menu a
{
    display: block;
    width: 8em;
    color: white;
    background-color: #000099;
    text-decoration: none;
    text-align: center;
}

#menu a:hover
{
    background-color: #F36F21;
}
</style>
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
<div style="width:50%; text-align: center; margin-left: 20%;">
<strong>Car allocation for Booking No: &nbsp;&nbsp;<s:property value="#request.userBookig.bookingRef"/></strong>
</div>
<!-- 



<div id="menu" >
    <ul >
        <li><a href="hubAccess">Home</a></li>
        <li><a href="#">Events</a></li>
        <li><a href="#">Close Trip</a></li>
        <li><a href="#">XXXX</a></li>
    </ul>
</div> -->
<br/><br/>
<div style="width:50%; text-align: center; margin-left: 20%;">
<table id="example">
    <thead>
      <tr>
      
      <th>Vehicle</th>
       <th>Reg. No.</th>
     
      <th>Action</th>
      
      
      </tr>
    </thead>
    <tbody>
    	<s:if test="#request.preferedcars !=null && #request.preferedcars.size()>0">
    <s:iterator value="#request.preferedcars" status="count">
      <tr>
     
      <td><s:property value="model.name"/></td>
      <td><s:property value="regNumber"/></td>
       <td><a href="assignCarToBooking?bookingId=<s:property value="#request.userBookig.bookingRef"/>&regNo=<s:property value="regNumber"/>">Allocate</a></td>
    </tr>
    </s:iterator>
    </s:if>
    </tbody>
  </table>
  <script type="text/javascript" charset="utf8" src="js/jquery-1.8.2.min.js"></script>
  <script type="text/javascript" charset="utf8" src="js/jsfile/jquery.dataTables.min.js"></script>
  <script>
  $(function(){
    $("#example").dataTable();
  })
  </script>
</div>
</body>
</html>