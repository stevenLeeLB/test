<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
   
 
  </head>
  
  
  <body>

 <%--   <spring:bind path="command.*">
        <font color="#FF0000">
           <c:forEach items="${status.errorMessages}" var="error">
                错误: <c:out value="${error}"/><br>
            </c:forEach>
        </font>
    </spring:bind>   --%>       
   <form action="<%=request.getContextPath() %>/register.mvc" method="post">
     <spring:bind path="command.name">
      name: <input type="text" name="name" value="<c:out value="${status.value}"/>"/>(必须输入)
       <c:if test="${status.error}">
          <font color="#FF0000">
          错误:
           <c:forEach items="${status.errorMessages}" var="error">
                <c:out value="${error}"/>
           </c:forEach>
          </font>
        </c:if>
     </spring:bind><br/>
     <spring:bind path="command.age">
     age:  <input type="text" name="age"/>(必须输入,且大于0)
     <c:if test="${status.error}">
          <font color="#FF0000">
          错误:
           <c:forEach items="${status.errorMessages}" var="error">
                <c:out value="${error}"/>
           </c:forEach>
          </font>
        </c:if>
     </spring:bind><br/>
           <input type="submit" value="submit"/>
     
   </form>
  </body>
</html>

 