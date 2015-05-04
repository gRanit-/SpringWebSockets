<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<script src="<c:url value="http://code.jquery.com/jquery-2.1.3.min.js"/>"></script>

		<link rel="stylesheet" href="<c:url value="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css"/>"">
        <script src="<c:url value="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"/>"></script>

		<script src="<c:url value="/resources/js/libs/sockjs.js"/>"></script>
		<script src="<c:url value="/resources/js/libs/stomp.js"/>"></script>
		<script src="<c:url value="/resources/js/client/client.js"/>"></script>

	</head>
	<body>
<form>
  <div class="form-group">
    <label for="messageTest">Enter Message...</label>
    <input type="text" class="form-control" id="messageText" placeholder="Enter Message">
  </div>
  </form>
	<button class="btn btn-default" id="sendMsg">Send Message</button>
	</body>
</html>