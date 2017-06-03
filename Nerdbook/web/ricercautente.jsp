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
      
            <json:object>
                <json:property name="nome" value="${utente.nome}"/>
                <json:property name="cognome" value="${utente.cognome}"/>
                <json:property name="idUtente" value="${utente.idUtente}"/>
                <json:property name="urlAvatar" value="${utente.urlAvatar}"/>
            </json:object>
      
    </c:forEach>
</json:array>