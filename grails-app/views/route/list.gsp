
<%@ page import="trains.Route" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'route.label', default: 'Route')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>
        <div class="nav">
            <span class="menuButton"><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></span>
            <span class="menuButton"><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></span>
        </div>
        <div class="body">
            <h1><g:message code="default.list.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="list">
                <table>
                    <thead>
                        <tr>
                        
                            <g:sortableColumn property="id" title="${message(code: 'route.id.label', default: 'Id')}" />
                        
                            <g:sortableColumn property="distance" title="${message(code: 'route.distance.label', default: 'Distance')}" />
                        
                            <g:sortableColumn property="endCity" title="${message(code: 'route.endCity.label', default: 'End City')}" />
                        
                            <g:sortableColumn property="startCity" title="${message(code: 'route.startCity.label', default: 'Start City')}" />
                        
                        </tr>
                    </thead>
                    <tbody>
                    <g:each in="${routeInstanceList}" status="i" var="routeInstance">
                        <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                        
                            <td><g:link action="show" id="${routeInstance.id}">${fieldValue(bean: routeInstance, field: "id")}</g:link></td>
                        
                            <td>${fieldValue(bean: routeInstance, field: "distance")}</td>
                        
                            <td>${fieldValue(bean: routeInstance, field: "endCity")}</td>
                        
                            <td>${fieldValue(bean: routeInstance, field: "startCity")}</td>
                        
                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>
            <div class="paginateButtons">
                <g:paginate total="${routeInstanceTotal}" />
            </div>
        </div>
    </body>
</html>
