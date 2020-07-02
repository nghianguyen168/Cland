<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/templates/tags/taglib.jsp" %>

					<!-- day la slide -->
					<div class="clearfix content">
						<div class="content_title"><h2>Bài viết mới</h2></div>
						<c:set var="contextPath" value="${pageContext.request.contextPath}/cland" />
						<c:if test="${landList ne null }">
						<c:forEach items="${landList }" var="land">
							<div class="clearfix single_content">
								<div class="clearfix post_date floatleft">
								<fmt:formatDate pattern="dd" value="${land.date_create }" var="day"/>
								<fmt:formatDate pattern="MM" value="${land.date_create }" var="month"/>
									<div class="date">
										<h3>${day}</h3>
										<p>Tháng ${month }</p>
									</div>
								</div>
								<div class="clearfix post_detail">
									<h2><a href="${contextPath}/detail/${land.lid}">${land.lname } </a></h2>
									<div class="clearfix post-meta">
										<p><span><i class="fa fa-clock-o"></i>${land.address }</span> <span><i class="fa fa-folder">\
										</i> Diện tích: ${land.area }m2</span></p>
									</div>
									<div class="clearfix post_excerpt">
										<img src="${pageContext.request.contextPath}/resources/cland/images/thumb.png" alt=""/>
										<p>${land.description.substring(0,150) }.... </p>
									</div>
									<a href="">Đọc thêm</a>
								</div>
							</div>
						</c:forEach>
						</c:if>
					
						
											
					</div>
					
					