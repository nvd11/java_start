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

