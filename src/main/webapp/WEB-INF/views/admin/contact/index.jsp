<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/templates/tags/taglib.jsp" %>
<c:set var="contextPath" value="${pageContext.request.contextPath }/admin/contact" />
  			<div class="content-box-large">
  				<div class="row">
	  				<div class="panel-heading">
	  					<div class="panel-title ">Quản lý liên hệ</div>
		  			</div>
				</div>
				<hr>	
				<div class="row">
					<div class="col-md-8">
						<a href="add.html" class="btn btn-success"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span>&nbsp;Thêm</a>

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
  				<c:if test="${not empty msg}">
  				<div class="alert alert-success" role="alert">
					  ${msg }
					</div>
  				</c:if>
  					<table cellpadding="0" cellspacing="0" border="0" class="table table-striped table-bordered" id="example">
						<thead>
							<tr>
								<th>ID</th>
								<th>Fullname</th>
								<th>Email</th>
								<th>Subject</th>
								<th>Content</th>
								<th>Chức năng</th>
							</tr>
						</thead>
						<tbody>
						<c:if test="${contactList ne null }">
							<c:forEach items="${contactList }" var="contact">
							<c:set var="urlDel" value="${contextPath }/del/${contact.cid }" />
								<tr class="odd gradeX">
									<td>${contact.cid }</td>
									<td>${contact.fullname }</td>
									<td>${contact.email }</td>
									<td>${contact.subject }</td>
									<td>${contact.content }</td>
									
									<td class="center text-center">
	                                    <a onclick="return confirm('Bạn có chắc chắn muốn xóa?');" href="${urlDel}" title="" class="btn btn-danger"><span class="glyphicon glyphicon-trash"></span> Xóa</a>
									</td>
								</tr>
						</c:forEach>
						</c:if>
						</tbody>
					</table>

					<!-- Pagination -->
					<nav class="text-center" aria-label="...">
					   <ul class="pagination">
					      <li class="disabled"><a href="#" aria-label="Previous"><span aria-hidden="true">«</span></a></li>
					      <li class="active"><a href="#">1 <span class="sr-only">(current)</span></a></li>
					      <li><a href="#">2</a></li>
					      <li><a href="#">3</a></li>
					      <li><a href="#">4</a></li>
					      <li><a href="#">5</a></li>
					      <li><a href="#" aria-label="Next"><span aria-hidden="true">»</span></a></li>
					   </ul>
					</nav>
					<!-- /.pagination -->
					
  				</div>
  				</div><!-- /.row -->
  			</div><!-- /.content-box-large -->

