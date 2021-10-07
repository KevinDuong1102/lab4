<%-- 
    Document   : EditNote
    Created on : Oct 3, 2021, 4:17:03 AM
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

        <form method="POST" action="note" >
            <label>Title</label>


<!--            <input type="text" name="title" value= "${title}"/>-->
            
            
            <textarea name="title" rows="1" cols="50">${title}</textarea>
            <br/>
            <label>Contents</label>
<!--            <input type="text" name="content" value= "${content}" />-->
            <textarea name="content" rows="5" cols="50">${content}</textarea>

            <br>
            <input type ="submit" value="Save"/>

        </form>
    </body>
</html>
