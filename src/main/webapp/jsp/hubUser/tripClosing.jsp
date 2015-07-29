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
<script type="text/javascript">
var elementId2;
function addPenality(elementId){
	var total=parseFloat(document.getElementById("sumTotalId").innerHTML);
	var checkBoxElement=document.getElementById(elementId);
	if(checkBoxElement.checked){
		
		var valueEx=parseFloat(checkBoxElement.value); 
		total=total+valueEx;
		
		total=total.toFixed(2);
		document.getElementById("sumTotalId").innerHTML=total;
	}else{
		total=total-parseFloat(checkBoxElement.value);
		total=total.toFixed(2);
		document.getElementById("sumTotalId").innerHTML=total;
		
	}
	
}

</script>
</head>
<body>



<div id="menu" >
    <ul >
        <li><a href="hubAccess">Home</a></li>
      <!--   <li><a href="#">Events</a></li> -->
        
        <li><a href="logoutAction">Logout</a></li>
    </ul>
</div>
<br/><br/>
<div style="width:80%;  margin-left: 10%;">
<span style="width: 50%; float: left;">
  <fieldset >
  <legend>Estimated Invoice</legend>
 <table>

      <tr><td>Booking Ref. </td><td><s:property value="#request.estimatedInvoice.booking.bookingRef"/></td></tr>
      <tr><td>Start Date</td><td><s:date  format="dd/MM/yyyy hh:mm a" name="#request.estimatedInvoice.booking.startDateTime" /></td></tr>
      <tr><td>End Date</td><td><s:date  format="dd/MM/yyyy hh:mm a" name="#request.estimatedInvoice.booking.endDateTime"/></td></tr>
      <tr><td>Actual End Date</td><td><s:date  format="dd/MM/yyyy hh:mm a" name="#request.estimatedInvoice.booking.actualDateTime"/></td></tr>
      <tr><td>Vehicle</td><td><s:property value="#request.estimatedInvoice.booking.carModel"/>,<s:property value="#request.estimatedInvoice.booking.vehicleRegNum"/></td></tr>
      <tr><td>Security Deposit</td><td><s:property value="#request.estimatedInvoice.securityDeposit"/></td>
      <tr><td>Amount</td><td><s:property value="#request.estimatedInvoice.total"/></td></tr>

    </table>
      
  </fieldset>
     <div>
    <B>Total :</B> <span id="sumTotalId"><s:property value="#request.estimatedInvoice.total"/></span>
  </div>
</span>
<span style="width: 50%;float: right;">
    <fieldset>
                <legend >Penalities</legend>
               
                  <fieldset>
                <legend >System</legend>
                 <table>
                <tr><td>OverSpeed</td><td><s:if test="#request.tripClosingModel.overSpeedCount!=null ">
									<input type="text" readonly="readonly" name="tripClosingModel.overSpeed" value='<s:property value="#request.overSpeedCount" />'/>
								</s:if> <s:else>
							N/A</s:else></td></tr>
                 <tr><td>Reschedule</td><td><s:if test="#request.tripClosingModel.reschedule!=null ">
									<input type="text" readonly="readonly" name="tripClosingModel.reschedule" value='<s:property value="#request.reschedule" />'/>
								</s:if> <s:else>
							N/A</s:else></td></tr>
                  
                  <tr><td>Delay return</td><td><s:if test="#request.tripClosingModel.delay!=null ">
									<input type="text" readonly="readonly" name="tripClosingModel.delay" value='<s:property value="#request.delay" />'/>
								</s:if> <s:else>
							N/A</s:else></td></tr>
                        <tr><td> Delay return(Ext.)</td><td><s:if test="#request.tripClosingModel.delayExt!=null ">
									<input type="text" readonly="readonly" name="tripClosingModel.delayExt" value='<s:property value="#request.delayExt" />'/>
								</s:if> <s:else>
							N/A</s:else></td></tr>
                           
                         </table>
                        </fieldset><br/>
                             <fieldset>
                <legend >If Applicable </legend>
                         <table>
                         <tr><td>Refuel charge</td><td><input type="text" placeholder="Default 500" name="tripClosingModel.refuleCharge"/></td></tr>
                         <tr><td>Towing</td><td><input type="text" placeholder="Default 1000" name="tripClosingModel.towing"/></td></tr>
                         <tr><td>Others</td><td><input type="text"  name="other"/></td></tr>
                         
                         <tr><td>Major Damage</td><td><input type="text" name="tripClosingModel.majorDamage"/></td></tr>
						 <tr><td>Minor Damage</td><td><input type="text" name="tripClosingModel.minorDamage"/></td></tr>
                         <tr><td><input type="checkbox" name="tripClosingModel.filthVomit" value="500" id="vomitId" onclick="javascript:addPenality(this.id);"/>Filth/vomit</td><td>500</td></tr>
                         <tr><td><input type="checkbox" name="tripClosingModel.keyLost" value="1000" id="keyLostId" onclick="javascript:addPenality(this.id);"/>Key lost</td><td>1000</td></tr>
                         <tr><td><input type="checkbox" name="tripClosingModel.documentLost" value="4000"  id="docLostId" onclick="javascript:addPenality(this.id);" />Document Lost</td><td>4000</td></tr>
                        
                         
                     </table>
                      </fieldset>
        </fieldset>
        <div id="menu" >
    <ul ><li><a href="#">Close Trip</a></li></ul></div>
</span>
</div>
</body>
</html>