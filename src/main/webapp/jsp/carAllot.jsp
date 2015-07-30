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
<s:actionmessage/>
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
<div style="width:80%; text-align: center; margin-left: 10%;">
<table id="example">
    <thead>
      <tr>
      <th>Hub Name</th>
      <th>Booking Ref</th>
      <th>Start Date</th>
      <th>End Date</th>
  
      <th>Vehicle</th>
<th>Reg. No.</th>
      <th>Booking Status</th>
      <th>Action</th>
      
      
      </tr>
    </thead>
    <tbody>
    <s:iterator value="#request.userBooking" status="count">
      <tr>
      <td><s:property value="carHub"/></td>
      <td><s:property value="bookingRef"/></td>
      <td><s:date  format="dd/MM/yyyy hh:mm a" name="startDateTime" /></td>
      <td><s:date  format="dd/MM/yyyy hh:mm a" name="endDateTime"/></td>

      <td><s:property value="carModel"/></td>
      <td><s:property value="vehicleRegNum"/></td>
       <td><s:property value="status"/></td>
       <td><ul>
        <li>
            <a href="#">Option &#9662;</a>
            <ul class="dropdown">
                 <li><a href='getPreferdCar?modelName=<s:property value="carModel"/>&bookingId=<s:property value="bookingRef"/>' >Asign Car</a></li>
            </ul>
        </li>
    </ul></td>
    </tr>
    </s:iterator>
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