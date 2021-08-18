

/*jQuery( "#loginform" ).submit(function( event ) {
  alert( "Handler for .submit() called." );
  event.preventDefault();
});*/

jQuery("#loginform").click(function(fn){
	let formdata = new Form;
})

function login(){
	alert("hi user!!");
}

function loginsubmit(event) {
	  event.preventDefault()
	  const url = "https://example.com/..."
	  const formData = new FormData(event.target)
	  const data = {}
	  formData.forEach((value, key) => (data[key] = value))
	  console.log(data)
	  
	  postData('../loginowner', data)
	  .then(data => {
		  setCookie("userId" ,data.userId )
		  setCookie("sessionKey", data.sessionKey)
		  window.location.href=data.nextUri;
	    console.log(data); 
	  });
	}

//Example POST method implementation:
async function postData(url = '', data = {}) {
  // Default options are marked with *
  const response = await fetch(url, {
    method: 'POST', // *GET, POST, PUT, DELETE, etc.
   // mode: 'cors', // no-cors, *cors, same-origin
    cache: 'no-cache', // *default, no-cache, reload, force-cache, only-if-cached
   // credentials: 'same-origin', // include, *same-origin, omit
    headers: {
      'Content-Type': 'application/json'
      // 'Content-Type': 'application/x-www-form-urlencoded',
    },
    redirect: 'follow', // manual, *follow, error
    referrerPolicy: 'no-referrer', // no-referrer, *no-referrer-when-downgrade, origin, origin-when-cross-origin, same-origin, strict-origin, strict-origin-when-cross-origin, unsafe-url
    body: JSON.stringify(data) // body data type must match "Content-Type" header
  });
  return response.json(); // parses JSON response into native JavaScript objects
}

async function getData(url = '') {
	  // Default options are marked with *
	  const response = await fetch(url, {
	    method: 'GET', // *GET, POST, PUT, DELETE, etc.
	   // mode: 'cors', // no-cors, *cors, same-origin
	    cache: 'no-cache', // *default, no-cache, reload, force-cache, only-if-cached
	   // credentials: 'same-origin', // include, *same-origin, omit
	    headers: {
	      'Accept': 'application/json'
	      // 'Content-Type': 'application/x-www-form-urlencoded',
	    },
	    redirect: 'follow', // manual, *follow, error
	    referrerPolicy: 'no-referrer', // no-referrer, *no-referrer-when-downgrade, origin, origin-when-cross-origin, same-origin, strict-origin, strict-origin-when-cross-origin, unsafe-url
	    // body data type must match "Content-Type" header
	  });
	  return response.json(); // parses JSON response into native JavaScript objects
	}


function getCookie(cname) {
	  let name = cname + "=";
	  let decodedCookie = decodeURIComponent(document.cookie);
	  let ca = decodedCookie.split(';');
	  for(let i = 0; i <ca.length; i++) {
	    let c = ca[i];
	    while (c.charAt(0) == ' ') {
	      c = c.substring(1);
	    }
	    if (c.indexOf(name) == 0) {
	      return c.substring(name.length, c.length);
	    }
	  }
	  return "";
	}

function setCookie(cname, cvalue, exdays) {
	  const d = new Date();
	  d.setTime(d.getTime() + (exdays*24*60*60*1000));
	  let expires = "expires="+ d.toUTCString();
	  document.cookie = cname + "=" + cvalue + ";" + expires + ";path=/";
	}

