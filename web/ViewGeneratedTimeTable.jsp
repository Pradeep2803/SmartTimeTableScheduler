
<%@ include file="headerGTT.jsp" %>
<div class="col-md-9">
<section id="main">
      <div class="container">
        <div class="row">
          <div class="col-md-9">
            <div class="list-group">
              <a href="homeAdmin.jsp" class="list-group-item active main-color-bg">
                <span class="glyphicon glyphicon-cog" aria-hidden="true"></span> View Timetable
              </a>
<form action="ViewGeneratedTimeTableBranchSelected.jsp"
<div class="form-group">
    
Select Branch:
                 <SELECT name="branch" class="form-control" >
              <option value="cse">CSE</option>
              <option value="ec">Electrical</option>
              <option value="me">Mechanical</option>
              <option value="cm">Chemical</option>
              <option value="cv">Civil</option>
              
              
          </SELECT>
</div>
      <input type="submit" value="next">
</form>