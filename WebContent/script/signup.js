/**
 * 
 */
	var a,b,c,d,e;
	
$(document).ready(function(){
	$("#t1").blur(function(){
		validateName();
	});
	$("#t2").blur(function(){
		validateEmail();
	});
	$("#t3").blur(function(){
		validatePhone();
	});
	$("#t4").blur(function(){
		validatePword();
	});
	
	$('#form input[type=radio]').on('change', function() {
			d=true;
		   console.log($('input[name=gender]:checked', '#form').val()); 
		});
	
	/*
	$("input:radio[gender]").click(function(){
		d=true;
		console.log("hi")
		console.log($("input:radio[gender]").val());
	})*/
	
	$("#form").submit(function(){
		console.log("as");
		if(a && b && c && d && e)
			{
			window.location = "jsp/storeData.jsp"
			return true;
			}
		else 
			return false;		
	});
})

function validateName(){
		var name = $("#t1").val();
		if(name.length >15 || name.length < 3){
		$("#t1").css("background-color", "yellow");
		$("#s1").append("not valid baby");
		c = false;
		}else{
			c = true;
			console.log("name success");
		}
	}

	function validateEmail(){
			var name = $("#t2").val();
			if(name.lastIndexOf(".")<name.indexOf("@")){
				$("#s2").append(" Invalid Email");
				a =  false;
			} else{
				a = true;
				console.log("emial success");
			}
	}
	
	function validatePhone(){
			var name = $("#t3").val();
			if(name.length !=10){
				$("#s3").append("invalid number");
				b = false;
				}else{
					b = true;
					console.log("phone correct");
				}
	}
	function validatePword(){
		var name = $("#t4").val();
		if(name.length <=5){
			$("#s4").append("minimum 5 words");
			e = false;
			}else{
				e = true;
				console.log("pword correct");
			}
	
	}