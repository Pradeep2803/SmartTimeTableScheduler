<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="dto.SubjectDto"%>
<%@page import="dao.SubjectsDao"%>
<!DOCTYPE html>

<%@ include file="headerAdmin.jsp" %>
          <div class="col-md-9">
            <!-- Website Overview -->
            <div class="panel panel-default">
              <div class="panel-heading main-color-bg">
                <h3 class="panel-title">Subjects</h3>
              </div>
              <div class="panel-body">
                <div class="row">
                      <div class="col-md-12">
                          <input class="form-control" type="text" placeholder="Filter Users...">
                      </div>
                </div>
                <br>
                <table class="table table-striped table-hover">
                      <tr>
                        <th>Subject Id</th>
                        <th>Subject Name</th>
                        <th>Faculty</th>
                        <th></th>
                      </tr>
                      <%
                      SubjectsDao iDao = new SubjectsDao();
                      List<SubjectDto> l1 = iDao.getAllSubjectData();
                      Iterator<SubjectDto> itr1=l1.iterator();
                      while(itr1.hasNext())
                      {
                          SubjectDto insDto = new SubjectDto();
                              
                          insDto=itr1.next();
                      %>
                      <tr>
                        <td><%= insDto.getSubjectId() %></td>
                        <td><%= insDto.getSubjectName() %></td>
                        <td><%= insDto.getSubjectFaculty1() %>,<%= insDto.getSubjectFaculty2() %>,<%= insDto.getSubjectFaculty3() %>,<%= insDto.getSubjectFaculty4() %>,<%= insDto.getSubjectFaculty5() %> </td>
                        <!--<td><a class="btn btn-default" href="edit.html">Edit</a> <a class="btn btn-danger" href="#">Delete</a></td>-->
                      </tr>
                      <% } %>
                      
                    </table>
              </div>
              </div>

          </div>
        </div>
      </div>
    </section>

    <footer id="footer">
      
    </footer>

    <!-- Modals -->

    <!-- Add Page -->
    <div class="modal fade" id="addPage" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <form>
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Add Page</h4>
      </div>
      <div class="modal-body">
        <div class="form-group">
          <label>Page Title</label>
          <input type="text" class="form-control" placeholder="Page Title">
        </div>
        <div class="form-group">
          <label>Page Body</label>
          <textarea name="editor1" class="form-control" placeholder="Page Body"></textarea>
        </div>
        <div class="checkbox">
          <label>
            <input type="checkbox"> Published
          </label>
        </div>
        <div class="form-group">
          <label>Meta Tags</label>
          <input type="text" class="form-control" placeholder="Add Some Tags...">
        </div>
        <div class="form-group">
          <label>Meta Description</label>
          <input type="text" class="form-control" placeholder="Add Meta Description...">
        </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="submit" class="btn btn-primary">Save changes</button>
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
