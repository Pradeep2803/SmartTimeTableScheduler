
<%@page import="dto.SectionDto"%>
<%@page import="dto.SectionDto"%>
<%@page import="dao.SectionDao"%>
<%@page import="dto.SubjectDto"%>
<%@page import="dto.SubjectDto"%>
<%@page import="dao.SubjectsDao"%>
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
                
                
                <form method="post" action="GetScheduleData">
                    <% 
                        int subject=0;
                        int  j=0;
                        int number=Integer.parseInt(request.getParameter("numberOfClasses") );
                        System.out.println(number);
                        String branch = request.getParameter("branch");
                   %>
                   <input type="text" value="<%= number %>" name="numberOfClasses" hidden>
                   <input type="text" value="<%= branch %>" name="branch" hidden >
                   <%
                        for(int i=0;i<number;i++)
                    {
                        
                    %>
                   
                    Class :<select name="Department<%= i %>">
                              <%
                      SectionDao iDao = new SectionDao();
                      List<SectionDto> l1 = iDao.getAllSectionDataBranchWise(branch);
                      Iterator<SectionDto> itr1=l1.iterator();
                      while(itr1.hasNext())
                      {
                          SectionDto insDto = new SectionDto();
                              
                          insDto=itr1.next();
                      %>
                      <option value="<%= insDto.getSectionName()%>"><%= insDto.getSectionName() %></option>
                      <% } %>
                    </select>
                     Room Number :<input type="text" name="Room_Number<%= i %>" >
                    <table border="3px" width="800px">
                        <tr align="center">
                            <td>Subjects Code</td>
                             
                              
                            
                        </tr>
                        <tr align="center">
                            <td>
                                <select name="sub_code<%= j+1 %>">
                                     <%
                      SubjectsDao iDao1 = new SubjectsDao();
                      List<SubjectDto> l2 = iDao1.getAllSubjectData();
                      Iterator<SubjectDto> itr2=l2.iterator();
                      while(itr2.hasNext())
                      {
                          SubjectDto insDto1 = new SubjectDto();
                           
                          insDto1=itr2.next();
                      %>
                                    
                      <option value="<%= insDto1.getSubjectName() %>" ><%= insDto1.getSubjectName() %></option>
                      <% } %>
                                </select>
                            </td>
                        </tr>
                          <tr align="center">
                            <td>
                                <select name="sub_code<%= j+2 %>">
                                     <%
                   
                 itr2=l2.iterator();
                      while(itr2.hasNext())
                      {
                          SubjectDto insDto1 = new SubjectDto();
                           
                          insDto1=itr2.next();
                      %>
                                    
                      <option value="<%= insDto1.getSubjectName()%>" ><%= insDto1.getSubjectName() %></option>
                      <% } %>
                                </select>
                            </td>
                        </tr>
                          <tr align="center">
                            <td>
                                <select name="sub_code<%= j+3 %>">
                                     <%
                     itr2=l2.iterator();
                      while(itr2.hasNext())
                      {
                          SubjectDto insDto1 = new SubjectDto();
                           
                          insDto1=itr2.next();
                      %>
                                    
                      <option value="<%= insDto1.getSubjectName() %>" ><%= insDto1.getSubjectName() %></option>
                      <% } %>
                                </select>
                            </td>
                        </tr>  <tr align="center">
                            <td>
                                <select name="sub_code<%= j+4 %>">
                                     <%
                     itr2=l2.iterator();
                      while(itr2.hasNext())
                      {
                          SubjectDto insDto1 = new SubjectDto();
                           
                          insDto1=itr2.next();
                      %>
                                    
                      <option value="<%= insDto1.getSubjectName() %>" ><%= insDto1.getSubjectName() %></option>
                      <% } %>
                                </select>
                            </td>
                        </tr>  <tr align="center">
                            <td>
                                <select name="sub_code<%= j+5 %>">
                                     <%
                      itr2=l2.iterator();
                      while(itr2.hasNext())
                      {
                          SubjectDto insDto1 = new SubjectDto();
                           
                          insDto1=itr2.next();
                      %>
                                    
                      <option value="<%= insDto1.getSubjectName() %>" ><%= insDto1.getSubjectName() %></option>
                      <% } %>
                                </select>
                            </td>
                        </tr>
                        
                        
                        
                        
                        
                    </table><br><br>
                    <% j=j+5; } %>
                    
                    <input type="submit" class="btn btn-danger" value="submit">
                </form>  
            </div>