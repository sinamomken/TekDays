<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<g:set var="domainName" value="${message(code: 'website.domain')}"/>
		<g:set var="event" value="${message(code: 'homepage.event.name')}"/>
		<title>TekDays - A Community-based Conference</title>
	</head>
	<body>
		<div id="welcome">
			<br />
			<h3><g:message code="homepage.welcome.header" args="[domainName]"/> </h3>
			<p><g:message code="homepage.welcome.paragraph" args="[domainName]"/> </p>
		</div>
		<div class="homeCell">
			<h3><g:message code="homepage.find.header" args="[event]"/></h3>
			<p><g:message code="homepage.find.paragraph"/></p>
			<div class="right_aligned">
				<span class="buttons">
					<g:link controller="tekEvent" action="index">Find a Tek Event</g:link>
				</span>
			</div>
		</div>
		<div class="homeCell">
			<h3><g:message code="homepage.organize.header" args="[event]"/></h3>
			<p><g:message code="homepage.organize.paragraph"/></p>
			<div class="right_aligned">
				<span class="buttons">
					<g:link controller="tekEvent" action="create">Organize a Tek Event</g:link>
				</span>
			</div>
		</div>
		<div class="homeCell">
			<h3><g:message code="homepage.sponsor.header" args="[event]"/></h3>
			<p><g:message code="homepage.sponsor.paragraph" /></p>
			<div class="right_aligned">
				<span class="buttons">
					<g:link controller="sponsor" action="create">Sponsor a Tek Event</g:link>
				</span>
			</div>
		</div>
	</body>
</html>
