
<%@page import="dto.SectionDto"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="dao.SectionDao"%>
<%@ include file="headerGTT.jsp" %>
<div class="col-md-9">
<section id="main">
      <div class="container">
        <div class="row">
          <div class="col-md-9">
            <div class="list-group">
              <a href="homeAdmin.jsp" class="list-group-item active main-color-bg">
                <span class="glyphicon glyphicon-cog" aria-hidden="true"></span> View timetable
              </a>
<form action="ViewGeneratedTimeTableBranchSelectedShowTimeTable.jsp"
<div class="form-group">
    <% 
    String branch = request.getParameter("branch");
    %>
    <input type="text" name="branch" value="<%= branch %>" hidden >
Select Section:
                 <SELECT name="section" class="form-control" >
                <%
                    
                    branch = request.getParameter("branch");
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
                    
              
              
          </SELECT>
</div>
      <input type="submit" value="Submit" class="btn btn-danger">
</form>