<%--
- form.jsp
-
- Copyright (c) 2019 Rafael Corchuelo.
-
- In keeping with the traditional purpose of furthering education and research, it is
- the policy of the copyright owner to permit non-commercial use and redistribution of
- this software. It has been tested carefully, but it is not guaranteed for any particular
- purposes.  The copyright owner does not offer any warranties or representations, nor do
- they accept any liabilities with respect to them.
--%>

<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>

	<acme:form-textbox code="anonymous.aguayoBulletin.form.label.title" path="title"/>
	<acme:form-textbox code="anonymous.aguayoBulletin.form.label.episodes" path="episodes"/>
<!-- 	<acme:form-moment code="anonymous.aguayoBulletin.form.label.aired" path="aired"/> -->
	<acme:form-textbox code="anonymous.aguayoBulletin.form.label.director" path="director"/>
	
	<acme:form-submit code="anonymous.aguayoBulletin.form.button.create" action="/anonymous/aguayo_bulletin/create"/>
  	<acme:form-return code="anonymous.aguayoBulletin.form.button.return"/>
</acme:form>
