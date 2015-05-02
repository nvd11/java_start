<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Country Mainteinance</title>

<!--  needed to define sth in servletcontext in order to import below js file, need the define "resources" folder name -->
<script src="/SpringSample2/resources/js/country.js"></script>
<script src="/SpringSample2/resources/js/jquery-1.11.2.min.js"></script>

</head>

<body>
	<form id="form1" name="form1" action="addCountry" method="post">
		country id:<input type="text" id="tb_ctyId" name="tb_ctyId"> 
		country name:<input type="text" id="tb_ctyName" name="tb_ctyName">
		
		</br></br>
		currency:<input type="text" id="tb_ccy" name="tb_ccy"> 
		</br></br>
		region:<input type="text" id="tb_region" name="tb_region">
	</form>	
	<input type="button" onclick="addButtonClicked()" value="AddCountry">
	</br></br>
	<input type="button" onclick="addRegionButtonClicked()" value="AddRegion">
	</br></br>
	<input type="button" onclick="getCcyRegionButtonClicked()" value="GetCcyRegion">
	<input type="button" onclick="getBankListButtonClicked()" value="GetBankList">
	<input type="button" onclick="testPassPra()" value="testPass">
	<input type="button" onclick="testPassPra2()" value="testPass2">
	<input type="button" onclick="getAllCcyRegionHolidayList()" value="getAllCcyRegionHoliday">
	<input type="button" onclick="addCcyRegionHolidayList()" value="addCcyRegionHoliday">
	

	</br></br>
		<textarea id="textAreaPanel" rows="30" cols="98" stype="border: 0px;"></textarea>
	
</body>
</html>