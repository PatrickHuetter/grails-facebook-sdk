<div class="page-header">
	<h1>Facebook App Example</h1>
</div>
<div class="row">
	<div class="span12">
		<g:if test="${!appId}">
			<g:render template="/website/configError" />
		</g:if>
		<g:else>
			<!--
			  We use the Facebook JavaScript SDK to provide a richer user experience. For more info,
			  look here: http://github.com/facebook/connect-js
			-->
			<facebook:connectJS appId="${appId}" />
			
			<g:if test="${!user}">
				<h2>Authentication</h2>
				<p>
					Install app via Facebook JavaScript SDK: <facebook:loginLink appPermissions="${appPermissions}" elementClass="large primary btn">Login</facebook:loginLink>
				</p>
			</g:if>
			<g:else>
				<h2>Your data</h2>
				<h3>Your profile pic + name</h3>
				<p>
					<img src="https://graph.facebook.com/${user.id}/picture">
					${user.name}
				</p>
				<h3>Your friends</h3>
				<p>
					<g:each in="${userFriends}" var="friend">
						<img src="https://graph.facebook.com/${friend.id}/picture">
					</g:each>
				</p>
			</g:else>
			<hr />
		</g:else>
		<h2>Public data</h2>
		<h3>Profile pic + name</h3>
		<p>
			<img src="https://graph.facebook.com/naitik/picture">
			${naitik?.name}
		</p>
	</div>
</div>