<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>List of Tasks</title>
	<link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
	<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>

    <script type="text/javascript" src="<c:url value='/static/js/app.js' />"></script>

</head>

<body>
	<div class="generic-container">
		<%@include file="authheader.jsp" %>
		<div class="panel panel-default">
			  <!-- Default panel contents -->
		  	<div class="panel-heading"><span class="lead">List of Tasks </span></div>
			<table class="table table-hover">
	    		<thead>
		      		<tr>
				        <th>Done</th>
				        <th>Description</th>
				        <th>Last Update</th>
				       	<th width="100"></th>
					</tr>
		    	</thead>
	    		<tbody>
				<c:forEach items="${tasks}" var="task">
					<tr>
						<td><input type="checkbox" value="true" id=${task.id}
                                <c:if test="${task.isdone}">checked="checked"</c:if>
                                onclick="checkTask('${task.id}');"
                            />
                        </td>
						<td>${task.name}</td>
						<td>${task.lastUpdate}</td>
                        <td><a href="<c:url value='/delete-task-${task.id}' />" class="btn btn-danger custom-width">delete</a></td>
					</tr>
				</c:forEach>
	    		</tbody>
	    	</table>
		</div>
        <div class="well">
            <a href="<c:url value='/newtask' />">Add New Task</a>
        </div>
	 	</div>
</body>
</html>
