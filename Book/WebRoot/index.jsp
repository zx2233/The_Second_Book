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
		<li><a href="#">图书、音像、数字商品</a><span></span> <b><a href="#">文学</a>
				<a href="#">经管</a> <a href="#">畅读VIP</a> </b>
			<div class="submenu">
				<div class="leftdiv">
					<dl>
						<dt>
							<a href="#">电子书</a>
						</dt>
						<dd>
							<a href="#">免费</a> <a href="#">小说</a> <a href="#">励志与成功</a> <a
								href="#">婚恋/两性</a> <a href="#">文学</a> <a href="#">经管</a> <a
								href="#">畅读VIP</a>
						</dd>
					</dl>
					<dl>
						<dt>
							<a href="#">数字音乐</a>
						</dt>
						<dd>
							<a href="#">通俗流行</a> <a href="#">古典音乐</a> <a href="#">摇滚说唱</a> <a
								href="#">爵士蓝调</a> <a href="#">乡村民谣</a> <a href="#">有声读物</a>
						</dd>
					</dl>
					<dl>
						<dt>
							<a href="#">音像</a>
						</dt>
						<dd>
							<a href="#">音乐</a> <a href="#">影视</a> <a href="#">教育音像</a> <a
								href="#">游戏</a>
						</dd>
					</dl>
					<dl>
						<dt>
							<a href="#">文艺</a>
						</dt>
						<dd>
							<a href="#">小说</a> <a href="#">文学</a> <a href="#">青春文学</a> <a
								href="#">传记</a> <a href="#">艺术</a>
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
		<li><a href="#">家用电器</a> <span></span>
			<div class="submenu">
				<div class="leftdiv">
					<dl>
						<dt>
							<a href="#">大 家 电</a>
						</dt>
						<dd>
							<a href="#">平板电视</a> <a href="#">空调</a> <a href="#">冰箱</a> <a
								href="#">洗衣机</a> <a href="#">家庭影院</a> <a href="#">DVD</a> <a
								href="#">迷你音响</a> <a href="#">烟机/灶具</a> <a href="#">热水器</a> <a
								href="#">消毒柜/洗碗机</a> <a href="#">酒柜/冷柜</a> <a href="#">家电配件</a>
						</dd>
					</dl>
					<dl>
						<dt>
							<a href="#">生活电器</a>
						</dt>
						<dd>
							<a href="#">电风扇</a> <a href="#">冷风扇</a> <a href="#">净化器</a> <a
								href="#">饮水机</a> <a href="#">净水设备</a> <a href="#">挂烫机/熨斗</a> <a
								href="#">吸尘器</a> <a href="#">电话机</a> <a href="#">插座</a> <a
								href="#">收录/音机</a> <a href="#">清洁机</a> <a href="#">加湿器</a> <a
								href="#">除湿/干衣机</a> <a href="#">取暖电器</a> <a href="#">其它生活电器</a>
						</dd>
					</dl>
					<dl>
						<dt>
							<a href="#">厨房电器</a>
						</dt>
						<dd>
							<a href="#">电压力锅</a> <a href="#">电饭煲</a> <a href="#">豆浆机</a> <a
								href="#">面包机</a> <a href="#">咖啡机</a> <a href="#">微波炉</a> <a
								href="#">料理/榨汁机</a> <a href="#">电烤箱</a> <a href="#">电磁炉</a> <a
								href="#">电饼铛/烧烤盘</a> <a href="#">煮蛋器</a> <a href="#">酸奶机</a> <a
								href="#">电水壶/热水瓶</a> <a href="#">电炖锅</a> <a href="#">多用途锅</a> <a
								href="#">果蔬解毒机</a> <a href="#">其它厨房电器</a>
						</dd>
					</dl>
					<dl>
						<dt>
							<a href="#">个护健康</a>
						</dt>
						<dd>
							<a href="#">剃须刀</a> <a href="#">剃/脱毛器</a> <a href="#">口腔护理</a> <a
								href="#">电吹风</a> <a href="#">美容</a> <a href="#">美发</a> <a
								href="#">按摩器</a> <a href="#">按摩椅</a> <a href="#">足浴盆</a> <a
								href="#">血压计</a> <a href="#">健康秤/厨房秤</a> <a href="#">血糖仪</a> <a
								href="#">体温计</a> <a href="#">计步器/脂肪检测仪</a> <a href="#">其它健康电器</a>
						</dd>
					</dl>
					<dl>
						<dt>
							<a href="#">五金家装</a>
						</dt>
						<dd>
							<a href="#">电动工具</a> <a href="#">手动工具</a> <a href="#">仪器仪表</a> <a
								href="#">浴霸/排气扇</a> <a href="#">灯具</a> <a href="#">LED灯</a> <a
								href="#">洁身器</a> <a href="#">水槽</a> <a href="#">龙头</a> <a
								href="#">淋浴花洒</a> <a href="#">厨卫五金</a> <a href="#">家具五金</a> <a
								href="#">门铃</a> <a href="#">电气开关</a> <a href="#">插座</a> <a
								href="#">电工电料</a> <a href="#">监控安防</a> <a href="#">电线/线缆</a>
						</dd>
					</dl>
				</div>
				<div class="rightdiv"></div>
			</div>
		</li>
		<li><a href="#">手机、数码</a><span></span>
			<div class="submenu">
				<div class="leftdiv">
					<dl>
						<dt>
							<a href="#">手机通讯</a>
						</dt>
						<dd>
							<a href="#">手机</a> <a href="#">对讲机</a>
						</dd>
					</dl>
					<dl>
						<dt>
							<a href="#">京东通信</a>
						</dt>
						<dd>
							<a href="#">选号中心</a> <a href="#">自助服务</a>
						</dd>
					</dl>
					<dl>
						<dt>
							<a href="#">运营商</a>
						</dt>
						<dd>
							<a href="#">购机送费</a> <a href="#">0元购机</a> <a href="#">选号入网</a>
						</dd>
					</dl>
					<dl>
						<dt>
							<a href="#">手机配件</a>
						</dt>
						<dd>
							<a href="#">电池</a> <a href="#">蓝牙耳机</a> <a href="#">充电器/数据线</a> <a
								href="#">手机耳机</a> <a href="#">贴膜</a> <a href="#">存储卡</a> <a
								href="#">保护套</a> <a href="#">车载</a> <a href="#">iPhone配件</a> <a
								href="#">创意配件</a> <a href="#">便携/无线音箱</a> <a href="#">手机饰品</a>
						</dd>
					</dl>
					<dl>
						<dt>
							<a href="#">摄影摄像</a>
						</dt>
						<dd>
							<a href="#">数码相机</a> <a href="#">单电/微单相机</a> <a href="#">单反相机</a>
							<a href="#">拍立得</a> <a href="#">运动相机</a> <a href="#">摄像机</a> <a
								href="#">镜头</a> <a href="#">户外器材</a> <a href="#">摄影器材</a>
						</dd>
					</dl>
					<dl>
						<dt>
							<a href="#">数码配件</a>
						</dt>
						<dd>
							<a href="#">存储卡</a> <a href="#">读卡器</a> <a href="#">滤镜</a> <a
								href="#">闪光灯/手柄</a> <a href="#">相机包</a> <a href="#">三脚架/云台</a> <a
								href="#">相机清洁</a> <a href="#">相机贴膜</a> <a href="#">机身附件</a> <a
								href="#">镜头附件</a> <a href="#">电池/充电器</a> <a href="#">移动电源</a>
						</dd>
					</dl>
					<dl>
						<dt>
							<a href="#">时尚影音</a>
						</dt>
						<dd>
							<a href="#">耳机/耳麦</a> <a href="#">音箱/音响</a> <a href="#">麦克风</a> <a
								href="#">MP3/MP4</a> <a href="#">数码相框</a> <a href="#">专业音频</a> <a
								href="#">苹果周边</a>
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
								<form class="form-search">
									<div class="input-append">
										<input type="text" class="span9 search-query">
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
				<img src="D:\工作软件\Tomcat_7.0.75\apache-tomcat-7.0.75\webapps\Book\img\abc123是.png"></img>
					</div>
				</div>
				<div class="list_book">
					<div class="list_book1"></div>
				</div>
				<div class="list_book">
					<div class="list_book1"></div>
				</div>
				<div class="list_book">
					<div class="list_book1"></div>
				</div>
				<div class="list_book">
					<div class="list_book1"></div>
				</div>
				<div class="list_book">
					<div class="list_book1"></div>
				</div>
				<div class="list_book">
					<div class="list_book1"></div>
				</div>
				<div class="list_book">
					<div class="list_book1"></div>
				</div>
				<div class="list_book">
					<div class="list_book1"></div>
				</div>
				<div class="list_book">
					<div class="list_book1"></div>
				</div>
				<div class="list_book">
					<div class="list_book1"></div>
				</div>
				<div class="list_book">
					<div class="list_book1"></div>
				</div>
			</div>
		</div>
	</div>

	<HR style="FILTER: alpha(opacity=0,finishopacity=100,style=1)"
		width="80%" color=#987cb9 SIZE=3>
	<div id="footer">
		<div class="container">
			<p class="muted credit">此致感谢 cctv</p>
		</div>
	</div>
</body>
</html>
