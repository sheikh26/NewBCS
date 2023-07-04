<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
    
    <%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">

<head>
  	<title>Welcome to Johnson Controls </title>
  	<meta name="description" content="Demo of a Sliding Login Panel using jQuery 1.3.2" />
  	<meta name="keywords" content="jquery, sliding, toggle, slideUp, slideDown, login, login form, register" />
	<meta http-equiv="content-type" content="text/html; charset=utf-8" />	
	

	<!-- stylesheets -->
  	<link rel="stylesheet" href="css/style.css" type="text/css" media="screen" />
  	<link rel="stylesheet" href="css/slide.css" type="text/css" media="screen" />
	
  	<!-- PNG FIX for IE6 -->
  	<!-- http://24ways.org/2007/supersleight-transparent-png-in-ie6 -->
	<!--[if lte IE 6]>
		<script type="text/javascript" src="js/pngfix/supersleight-min.js"></script>
	<![endif]-->	 
    <!-- jQuery - the core -->
	<script src="js/jquery-1.3.2.min.js" type="text/javascript"></script>
	<!-- Sliding effect -->
	<script src="js/slide.js" type="text/javascript"></script>

</head>

<body>
<!-- Panel -->
<div id="toppanel">
	<div id="panel">
		<div class="content clearfix">
			<div class="left">
				<p><img src="images/logo.jpg" width="246" height="108" /></p>
				
				
			</div>
			<div class="left">
				<!-- Login Form -->
	
			</div>
			<div class="left right">			
				
				<!-- Login Form -->
				<html:form  action="/check" method="Post" styleClass="clearfix">
					<h1>Member Login</h1>
					<html:errors property="invalid" />
  		            <html:errors property="name" />
  		            <html:errors property="pasword" />
					<label class="grey" for="log">Username:</label>
					<input class="field" type="text" name="name" id="log" value="" size="23" />
					<label class="grey" for="pwd">Password:</label>
					<input class="field" type="password" name="password" id="pwd" size="23" />
	            	<label>
	            	<input name="rememberme" id="rememberme" type="checkbox" checked="checked" value="forever" /> &nbsp;Remember me</label>
        			<div class="clear"></div>
        			 
					<input type="submit" name="operation" value="Login"  class="bt_login" />
					
				</html:form>
			</div>
		</div>
</div> <!-- /login -->	

	<!-- The tab on top -->	
	<div class="tab">
		<ul class="login">
			<li class="left">&nbsp;</li>
			<li>Hello Guest!</li>
			<li class="sep">|</li>
			<li id="toggle">
				<a id="open" class="open" href="#">Log In </a>
				<a id="close" style="display: none;" class="close" href="#">Collapse Panel</a>			
			</li>
			<li class="right">&nbsp;</li>
		</ul> 
	</div> <!-- / top -->
	
</div> <!--panel -->

    <div id="container">
		<div id="content" style="padding-top:30px;">
	    <img src="images/middle_image.jpg" width="1024" height="756" />
        
        </div><!-- / content -->		
	</div><!-- / container -->
</body>
</html>
