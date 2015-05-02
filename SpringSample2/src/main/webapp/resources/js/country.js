var rootURL = "http://localhost:8080/SpringSample2"

function addButtonClicked(){
		var colCtyId = "id";
		var colCtyName = "name";
		var ctyId = $('#tb_ctyId').val();
		var ctyName = $('#tb_ctyName').val();
		
		var ctyJson = '{"' + colCtyId + '":"' + ctyId + '","' + colCtyName + '":"' +ctyName +'"}';
		alert(ctyJson);
		$.ajax({
			type: 'PUT',
			contentType: 'application/json',
			url: rootURL + '/addCountry',
			dataType: "text",
			data: ctyJson,
			success: function(data, textStatus, jqXHR){
				alert('Country added successfully!');
			},
			error: function(jqXHR, textStatus, errorThrown){
				alert('update error: ' +textStatus);
			}
			
		});
};


function addRegionButtonClicked(){
		var colCcy = "currency";
		var colRegion = "region";
		var ccy = $('#tb_ccy').val();
		var region = $('#tb_region').val();
		
		var crJson = '{"' + colCcy + '":"' + ccy + '","' + colRegion + '":"' +region +'"}';
		alert(crJson);
		
		$.ajax({
			type: 'PUT',
			contentType: 'application/json',
			url: rootURL + '/addCcyRegion',
			dataType: "text",
			data: crJson,
			success: function(data, textStatus, jqXHR){
				alert('Country added successfully!');
			},
			error: function(jqXHR, textStatus, errorThrown){
				alert('update error: ' +textStatus);
			}
			
		});
	
		
};


function getCcyRegionButtonClicked(){
	alert("Abc");
	$.ajax({
			type: 'GET',
			url: rootURL + '/getCcyRegionList',
			dataType: "Json",
			success: showCcyRegionList, 
			error: function(jqXHR, textStatus, errorThrown){
				alert('get Data error: ' +textStatus);
			}
			
		});
	
};

function showCcyRegionList(data){
	alert("showing data");
	
	var list = data == null ? [] : (data instanceof Array ? data : [data]);
	alert(list[0].currency);
}

function getBankListButtonClicked(){
	$.ajax({
			type: 'GET',
			url: rootURL + '/getCcyRegionList',
			dataType: "Json",
			success: showCcyRegionList, 
			error: function(jqXHR, textStatus, errorThrown){
				alert('get Data error: ' +textStatus);
			}
			
		});
	
};

function testPassPra(){
	alert("abcc");
	$.ajax({
		type: 'POST',
		url: rootURL + '/testPassPra',
		data: {"name":"John","location":"Boston"},
		dataType: "text",
		success: showCcyRegionList, 
		error: function(jqXHR, textStatus, errorThrown){
			alert('get Data error: ' +textStatus);
		}
		
	});
}

function testPassPra2(){
	alert("abcefg");
    var _list = [];  
    _list[0] = 3; 
    _list[1] = 4; 
    
	$.ajax({
		type: 'POST',
		url: rootURL + '/testPassPra2',
		data: {"bankId":_list},
		dataType: "text",
		traditional: true,  //it's needed for passing arraylist to controller
		success: showCcyRegionList, 
		error: function(jqXHR, textStatus, errorThrown){
			alert('get Data error: ' +textStatus);
		}
		
	});
}


function showCcyRegionHolidayList(data){
	alert("showing data");
	var dataStr = "";
	$('#textAreaPanel').val(dataStr);
	
	var list = data == null ? [] : (data instanceof Array ? data : [data]);
	$.each(list,function(index, ccyRegionHoliday){
		dataStr = dataStr + ccyRegionHoliday.id;
		dataStr = dataStr + ",";
		dataStr = dataStr + ccyRegionHoliday.holidayDate;
		dataStr = dataStr + "\n";
	});
	$('#textAreaPanel').val(dataStr);
}

function getAllCcyRegionHolidayList(){
	$.ajax({
			type: 'GET',
			url: rootURL + '/getAllCcyRegionHolidayList',
			dataType: "Json",
			success: showCcyRegionHolidayList, 
			error: function(jqXHR, textStatus, errorThrown){
				alert('get Data error: ' +textStatus);
			}
			
		});
	
};

function addCcyRegionHolidayList(){
	var strJson = $('#textAreaPanel').val();
	alert(strJson);
	
	$.ajax({
			type: 'POST',
			contentType: 'application/json',
			url: rootURL + '/addCcyRegionHolidayList',
			data: strJson,
			dataType: "JSON",
			success: addResponse, 
			error: function(jqXHR, textStatus, errorThrown){
				alert('get Data error: ' +textStatus);
			}
			
		});
	
};

function addResponse(data){
	var list = data == null ? [] : (data instanceof Array ? data : [data]);
	alert("Result StatusCode = " + list[0].statusCode);
	alert("Result description = " + list[0].description);
}
