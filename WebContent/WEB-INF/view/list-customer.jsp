<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Customer</title>

<link type="text/css"
	rel = "stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css"/>
	
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>CRM</h2>
		</div>

		<div id="container">
			<div id="content">
				<input type="button" value="Add Customer"
					onclick="window.location.href='showFormForAdd'; return false;"
					class = "add-button"/>
				
				<table>
					<tr>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Email</th>
						<th>Action</th>
					</tr>
					
					<c:forEach var="c" items="${customers}">
						<!--  update link -->
						<c:url var="updateLink" value="/customer/showFormForUpdate">
							<c:param name="customerId" value="${c.id}"/>
						</c:url>
							
						<!--  delete link -->
						<c:url var="deleteLink" value="/customer/delete">
							<c:param name="customerId" value="${c.id}"/>
						</c:url>						
						
						<tr>
							<td>${c.firstName}</td>
							<td>${c.lastName}</td>
							<td>${c.email}</td>
							<td><a href="${updateLink}">update</a> | 
								<a href="${deleteLink}" onclick="if(!(confirm('Are you sure?'))) return false">delete</a>
							</td>
						</tr>
						
					</c:forEach>
				</table>
			</div>
		</div>
	</div>
</body>
</html>