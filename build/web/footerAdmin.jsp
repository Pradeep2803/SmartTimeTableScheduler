  

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="dto.InstructorDto"%>
<%@page import="dao.InstructorDao"%>
<%@page import="java.util.Random"%>
<footer id="footer">
      <p>Automatic Time Table Generator</p>
    </footer>

    <!-- Modals -->

    <!-- Add Section -->
    <div class="modal fade" id="addSection" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <form method="post" action="AddSection">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Add Section</h4>
      </div>
      <div class="modal-body">
        <div class="form-group">
          <label>Section Id</label>
          
          <input type="text" name="sectionId"  class="form-control" placeholder="Section Id" >
        </div>
     
        <div class="form-group">
          <label>Section Name</label>
          <input type="text" name="sectionName"  class="form-control" placeholder="Add Meta Description...">
        </div>
      
           <div class="form-group">
          <label>Section Students number</label>
          
          <input type="number" name="sectionStudentNumber"  class="form-control" placeholder="" >
        </div>
            <div class="form-group">
          <label>Branch</label>
          
          <SELECT name="branch" class="form-control" >
              <option value="cse">CSE</option>
              <option value="ec">Electrical</option>
              <option value="me">Mechanical</option>
              <option value="cm">Chemical</option>
              <option value="cv">Civil</option>
              
              
          </SELECT>
        </div>
    </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="submit" class="btn btn-primary">Add Section</button>
      </div>
    </form>
    </div>
  </div>
</div>

        
    <div class="modal fade" id="addInstructor" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <form method="post" action="AddInstructor">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Add Instructor</h4>
      </div>
      <div class="modal-body">
        <div class="form-group">
          <label>Instructor Id</label>
          
          <input type="text" name="instructorId"  class="form-control" placeholder="Instructor Id" >
        </div>
     
        <div class="form-group">
          <label>Instructor Name</label>
          <input type="text" name="instructorName"  class="form-control" placeholder="Name">
        </div>
      
           <div class="form-group">
          <label>Teaching Hours in a Day</label>
          
          <input type="number" name="teachingHours"  class="form-control" placeholder="" >
        </div>
    </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="submit" class="btn btn-primary">Add Instructor</button>
      </div>
    </form>
    </div>
  </div>
</div>
      
        <!-- Add Subject -->
    <div class="modal fade" id="addSubject" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <form method="post" action="AddSubject">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Add Subject</h4>
      </div>
      <div class="modal-body">
        <div class="form-group">
          <label>Subject Id</label>
          
          <input type="text" name="subjectId"  class="form-control" placeholder="Subject Id" >
        </div>
     
        <div class="form-group">
          <label>Subject Name</label>
          <input type="text" name="subjectName"  class="form-control" placeholder="subject name">
        </div>
      
           <div class="form-group">
          <label>Subject Faculty 01 </label>
          
          <select class="form-control" name="subjectFaculty1">
              <option value="null">null</option>
          <%
          InstructorDao d = new InstructorDao();
          List<InstructorDto> l0  = d.getAllInstructorData();
          Iterator<InstructorDto> itr0 = l0.iterator();
          while(itr0.hasNext())
          {
            InstructorDto iDto = new InstructorDto();
          iDto=itr0.next();
          
          %>
          <option value="<%= iDto.getInstructorId() %>"><%= iDto.getInstructorName() %></option>
              <% } %>
          </select>
          <div id="3"></div>
        </div>
          <div class="form-group">
          <label>Subject Faculty 02 </label>
          
          <select class="form-control" name="subjectFaculty2">
           <option value="null">null</option>
          <%
          itr0 = l0.iterator();
          while(itr0.hasNext())
          {
            InstructorDto iDto = new InstructorDto();
          iDto=itr0.next();
          
          %>
          <option value="<%= iDto.getInstructorId() %>"><%= iDto.getInstructorName() %></option>
              <% } %>
          </select>
          <div id="3"></div>
        </div>
          <div class="form-group">
          <label>Subject Faculty 03 </label>
          
          <select class="form-control" name="subjectFaculty3">
           <option value="null">null</option>
          <%
         itr0 = l0.iterator();
          while(itr0.hasNext())
          {
            InstructorDto iDto = new InstructorDto();
          iDto=itr0.next();
          
          %>
          <option value="<%= iDto.getInstructorId() %>"><%= iDto.getInstructorName() %></option>
              <% } %>
          </select>
          <div id="3"></div>
        </div>
          <div class="form-group">
          <label>Subject Faculty 04 </label>
          
          <select class="form-control" name="subjectFaculty4">
           <option value="null">null</option>
          <%
          l0  = d.getAllInstructorData();
          itr0 = l0.iterator();
          while(itr0.hasNext())
          {
            InstructorDto iDto = new InstructorDto();
          iDto=itr0.next();
          
          %>
          <option value="<%= iDto.getInstructorId() %>"><%= iDto.getInstructorName() %></option>
              <% } %>
          </select>
          <div id="3"></div>
        </div>
          <div class="form-group">
          <label>Subject Faculty 05 </label>
          
          <select class="form-control" name="subjectFaculty5">
           <option value="null">null</option>
          <%
           l0  = d.getAllInstructorData();
          itr0 = l0.iterator();
          while(itr0.hasNext())
          {
            InstructorDto iDto = new InstructorDto();
          iDto=itr0.next();
          
          %>
          <option value="<%= iDto.getInstructorId() %>"><%= iDto.getInstructorName() %></option>
              <% } %>
          </select>
          <div id="3"></div>
        </div>
          <div class="form-group">
              Credit <input type="text" class="form-control" name="credit">
          </div>
    </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="submit" class="btn btn-primary">Add Subject</button>
      </div>
    </form>
    </div>
  </div>
