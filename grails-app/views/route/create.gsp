

<%@ page import="trains.Route" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'route.label', default: 'Route')}" />
        <title><g:message code="default.create.label" args="[entityName]" /></title>
    </head>
    <body>
        <div class="nav">
            <span class="menuButton"><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></span>
            <span class="menuButton"><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></span>
        </div>
        <div class="body">
            <h1><g:message code="default.create.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${routeInstance}">
            <div class="errors">
                <g:renderErrors bean="${routeInstance}" as="list" />
            </div>
            </g:hasErrors>
            <g:form action="save" >
                <div class="dialog">
                    <table>
                        <tbody>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="distance"><g:message code="route.distance.label" default="Distance" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: routeInstance, field: 'distance', 'errors')}">
                                    <g:textField name="distance" value="${fieldValue(bean: routeInstance, field: 'distance')}" />
                                </td>
                            </tr>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="endCity"><g:message code="route.endCity.label" default="End City" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: routeInstance, field: 'endCity', 'errors')}">
                                    <g:textField name="endCity" value="${routeInstance?.endCity}" />
                                </td>
                            </tr>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="startCity"><g:message code="route.startCity.label" default="Start City" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: routeInstance, field: 'startCity', 'errors')}">
                                    <g:textField name="startCity" value="${routeInstance?.startCity}" />
                                </td>
                            </tr>
                        
                        </tbody>
                    </table>
                </div>
                <div class="buttons">
                    <span class="button"><g:submitButton name="create" class="save" value="${message(code: 'default.button.create.label', default: 'Create')}" /></span>
                </div>
            </g:form>
        </div>
    </body>
</html>
