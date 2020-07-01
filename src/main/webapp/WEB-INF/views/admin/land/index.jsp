<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/templates/tags/taglib.jsp" %>
<c:set var="contextPath" value="${pageContext.request.contextPath }/admin/land" />
  			<div class="content-box-large">
  				<div class="row">
	  				<div class="panel-heading">
	  					<div class="panel-title ">Quản lý truyện</div>
		  			</div>
				</div>
				<hr>	
				<div class="row">
					<div class="col-md-8">
						<a href="${contextPath }/add" class="btn btn-success"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span>&nbsp;Thêm</a>

					</div>
                	<div class="col-md-4">
                 	 <div class="input-group form">
                       <input type="text" class="form-control" placeholder="Search...">
                       <span class="input-group-btn">
                         <button class="btn btn-primary" type="button">Search</button>
                       </span>
                  	 </div>
                  	</div>
				</div>

				<div class="row">
  				<div class="panel-body">
  					<table cellpadding="0" cellspacing="0" border="0" class="table table-striped table-bordered" id="example">
						<thead>
							<tr>
								<th>ID</th>
								<th>Tên</th>
								<th>Danh mục</th>
								<th>Lượt đọc</th>
								<th>Hình ảnh</th>
								<th>Chức năng</th>
							</tr>
						</thead>
						<tbody>
						<c:if test="${landList ne null }">
							<c:forEach items="${landList }" var="land">
							<c:set var="urlEdit" value="${contextPath }/edit/${land.lid }" />
							<c:set var="urlDel" value="${contextPath }/edit/${land.lid }" />
									<tr class="odd gradeX">
										<td>${land.lid }</td>
										<td>${land.lname }</td>
										<td>${land.categories.cname }</td>
										<td class="center"> ${land.count_views }</td>
										<td class="center text-center">
										<c:choose>
											<c:when test="${not empty land.picture}">
												<img src="${pageContext.request.contextPath }/resources/images/${land.picture}" />
											</c:when>
											<c:otherwise>
												<img src="${pageContext.request.contextPath }/resources/admin/images/hihi.png" />
											</c:otherwise>
										</c:choose>
										
											
										</td>
										<td class="center text-center">
											<a href="" title="" class="btn btn-primary"><span class="glyphicon glyphicon-pencil "></span> Sửa</a>
		                                    <a href="" title="" class="btn btn-danger"><span class="glyphicon glyphicon-trash"></span> Xóa</a>
										</td>
									</tr>
								</c:forEach>
							</c:if>
						</tbody>
					</table>

					<!-- Pagination -->
					<nav class="text-center" aria-label="...">
					   <ul class="pagination">
					   <c:choose>
					   		<c:when test="${page >=1 }">
					   			<li disabled="disabled" class=""><a href="${contextPath}/index/1" aria-label="Previous"><span aria-hidden="">«</span></a></li>
					   		</c:when>
					   		<c:otherwise>
					   			<li class="disabled"><a href="${contextPath}/index/${page-1}" aria-label="Previous"><span aria-hidden="true">«</span></a></li>
					   		</c:otherwise>
					   </c:choose>
					      
					      	<c:forEach begin="1" end="${totalPage }" var="i">
					      		<c:choose>
					      			<c:when test="${page == i }">
					      				 <li class="active"><a href="${contextPath}/index/${i}">${i}<span class="sr-only">(current)</span></a></li>
					      			</c:when>
					     			<c:otherwise>
					     			 	<li class=""><a href="${contextPath}/index/${i}">${i}<span class="sr-only">(current)</span></a></li>
					     			</c:otherwise>
					      		</c:choose>
					      	</c:forEach>
					      	
					      	 <c:choose>
					   		<c:when test="${page<totalPage }">
					   			<li class=""><a href="${contextPath}/index/${page+1}" aria-label="Next"><span aria-hidden="">»</span></a></li>
					   		</c:when>
					   		<c:otherwise>
					   			<li class=""><a href="${contextPath}/index/${totalPage}" aria-label="Previous"><span aria-hidden="true">»</span></a></li>
					   		</c:otherwise>
					   </c:choose>
					     
					   </ul>
					</nav>
					<!-- /.pagination -->
					
  				</div>
  				</div><!-- /.row -->
  			</div><!-- /.content-box-large -->
