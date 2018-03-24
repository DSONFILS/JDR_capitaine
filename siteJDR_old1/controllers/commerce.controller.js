function ajax(callback){
	$.ajax({
		dataType: "json",
		url: 'https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js',
		success: callback
	})
}

function onSuccess(data){
	console.log(data.exp);
}

ajax(onSucces)