<!-- View Responsible For ProcessedData -->

<%@page import="com.ssi.*"%>
<%
	InterestModel model=(InterestModel)session.getAttribute("model");
%>

<html>
<body>
	<h3>Interest-Details</h3>
	<hr>
	<pre>
		Amount	<%=model.getAmount()%>
		Time	<%=model.getTime() %>
		Rate	<%=model.getRate() %>
		Intrst	<%=model.getInterest()%>
		NetAmt	<%=model.getNet() %>
		</pre>
	<hr>
</body>
</html>