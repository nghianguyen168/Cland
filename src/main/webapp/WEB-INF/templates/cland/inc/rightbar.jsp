<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/templates/tags/taglib.jsp"%>
<div class="clearfix sidebar">
	<c:set var="contextPath" value="${pageContext.request.contextPath }/cland" />
	<div class="clearfix single_sidebar category_items">
		<h2>Danh mục bất động sản</h2>
		<ul>
			<c:if test="${catList ne null }">
				<c:forEach items="${catList }" var="cat">
					<li class="cat-item"><a
						href="${contextPath }/cat/${cat.cid}">${cat.cname }</a>(${cat.count })</li>
				</c:forEach>
			</c:if>
		</ul>
	</div>

	<div class="clearfix single_sidebar">
		<div class="popular_post">
			<div class="sidebar_title">
				<h2>Xem nhiều</h2>
			</div>
			<ul>
				<c:if test="${landTrends ne null }">
					<c:forEach items="${landTrends }" var="land">
						<li><a href="${contextPath }/detail/${land.lid}">${land.lname } </a></li>
					</c:forEach>
				</c:if>
			</ul>
		</div>
	</div>

	<div class="clearfix single_sidebar">
		<h2>Danh mục hot</h2>
		<ul>
			<li><a href="">Category Name <span>(12)</span></a></li>
			<li><a href="">Category Name <span>(12)</span></a></li>
			<li><a href="">Category Name <span>(12)</span></a></li>
			<li><a href="">Category Name <span>(12)</span></a></li>
		</ul>
	</div>
</div>