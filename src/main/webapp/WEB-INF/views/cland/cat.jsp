<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/templates/tags/taglib.jsp" %>
	<c:set var="contextPath" value="${pageContext.request.contextPath }/cland" />
						<div class="content_title"><h2>Our Works</h2></div>
						
						<div class="clearfix single_work_container">
						<c:if test="${landListByCat ne null }">
						<c:forEach items="${landListByCat }" var="land">
						
							<div class="clearfix single_work">
								<img class="img_top" src="${pageContext.request.contextPath}/resources/cland/images/work1.png" alt=""/>
								<img class="img_bottom" src="${pageContext.request.contextPath}/resources/cland/images/work_bg2.png" alt=""/>
								<h2>${land.lname }</h2>
								<a href="${contextPath }/detail/${land.lid}"><p class="caption">${land.lname }</p></a>
							</div>
							</c:forEach>
						</c:if>

						</div>
					

		
