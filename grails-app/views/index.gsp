<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>TekDays - A Community-based Conference</title>
	</head>
	<body>
		<div id="welcome">
			<br />
			<h3>Welcome to TekDays.com</h3>
			<p>TekDays.com is a sample site dedicated to assisting individuals and
			   communities to organize technology conferences. </p>
		</div>
		<div class="homeCell">
			<h3>Find a Tek Event</h3>
			<p>See if there is a technical event in the works that catches your eyes.
			If there is, you can volunteer to help or just let the organizers know that
			you are interested in attending.</p>
			<div class="right_aligned">
				<span class="buttons">
					<g:link controller="tekEvent" action="index">Find a Tek Event</g:link>
				</span>
			</div>
		</div>
		<div class="homeCell">
			<h3>Organize a Tek Event</h3>
			<p>If you don't see anything that suits your interest and location,
			you can easily get started and there may be others ready to get behind you
			to make it happen.</p>
			<div class="right_aligned">
				<span class="buttons">
					<g:link controller="tekEvent" action="create">Organize a Tek Event</g:link>
				</span>
			</div>
		</div>
		<div class="homeCell">
			<h3>Sponsor a Tek Event</h3>
			<p>If you are part of a business or organization involving in technology
			then sponsoring a tek event would be a great way to let the community know that
			you are there and involved.</p>
			<div class="right_aligned">
				<span class="buttons">
					<g:link controller="sponsor" action="create">Sponsor a Tek Event</g:link>
				</span>
			</div>
		</div>
	</body>
</html>
