<!DOCTYPE html>

<%@ include file="headerAdmin.jsp" %>
          <div class="col-md-9">
            <!-- Website Overview -->
            <div class="panel panel-default">
              <div class="panel-heading main-color-bg">
                <h3 class="panel-title">Administrator Panel</h3>
              </div>
              <div class="panel-body">
                <div class="col-md-3">
                  <div class="well dash-box">
                    
                   <button class="btn btn-primary"  data-toggle="modal" data-target="#addSection" ><h4>Add Sections</h4></button>
                  </div>
                </div>
                <div class="col-md-3">
                  <div class="well dash-box">
                    <button class="btn btn-primary" data-toggle="modal" data-target="#addInstructor"><h4>Add Instructor</h4></button>
                  </div>
                </div>
                <div class="col-md-3">
                  <div class="well dash-box">
                    <button class="btn btn-primary" data-toggle="modal" data-target="#addCourse"><h4>Add Course</h4></button>
                  </div>
                </div>
                <div class="col-md-3">
                  <div class="well dash-box">
                    <button class="btn btn-primary" data-toggle="modal" data-target="#addRoom" ><h4>Add Rooms</h4></button>
                  </div>
                </div>
                       <div class="col-md-3">
                  <div class="well dash-box">
                    <button class="btn btn-primary" data-toggle="modal" data-target="#addSubject" ><h4>Add Subjects</h4></button>
                  </div>
                </div>
                  
                  <div class="col-md-3">
                  <div class="well dash-box">
                    <button class="btn btn-primary" data-toggle="modal" data-target="#addTimeSlots" ><h4>Add Time Slots</h4></button>
                  </div>
                </div>
              </div>
              </div>
            <form method="post" action="generateTimeTable.jsp">
            <button class="btn btn-danger" >Generate Timetable</button>
            <a href="ViewGeneratedTimeTable.jsp"> <div class="btn btn-danger" >View Time table</div></a>
            </form>
          </div>
        </div>
      </div>
    </section>

<%@ include file="footerAdmin.jsp" %>
  