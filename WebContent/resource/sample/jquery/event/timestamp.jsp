<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="../css/import.css" />
<style>
	div { height: 100px; width: 300px; margin: 10px; 
	      background-color: #ffd; overflow: auto; }
</style>
<script type="text/javascript" charset="UTF-8" src="../scripts/jquery/jquery-1.6.4.js"></script>
<script type="text/javascript" charset="UTF-8" src="../scripts/jquery/base.js"></script>
<script type="text/javascript" charset="UTF-8">
	 $(document).ready(function(){
		 var last, diff;
		 $('div').click(function(event) {
		   if ( last ) {
		     diff = event.timeStamp - last
		     $('div').append('time since last event: ' + diff + '<br/>');
		   } else {
		     $('div').append('Click again.<br/>');
		   }
		   last = event.timeStamp;
		 });  
	 });
</script>
</head>
<body>
	
	<h2 class="title"> 이벤트 타임스탬프 </h2>
	
	<div>Click.</div>
	
	<pre>
	 var last, diff;
		 $('div').click(function(event) {
		   if ( last ) {
		     diff = event.timeStamp - last
		     $('div').append('time since last event: ' + diff + 'br태그');
		   } else {
		     $('div').append('Click again.br태그');
		   }
		   last = event.timeStamp;
		 });
	</pre>
	
	
	<ul style="margin-top: 50px;">	
		<li><a href="javascript:history.back();">[뒤로가기]</a></li>
	</ul>
</body>
</html>