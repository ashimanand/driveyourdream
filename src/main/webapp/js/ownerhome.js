/**
 * 
 */


function AddNewCarForm(event) {
	  event.preventDefault()
	  const formData = new FormData(event.target)
	  const data = {}
	  formData.forEach((value, key) => (data[key] = value))
	  $.extend(data,{"userId" :getCookie("userId")})
	  $.extend(data,{"sessionKey" :getCookie("sessionKey")})
	  console.log(data)
	  
	  postData('../car/addcar', data)
	  .then(data => {
		  $(".msg").html('<div class="alert alert-success alert-dismissible fade show" role="alert"> <strong>Congratulations!!!</strong>'
				  +'You car has been submitted for review.<button type="button" class="close" data-dismiss="alert" aria-label="Close">'
				   + '<span aria-hidden="true">&times;</span></button></div>');
		  
		  $(".alert").delay(8000).slideUp(300, function() {
			    $(this).alert('close');
			});
		  
		$(".addCarForm").hide();
		$(".addnewcarbutton").show();
		LoadOCarList();
	    console.log(data); 
	  });
	}

function openCarForm(){
	document.getElementById("addnewcarformId").reset();
	addnewcarformId
	$(".addCarForm").show();
	$(".addnewcarbutton").hide();
}

function LoadOCarList(){
	getData("../car/getOCarList/"+getCookie("userId")+"?sessionKey="+getCookie("sessionKey")).then(data => {
		console.log(data);
		if(data.length<1){
			$(".ocartbody_").html('<h5>No record found.</h5>')
		}else{
			let row = '';
			for(let i=0 ; i < data.length; i++){
				
				row += '<tr><th scope="row">'+data[i].carNumber+'</th><td>'+data[i].model+'</td><td>'+data[i].manufacturer
				+'</td><td>'+data[i].registrationYear+'</td><td>'+data[i].carRegNum+'</td><td>'+data[i].status+'</td></tr>'; 
			}
			$(".ocartbody_").html(row);
		}
		
	});
	
}