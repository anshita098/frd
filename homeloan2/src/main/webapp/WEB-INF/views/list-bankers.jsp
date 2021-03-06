<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value="/resources/css/style2.css"/>"
 rel="stylesheet">
</head>
<body>
<h2>CRM - Customer Relationship Manager</h2>
<hr color="pink" size="3" />
<img src="<c:url value="/resources/images/lti.png"/>"/>

			<input type="button" value="Add Banker"
				onclick="window.location.href='showForm'; return false;"/>
				<br/><br/>
				<h3>Customer List</h3>
				<table border=1>
						<tr>
							<th>First Name</th>
							<th>Password</th>
							<th>Email</th>
							<th>Action</th>
						</tr>

						<!-- loop over and print our customers -->
						<c:forEach var="tempBanker" items="${banker}">

							<!-- construct an "update" link with customer id -->
							<c:url var="updateLink" value="/banker/updateForm">
								<c:param name="bankerId" value="${tempBanker.id}" />
							</c:url>

							<!-- construct an "delete" link with customer id -->
							<c:url var="deleteLink" value="/customer/delete">
								<c:param name="bankerId" value="${tempBanker.id}" />
							</c:url>

							<tr bgcolor="pink">
								<td>${tempBanker.firstname}</td><!-- tempCustomer is pointing to customer, -->
								<td>${tempBanker.password}</td>
								<td>${tempBanker.email}</td>

								<td>
									<!-- display the update link --> <a href="${updateLink}">Update</a>
									| <a href="${deleteLink}"
									onclick="if (!(confirm('Are you sure you want to delete this banker?'))) return false">Delete</a>
								</td>

							</tr>

						</c:forEach>

					</table>
				
</body>
</html>