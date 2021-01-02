<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<script src="https://code.jquery.com/jquery-1.11.1.min.js"></script> 
<!-- <script src="https://cdn.datatables.net/1.10.4/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/plug-ins/9dcbecd42ad/integration/jqueryui/dataTables.jqueryui.js"/> -->
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/dt/dt-1.10.21/datatables.min.css"/>
<script type="text/javascript" src="https://cdn.datatables.net/v/dt/dt-1.10.21/datatables.min.js"></script>
<link rel="stylesheet" href="https://cdn.datatables.net/plug-ins/9dcbecd42ad/integration/jqueryui/dataTables.jqueryui.css"/>	
<c:set var="path" value="${pageContext.request.contextPath}" />
<div class="container col-md-11">
	<div class="card">
		<div class="card-header">
			<strong> <i class="fa fa-th-list"></i> <spring:message
					code="label.user.list" />
			</strong>
		</div>
		<div class="card-body">
			<table id="dtablesel" class="table table-bordered table-condensed table-hover table-striped">
				<thead>
					<tr>
						<th><spring:message code="label.fullname"/></th>
						<th><spring:message code="label.userid"/></th>
						<th><spring:message code="label.username"/></th>
						<th><spring:message code="label.email"/></th>
						<th><spring:message code="label.mobile"/></th>
						
					</tr>
				</thead>
			</table>
		</div>
	</div>
</div>
<script type="text/javascript">
$(document).ready(function() {
    $('#dtablesel').DataTable();
});		
</script>