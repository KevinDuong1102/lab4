<%-- 
    Document   : WelcomePage
    Created on : Oct 2, 2021, 2:02:59 AM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<style><%@include file="/WEB-INF/style.css"%></style>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         
        <h1>Simple Note Keeper</h1>
        <h3>View Note</h3>

        <label class="label">Title: </label>
        <span> ${title}</span>
        <br/>
        <label class="label" >Contents: </label>
        <p> ${content}</p>

        <a href="note?edit"> Edit</a>



    </body>
</html>
