
<%@page import="dto.CourseDto"%>
<%@page import="dto.CourseDto"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="dao.CourseDao"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="db.DBConnector"%>
<%@ include file="headerGTT.jsp" %>
<div class="col-md-9">
<section id="main">
      <div class="container">
        <div class="row">
          <div class="col-md-9">
            <div class="list-group">
              <a href="homeAdmin.jsp" class="list-group-item active main-color-bg">
                <span class="glyphicon glyphicon-cog" aria-hidden="true"></span> Select  departments
              </a>
                     <div class="form-group">
<!--                         
          <label>Enter the number of Departments </label>
          <input type="number" name="totalDept"  id="numOfDep" class="form-control" placeholder="Number" oninput="depts()">
        </div>
         <div id="Dep" class="form-inline" role="form" style="padding-left:30px">
           -->
				
			</div>
                
                
                <form method="post" action="generatetimetablecoursesForEachClass.jsp">
                    <div class="list-group-item">Enter The number of Section For Which You Want TO generate Timetable<input class="form-control" type="text" name="numberOfClasses" ></div>
                    <div class="list-group-item">Select Branch:
                            <SELECT name="branch" class="form-control" >
              <option value="cse">CSE</option>
              <option value="ec">Electrical</option>
              <option value="me">Mechanical</option>
              <option value="cm">Chemical</option>
              <option value="cv">Civil</option>
              
              
          </SELECT>
                    <button class="btn btn-danger">Next</button>
                
                </form>  
                
            </div>