<%-- 
    Document   : ricercautente
    Created on : 1-giu-2017, 23.14.33
    Author     : stefano
--%>


<%@page contentType="application/json" pageEncoding="UTF-8"%>
<%@taglib prefix="json" uri="http://www.atg.com/taglibs/json"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<json:array>
    <c:forEach var="utente" items="${listautenti}">
        <c:if test="${sessionScope.user != utente.idUtente}">
            <json:object>
                <json:property name="nome" value="${utente.nome}"/>
                <json:property name="cognome" value="${utente.cognome}"/>
                <json:property name="id" value="${utente.idUtente}"/>
                <json:property name="urlFotoProfilo" value="${utente.urlAvatar}"/>
            </json:object>
        </c:if>
    </c:forEach>
</json:array>