<%@ taglib prefix="s" uri="/struts-tags"%>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
 <link rel="stylesheet" type="text/css" href="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/css/jquery.dataTables.css">

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



<div id="menu" >
    <ul >
        <li><a href="hubAccess">Home</a></li>
        <li><a href="#">Events</a></li>
        
        <li><a href="logoutAction">Logout</a></li>
    </ul>
</div>
<br/><br/>
<div style="width:80%;  margin-left: 10%;">
<span style="width: 50%; float: left;">
  <fieldset >
 <table>

      <tr><td>Booking Ref </td><td><s:property value="#request.booking.bookingRef"/></td></tr>
      <tr><td>Start Date</td><td><s:date  format="dd/MM/yyyy hh:mm" name="#request.booking.startDateTime" /></td></tr>
      <tr><td>End Date</td><td><s:date  format="dd/MM/yyyy hh:mm" name="#request.booking.endDateTime"/></td></tr>
      <tr><td>Actual End Date</td><s:date  format="dd/MM/yyyy hh:mm" name="#request.booking.actualEndDateTime"/></td></tr>
      <tr><td>Vehicle</td><td><s:property value="#request.booking.carModel"/>,<s:property value="#request.booking.vehicleRegNum"/></td></tr>

    </table>
      
  </fieldset>

</span>
<span style="width: 50%;float: right;">
    <fieldset>
              
                        <input type="checkbox" name="overSpeed" value="overSpeed" />overSpeed <br />
                        <input type="checkbox" name="filth" value="filth" />Filth/vomit<br />
                        <input type="checkbox" name="keyLost" value="keyLost" />key lost<br />
                        <input type="checkbox" name="delayReturn" value="delayReturn" />delay return<br />
                        <input type="checkbox" name="delayReturnEx" value="delayReturnEx" />delay return(Ext.)<br />
                        <input type="checkbox" name="refuelCharge" value="refuelCharge" />refuel charge<br />
                        <input type="checkbox" name="carDamage" value="carDamage" />car damage<br />
                        <input type="radio" name="damage" value="major">Major
						<input type="radio" name="damage" value="minor">minor</br>
                        <input type="checkbox" name="towing" value="towing" />Towing<br />
                        <input type="checkbox" name="reschedule" value="reschedule" />Reschedule<br />
                        <input type="checkbox" name="documentLost" value="documentLost" />document Lost<br />
                        <input type="checkbox" name="others" value="others" />others<br />
                     
        </fieldset>
        <div id="menu" >
    <ul ><li><a href="#">Close Trip</a></li></ul></div>
</span>
</div>
</body>
</html>