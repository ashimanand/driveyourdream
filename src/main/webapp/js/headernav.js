/**
 * 
 */
 function getNavHeader(){
	
	let header =  '<nav class="navbar navbar-expand-md navbar-dark bg-dark">'+
    				'<a href="#" class="navbar-brand"><img src="../images/dyd_logo.png" height="28" alt="CoolBrand"></a>'+
    				'<button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">'+
    					'<span class="navbar-toggler-icon"></span></button>'+
    				'<div class="collapse navbar-collapse" id="navbarCollapse">'+
				    '<div class="navbar-nav">'+
				       ' <a href="#" class="nav-item nav-link active">Home</a>'+
				        '<a href="#" class="nav-item nav-link">Profile</a>'+
				       ' <a href="#" class="nav-item nav-link">Messages</a>'+
				       ' <a href="#" class="nav-item nav-link disabled" tabindex="-1">Reports</a>'+
				    '</div>'+
			    '<div class="navbar-nav ml-auto">'+
			        '<a href="#" class="nav-item nav-link usenametag"></a>'+
			        '<a href="#" class="nav-item nav-link">Logout</a>'+
			    '</div></div></nav>';
	return header;
	
	
}