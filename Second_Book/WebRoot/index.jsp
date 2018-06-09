<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>


<head>
<base href="<%=basePath%>">
<title>hei,girl</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/Leftdaohang.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
<link rel="stylesheet" href="css/bootstrap-responsive.min.css"
	type="text/css"></link>
<script type="text/javascript" src="js/index.js"></script>
<link rel="stylesheet" href="css/index.css" type="text/css"></link>
<link rel="stylesheet" href="css/top.css" type="text/css"></link>
<style type="text/css">
.list_book {
	background-color: red;
	float: left;
	width: 200px;
	height: 200px;
	margin-left: 30px;
	margin-top: 15px;
}

.list_book1 {
	background-color: white;
	width: 190px;
	height: 190px;
	margin-left: 5px;
	margin-top: 5px;
}
.imagelist{
	width: 190px;
	height: 150px;
}
</style>
<body>
	<!-- Part 1: Wrap all page content here -->
	<div id="wrap">
		<div class="navbar navbar-inverse navbar-fixed-top">
			<div class="navbar-inner">
				<div class="container-fluid">
					<button type="button" class="btn btn-navbar" data-toggle="collapse"
						data-target=".nav-collapse">
						<span class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="brand" href="index.jsp">二手市场</a>
					<div class="nav-collapse collapse">
						<p class="navbar-text pull-right">
							Logged in as <a href="Login.jsp" class="navbar-link">Username</a>
							${sessionScope.user}
						</p>
						<ul class="nav">
							<li class="active"><a href="#">首页</a></li>
							<li><a href="Publish.jsp">发布商品</a></li>
							<li><a href="#contact">开发人员</a></li>
						</ul>
					</div>
					<!--/.nav-collapse -->
				</div>
			</div>
		</div>
	</div>
	<div class="row-fluid">

		<div class="span12" style="background-color: #f5f5f5">
			<div class="span12">
				<div class="row-fluid">
					<div class="span3" style="padding-left: 5px;padding-top: 10px" id="divleft">
						<div class="well sidebar-nav">
							<ul class="topmenu">
		<div class="toptitle">全部书籍分类</div>
		<li><a href="#">计算机科学与软件工程</a><span></span> <b><a href="#">软件</a>
				<a href="#">化工</a> <a href="#">土木工程</a> </b>
			<div class="submenu">
				<div class="leftdiv">
					<dl>
						<dt>
							<a href="#">教学用书</a>
						</dt>
						<dd>
							<a href="listAllBookPublish?condition=java">java</a> <a href="#">C#</a> <a href="#">Android</a> <a
								href="#">C</a> <a href="#">C++</a> <a href="#">Python</a> <a
								href="#">Kotlin</a>
						</dd>
					</dl>
					<dl>
							<dt>
							<a href="#">教学用书</a>
						</dt>
						<dd>
							<a href="#">java</a> <a href="#">C#</a> <a href="#">Android</a> <a
								href="#">C</a> <a href="#">C++</a> <a href="#">Python</a> <a
								href="#">Kotlin</a>
						</dd>
					</dl>
					<dl>
							<dt>
							<a href="#">教学用书</a>
						</dt>
						<dd>
							<a href="#">java</a> <a href="#">C#</a> <a href="#">Android</a> <a
								href="#">C</a> <a href="#">C++</a> <a href="#">Python</a> <a
								href="#">Kotlin</a>
						</dd>
					</dl>
					<dl>
							<dt>
							<a href="#">教学用书</a>
						</dt>
						<dd>
							<a href="#">java</a> <a href="#">C#</a> <a href="#">Android</a> <a
								href="#">C</a> <a href="#">C++</a> <a href="#">Python</a> <a
								href="#">Kotlin</a>
						</dd>
					</dl>
					<dl>
						<dt>
							<a href="#">人文社科</a>
						</dt>
						<dd>
							<a href="#">历史</a> <a href="#">心理学</a> <a href="#">政治/军事</a> <a
								href="#">国学/古籍</a> <a href="#">哲学/宗教</a> <a href="#">社会科学</a>
						</dd>
					</dl>
					<dl>
						<dt>
							<a href="#">经管励志</a>
						</dt>
						<dd>
							<a href="#">经济</a> <a href="#">金融与投资</a> <a href="#">管理</a> <a
								href="#">励志与成功</a>
						</dd>
					</dl>

				</div>
			</div>
		</li>
		<li><a href="#">考研专用</a> <span></span>
			<div class="submenu">
				<div class="leftdiv">
					<dl>
						<dt>
							<a href="#">语文</a>
						</dt>
						<dd>
							<a href="#">历史</a> <a href="#">心理学</a> <a href="#">政治/军事</a> <a
								href="#">国学/古籍</a> <a href="#">哲学/宗教</a> <a href="#">社会科学</a>
						</dd>
					</dl>
					<dl>
						<dt>
							<a href="#">数学</a>
						</dt>
						<dd>
						<a href="#">历史</a> <a href="#">心理学</a> <a href="#">政治/军事</a> <a
								href="#">国学/古籍</a> <a href="#">哲学/宗教</a> <a href="#">社会科学</a>
						</dd>
					</dl>
					<dl>
						<dt>
							<a href="#">英语</a>
						</dt>
						<dd>
						
							<a href="#">经济</a> <a href="#">金融与投资</a> <a href="#">管理</a> <a
								href="#">励志与成功</a>
						</dd>
					</dl>
					<dl>
						<dt>
							<a href="#">历史</a>
						</dt>
						<dd>
							<a href="#">历史</a> <a href="#">心理学</a> <a href="#">政治/军事</a> <a
								href="#">国学/古籍</a> <a href="#">哲学/宗教</a> <a href="#">社会科学</a>
						</dd>
					</dl>
					<dl>
						<dt>
							<a href="#">政治</a>
						</dt>
						<dd>
							<a href="#">历史</a> <a href="#">心理学</a> <a href="#">政治/军事</a> <a
								href="#">国学/古籍</a> <a href="#">哲学/宗教</a> <a href="#">社会科学</a>
						</dd>
					</dl>
				</div>
				<div class="rightdiv"></div>
			</div>
		</li>
		<li><a href="#">其他书籍</a><span></span>
			<div class="submenu">
				<div class="leftdiv">
					<dl>
						<dt>
							<a href="#">大一</a>
						</dt>
						<dd>
							<a href="#">历史</a> <a href="#">心理学</a> <a href="#">政治/军事</a> <a
								href="#">国学/古籍</a> <a href="#">哲学/宗教</a> <a href="#">社会科学</a>
							<a href="#">经济</a> <a href="#">金融与投资</a> <a href="#">管理</a> <a
								href="#">励志与成功</a>
						</dd>
					</dl>
					<dl>
						<dt>
							<a href="#">大二</a>
						</dt>
						<dd>
						<a href="#">历史</a> <a href="#">心理学</a> <a href="#">政治/军事</a> <a
								href="#">国学/古籍</a> <a href="#">哲学/宗教</a> <a href="#">社会科学</a>
							<a href="#">经济</a> <a href="#">金融与投资</a> <a href="#">管理</a> <a
								href="#">励志与成功</a>
						</dd>
					</dl>
					<dl>
						<dt>
							<a href="#">运营商</a>
						</dt>
						<dd>
							<a href="#">历史</a> <a href="#">心理学</a> <a href="#">政治/军事</a> <a
								href="#">国学/古籍</a> <a href="#">哲学/宗教</a> <a href="#">社会科学</a>
							<a href="#">经济</a> <a href="#">金融与投资</a> <a href="#">管理</a> <a
								href="#">励志与成功</a>
						</dd>
					</dl>
					<dl>
						<dt>
							<a href="#">大三</a>
						</dt>
						<dd>
							<a href="#">历史</a> <a href="#">心理学</a> <a href="#">政治/军事</a> <a
								href="#">国学/古籍</a> <a href="#">哲学/宗教</a> <a href="#">社会科学</a>
							<a href="#">经济</a> <a href="#">金融与投资</a> <a href="#">管理</a> <a
								href="#">励志与成功</a>
						</dd>
					</dl>
					<dl>
						<dt>
							<a href="#">大四</a>
						</dt>
						<dd>
							<a href="#">历史</a> <a href="#">心理学</a> <a href="#">政治/军事</a> <a
								href="#">国学/古籍</a> <a href="#">哲学/宗教</a> <a href="#">社会科学</a>
							<a href="#">经济</a> <a href="#">金融与投资</a> <a href="#">管理</a> <a
								href="#">励志与成功</a>
						</dd>
					</dl>
					<dl>
						<dt>
							<a href="#">研究生</a>
						</dt>
						<dd>
							<a href="#">历史</a> <a href="#">心理学</a> <a href="#">政治/军事</a> <a
								href="#">国学/古籍</a> <a href="#">哲学/宗教</a> <a href="#">社会科学</a>
							<a href="#">经济</a> <a href="#">金融与投资</a> <a href="#">管理</a> <a
								href="#">励志与成功</a>
						</dd>
					</dl>
					<dl>
						<dt>
							<a href="#">其他书籍</a>
						</dt>
						<dd>
							<a href="#">历史</a> <a href="#">心理学</a> <a href="#">政治/军事</a> <a
								href="#">国学/古籍</a> <a href="#">哲学/宗教</a> <a href="#">社会科学</a>
							<a href="#">经济</a> <a href="#">金融与投资</a> <a href="#">管理</a> <a
								href="#">励志与成功</a>
						</dd>
					</dl>

				</div>
				<div class="rightdiv"></div>
			</div>
		</li>
		<li><a href="#">天文</a><span></span></li>
		<li><a href="#">地理</a><span></span></li>
		<li><a href="#">语文</a><span></span></li>
		<li><a href="#">数学</a><span></span></li>
		<li><a href="#">地理</a><span></span></li>
		<li><a href="#">语文</a><span></span></li>
		<li><a href="#">数学</a><span></span></li>
	</ul>
						</div>
					</div>
					<div class="span9">
						<div class="row-fluid">
							<div class="span6 offset1">
								<div id="myCarousel" class="carousel slide"
									style="padding-top: 8px">
									<ol class="carousel-indicators">
										<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
										<li data-target="#myCarousel" data-slide-to="1"></li>
										<li data-target="#myCarousel" data-slide-to="2"></li>
									</ol>
									<!-- Carousel items -->
									<div class="carousel-inner">
										<div class="active item">
											<a href="#"> <img src="Photo/IMG_0090.JPG"></img> </a>
											<h4>Third Thumbnail label</h4>
											<p>Cras justo odio, dapibus ac facilisis in</p>
										</div>
										<div class="item">
											<img src="Photo/IMG_0089.JPG"></img>
											<h4>Third Thumbnail label</h4>
											<p>Cras justo odio, dapibus ac facilisis in</p>
										</div>
										<div class="item">
											<img src="Photo/IMG_0090.JPG"></img>
											<h4>Third Thumbnail label</h4>
											<p>Cras justo odio, dapibus ac facilisis in</p>
										</div>
									</div>
									<!-- Carousel nav -->
									<a class="carousel-control left" href="#myCarousel"
										data-slide="prev">&lsaquo;</a> <a
										class="carousel-control right" href="#myCarousel"
										data-slide="next">&rsaquo;</a>
								</div>
							</div>
							<div class="span3 offset1" style="padding-top: 100px">
								<center>
									<font color=" #e4393c"><h4>点我搜索</h4> </font>
								</center>
								<form class="form-search" action="listAllBookPublish">
									<div class="input-append">
										<input type="text" name="condition" class="span9 search-query">
										<button type="submit" class="btn">Search</button>
									</div>
								</form>
								<a href="#" style="padding-left: 8px; color:#313131">java</a> <a
									href="#" style="padding-left: 10px;color:#313131">Android</a> <a
									href="#" style="padding-left: 10px;color:#313131">C</a> <a
									href="#" style="padding-left: 10px;color:#313131">python</a>
								<p>
								<p>
									<i class="icon-glass" style="padding-left:8px;"></i> <i
										class="icon-search" style="padding-left:10px;"></i> <i
										class="icon-music" style="padding-left:10px;"></i> <i
										class="icon-heart" style="padding-left:10px;"></i>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="span12">
				<div class="list_book">
					<div class="list_book1">
						<a href=""><img  class="imagelist" src="img\那不勒斯的萤火.PNG "></img>
						<h5>那不勒斯的萤火</h5>
						</a>
					</div>
				</div>
				<div class="list_book">
					<div class="list_book1">
						<a href=""><img  class="imagelist" src="img\那不勒斯的萤火.PNG "></img>
						<h5>那不勒斯的萤火</h5>
						</a>
					</div>
				</div>
				<div class="list_book">
					<div class="list_book1">
						<a href=""><img  class="imagelist" src="img\那不勒斯的萤火.PNG"></img>
						<h5>那不勒斯的萤火</h5>
						</a>
					</div>
				</div>
				<div class="list_book">
					<div class="list_book1">
						<a href=""><img  class="imagelist" src="img\那不勒斯的萤火.PNG"></img>
						<h5>那不勒斯的萤火</h5>
						</a>
					</div>
				</div>
				<div class="list_book">
					<div class="list_book1">
						<a href=""><img  class="imagelist" src="img\那不勒斯的萤火.PNG "></img>
						<h5>那不勒斯的萤火</h5>
						</a>
					</div>
				</div>
				<div class="list_book">
					<div class="list_book1">
						<a href=""><img  class="imagelist" src="img\那不勒斯的萤火.PNG "></img>
						<h5>那不勒斯的萤火</h5>
						</a>
					</div>
				</div>
				<c:forEach items="${cs}" var="c" >
					<div class="list_book">
						<div class="list_book1">
							<a href=""><img  class="imagelist" src="${c.book_Image} "></img>
							<h5>${c.book_Name}</h5>
							</a>
						</div>
					</div>
				</c:forEach>		
			</div>
			<div style="text-align:center">
						<a href="listAllBookPublish?start=0&condition=${condition}">首 页</a>
					<c:if test="${page.start-page.count>=0}">
						<a href="listAllBookPublish?start=${page.start-page.count}&condition=${condition}">上一页</a>
					</c:if>
					<c:if test="${page.start+page.count<=page.last}">
						<a href="listAllBookPublish?start=${page.start+page.count}&condition=${condition}">下一页</a>
					</c:if>
						<a href="listAllBookPublish?start=${page.last}&condition=${condition}">末页</a>
			</div>
		</div>
	</div>
	<HR style="FILTER: alpha(opacity=0,finishopacity=100,style=1)"
		width="100%" color=#987cb9 SIZE=3>
	<div id="footer">
		<div class="container">
			<p class="muted credit">此致感谢 cctv</p>
		</div>
	</div>
</body>
</html>
