<%--
- menu.jsp
-
- Copyright (c) 2019 Rafael Corchuelo.
-
- In keeping with the traditional purpose of furthering education and research, it is
- the policy of the copyright owner to permit non-commercial use and redistribution of
- this software. It has been tested carefully, but it is not guaranteed for any particular
- purposes.  The copyright owner does not offer any warranties or representations, nor do
- they accept any liabilities with respect to them.
--%>

<%@page language="java" import="acme.framework.helpers.PrincipalHelper,acme.entities.roles.Provider,acme.entities.roles.Consumer"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:menu-bar code="master.menu.home">
	<acme:menu-left>
		<acme:menu-option code="master.menu.anonymous" access="isAnonymous()">
			<acme:menu-suboption code="master.menu.anonymous.favourite-link" action="http://www.example.com/"/>
			<acme:menu-suboption code="master.menu.anonymous.juanogtir-favourite-link" action="https://www.marca.com/"/>
			<acme:menu-suboption code="master.menu.anonymous.edubotdom-favourite-link" action="https://www.xda-developers.com/"/>
			<acme:menu-suboption code="master.menu.anonymous.javvazzam-favourite-link" action="https://www.atptour.com/"/>
			<acme:menu-suboption code="master.menu.anonymous.danaremar-favourite-link" action="https://www.minecraft.net/"/>
			<acme:menu-suboption code="master.menu.anonymous.seraguoro-favourite-link" action="https://www.youtube.com/watch?v=73GI6uS_4Ic"/>
			
		</acme:menu-option>
		
		<acme:menu-option code="master.menu.anonymous.shout" access="isAnonymous()">
			<acme:menu-suboption code="master.menu.anonymous.shout.list" action="/anonymous/shout/list"/>
			<acme:menu-suboption code="master.menu.anonymous.shout.create" action="/anonymous/shout/create"/>
		</acme:menu-option>
	
		<acme:menu-option code="master.menu.anonymous.botiaBulletin" access="isAnonymous()">
			<acme:menu-suboption code="master.menu.anonymous.botiaBulletin.list" action="/anonymous/botia_bulletin/list"/>
			<acme:menu-suboption code="master.menu.anonymous.botiaBulletin.create" action="/anonymous/botia_bulletin/create"/>
		</acme:menu-option>
		
		<acme:menu-option code="master.menu.anonymous.arellanoBulletin" access="isAnonymous()">
			<acme:menu-suboption code="master.menu.anonymous.arellanoBulletin.list" action="/anonymous/arellano_bulletin/list"/>
			<acme:menu-suboption code="master.menu.anonymous.arellanoBulletin.create" action="/anonymous/arellano_bulletin/create"/>
    </acme:menu-option>

		<acme:menu-option code="master.menu.anonymous.vazquezBulletin" access="isAnonymous()">
			<acme:menu-suboption code="master.menu.anonymous.vazquezBulletin.list" action="/anonymous/vazquez_bulletin/list"/>
			<acme:menu-suboption code="master.menu.anonymous.vazquezBulletin.create" action="/anonymous/vazquez_bulletin/create"/>
		</acme:menu-option>
		
		<acme:menu-option code="master.menu.anonymous.noguerolBulletin" access="isAnonymous()">
			<acme:menu-suboption code="master.menu.anonymous.noguerolBulletin.list" action="/anonymous/noguerol_bulletin/list"/>
			<acme:menu-suboption code="master.menu.anonymous.noguerolBulletin.create" action="/anonymous/noguerol_bulletin/create"/>
		</acme:menu-option>
		
		<acme:menu-option code="master.menu.anonymous.aguayoBulletin" access="isAnonymous()">
			<acme:menu-suboption code="master.menu.anonymous.aguayoBulletin.list" action="/anonymous/aguayo_bulletin/list"/>
			<acme:menu-suboption code="master.menu.anonymous.aguayoBulletin.create" action="/anonymous/aguayo_bulletin/create"/>
		</acme:menu-option>
		
		
		<acme:menu-option code="master.menu.administrator" access="hasRole('Administrator')">
			<acme:menu-suboption code="master.menu.administrator.user-accounts" action="/administrator/user-account/list"/>
			<acme:menu-separator/>
			<acme:menu-suboption code="master.menu.administrator.shutdown" action="/master/shutdown"/>
		</acme:menu-option>

		<acme:menu-option code="master.menu.provider" access="hasRole('Provider')">
			<acme:menu-suboption code="master.menu.provider.favourite-link" action="http://www.example.com/"/>
		</acme:menu-option>

		<acme:menu-option code="master.menu.consumer" access="hasRole('Consumer')">
			<acme:menu-suboption code="master.menu.consumer.favourite-link" action="http://www.example.com/"/>
		</acme:menu-option>
	</acme:menu-left>

	<acme:menu-right>
		<acme:menu-option code="master.menu.sign-up" action="/anonymous/user-account/create" access="isAnonymous()"/>
		<acme:menu-option code="master.menu.sign-in" action="/master/sign-in" access="isAnonymous()"/>

		<acme:menu-option code="master.menu.user-account" access="isAuthenticated()">
			<acme:menu-suboption code="master.menu.user-account.general-data" action="/authenticated/user-account/update"/>
			<acme:menu-suboption code="master.menu.user-account.become-provider" action="/authenticated/provider/create" access="!hasRole('Provider')"/>
			<acme:menu-suboption code="master.menu.user-account.provider" action="/authenticated/provider/update" access="hasRole('Provider')"/>
			<acme:menu-suboption code="master.menu.user-account.become-consumer" action="/authenticated/consumer/create" access="!hasRole('Consumer')"/>
			<acme:menu-suboption code="master.menu.user-account.consumer" action="/authenticated/consumer/update" access="hasRole('Consumer')"/>
		</acme:menu-option>

		<acme:menu-option code="master.menu.sign-out" action="/master/sign-out" access="isAuthenticated()"/>
	</acme:menu-right>
</acme:menu-bar>