</div>
        
          <!-- Add Course -->
    <div class="modal fade" id="addCourse" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <form method="post" action="AddCourses">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Add Course</h4>
      </div>
      <div class="modal-body">
        <div class="form-group">
          <label>Course Id</label>
          
          <input type="text" name="courseId"  class="form-control" placeholder="Course Id" >
        </div>
     
        <div class="form-group">
          <label>Course Name</label>
          <input type="text" name="courseName"  class="form-control" placeholder="Add Meta Description...">
        </div>
      
           <div class="form-group">
          <label>Number Of Students</label>
          
          <input type="number" name="numberOfStudent"  class="form-control" placeholder="" >
        </div>
    </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="submit" class="btn btn-primary">Add Course</button>
      </div>
    </form>
    </div>
  </div>
</div>
          
          
          
      <!-- Add Time Slots -->
    <div class="modal fade" id="addTimeSlots" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <form method="post" action="AddTimeSlot">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Add Time Slots </h4>
      </div>
      <div class="modal-body">
    
     
        <div class="form-group">
          <label>Enter Total Number Of time Slots </label>
          <input type="number" name="totalSlots"  id="numOfTs" class="form-control" placeholder="Number" oninput="timeSlots()">
        </div>
         <div id="ts" class="form-inline" role="form" style="padding-left:30px">
           
				
			</div>
    </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="submit" class="btn btn-primary">Add Instructor</button>
      </div>
    </form>
    </div>
  </div>
</div>
      
          
          
            <!-- Add Room -->
    <div class="modal fade" id="addRoom" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <form method="post" action="AddRooms">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Add Room</h4>
      </div>
      <div class="modal-body">
        <div class="form-group">
          <label>Room Id</label>
          
          <input type="text" name="roomId"  class="form-control" placeholder="Room Id" >
        </div>
     <div class="form-group">
          <label>Room Number</label>
          
          <input type="text" name="roomName"  class="form-control" placeholder="Room Number" >
        </div>
     
        
      
           <div class="form-group">
          <label>room capacity</label>
          
          <input type="number" name="roomCapacity"  class="form-control" placeholder="" >
        </div>
    </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="submit" class="btn btn-primary">Add Room</button>
      </div>
    </form>
    </div>
  </div>
</div>
    
  <script>
     CKEDITOR.replace( 'editor1' );
 </script>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>
