<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

<!-- 关于直接访问网页路径的寻找和转发后路径的寻找，
我的思路是在本身网页加上js文件存在的初始路径
，然后转发时根据命名空间寻找正确的路径 -->
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/Book.js"></script>
  </head>
  <body>
   <div style="width:500px;margin:0px auto;text-align:center">
	<table align='center' border='1' cellspacing='0'>
		<tr>
			<td>id</td>
			<td>name</td>
			<td>编辑</td>
			<td>删除</td>
		</tr>
		<c:forEach items="${cs}" var="c" varStatus="st">
			<tr>
				<td>${c.book_Bid}</td>
				<td>${c.book_Name}</td>
				<%-- <td><a href="editCategory?id=${c.id}">编辑</a>
				</td>
				<td><a href="deleteCategory?id=${c.id}">删除</a>
				</td> --%>
				<!-- Restful格式 -->
				<td><a href="category/${c.book_Bid}">编辑</a>
				</td>
				<td><a class="delete" href="category/${c.book_Bid}">删除</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<div style="text-align:center">
		<a href="?start=0">首 页</a>
		<c:if test="${page.start-page.count>=0}">
			<a href="?start=${page.start-page.count}">上一页</a>
		</c:if>
		<c:if test="${page.start+page.count<=page.last}">
			<a href="?start=${page.start+page.count}">下一页</a>
		</c:if>
		<a href="?start=${page.last}">末页</a>
	</div>
	<div style="text-align:center;margin-top:40px">
		<!-- <form method="post" action="addCategory"> -->
		<form method="post" action="category">
			<input type="hidden" name="_method" value="PUT"> 分类名称： <input
				name="name" value="" type="text"> <br> <br> <input
				type="submit" value="增加分类">
		</form>
	</div>
</div>
<!-- Restful格式 ，因为删除的href没有办法同时提交Value的DELETE值，拦截器无法判断，
加入一个脚本文件js控制-->
<form id="formdelete" action="" method="POST">
	<input type="hidden" name="_method" value="DELETE">
</form>
<button id="btn">点击</button>
  </body>
</html>
