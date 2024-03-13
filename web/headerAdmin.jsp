 <html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Admin Area | Dashboard</title>
    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    <script src="http://cdn.ckeditor.com/4.6.1/standard/ckeditor.js"></script>
    
 <script type='text/javascript'>
        function appendFaculty(){
            // Generate a dynamic number of inputs
            var number = document.getElementById("numFaculty").value;
            // Get the element where the inputs will be added to
            var container = document.getElementById("3");
            // Remove every children it had before
            while (container.hasChildNodes()) {
                container.removeChild(container.lastChild);
            }
            for (i=0;i<number;i++){
                // Append a node with a random text
                container.appendChild(document.createTextNode("Member " + (i+1)));
                // Create an <input> element, set its type and name attributes
                var input = document.createElement("input");
                 input.class="formmeth";   
            input.type = "text";
                input.name = "faculty" + i;
       
                input.placeholder= "hellow";
                container.appendChild(input);
                // Append a line break 
                container.appendChild(document.createElement("br"));
            }
        }
        
        /*
         *   <div class="form-group">
				    <label for="start">Start:</label>
				    <input type="time" class="form-control" id="start" name="startDuration" required>
				  </div>
				  <div class="form-group">
				    <label for="end">End:</label>
				    <input type="time" class="form-control" id="end" name="endDuration" required>
				  </div>
         * 
         * 
         */
        
        
         function timeSlots(){
            // Generate a dynamic number of inputs
            var number = document.getElementById("numOfTs").value;
            // Get the element where the inputs will be added to
            var container = document.getElementById("ts");
            // Remove every children it had before
            while (container.hasChildNodes()) {
                container.removeChild(container.lastChild);
            }
            for (i=0;i<number;i++){
                // Append a node with a random text
                container.appendChild(document.createTextNode("Slot : " + (i+1 + " ")));
                // Create an <input> element, set its type and name attributes
                var label=document.createElement("label");
                
                label.for="start";
                label.innerHTML="Start:";
                
               var span=document.createElement("span");     
                     span.innerHTML += '&nbsp;'
                var inputTs = document.createElement("input");
                 inputTs.className="form-control";   
            inputTs.type = "time";
                inputTs.name = "startDuration" + i;
       
                inputTs.placeholder= "sd";
                container.appendChild(label)
                container.appendChild(inputTs);
                
              container.innerHTML += '&nbsp;'; container.innerHTML += '&nbsp;'; container.innerHTML += '&nbsp;';
         
             var label2=document.createElement("label");
                
                label2.for="end";
                label2.innerHTML="End:";
                
                var inputTs2 = document.createElement("input");
                 inputTs2.className="form-control";   
            inputTs2.type = "time";
                inputTs2.name = "endDuration" + i;
       
                inputTs2.placeholder= "sd";
                container.appendChild(label2)
                container.appendChild(inputTs2);
                
                
                
                // Append a line break 
                container.appendChild(document.createElement("br"));
            }
        }
    </script>
  </head>
  <body>

    <nav class="navbar navbar-default">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Admin Panel</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="homeAdmin.jsp">Dashboard</a></li>
            <li><a href="subject.jsp">Subjects</a></li>
            <li><a href="course.jsp">Courses</a></li>
            <li><a href="instructor.jsp">Instructors</a></li>
          </ul>
          <ul class="nav navbar-nav navbar-right">
            <li><a href="#">Welcome </a></li>
            <li><a href="login.jsp">Logout</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

    <header id="header">
      <div class="container">
        <div class="row">
          <div class="col-md-10">
            <h1><span class="glyphicon glyphicon-cog" aria-hidden="true"></span> Dashboard <small>Manage Your System</small></h1>
          </div>
  
        </div>
      </div>
    </header>

    <section id="breadcrumb">
      <div class="container">
        <ol class="breadcrumb">
          <li class="active">Dashboard</li>
        </ol>
      </div>
    </section>

    <section id="main">
      <div class="container">
        <div class="row">
          <div class="col-md-3">
            <div class="list-group">
              <a href="homeAdmin.jsp" class="list-group-item active main-color-bg">
                <span class="glyphicon glyphicon-cog" aria-hidden="true"></span> Dashboard
              </a>
              <a href="subject.jsp" class="list-group-item"><span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span> Subjects <span class="badge">12</span></a>
              <a href="course.jsp" class="list-group-item"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> Courses <span class="badge">33</span></a>
              <a href="instructor.jsp" class="list-group-item"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Instructors <span class="badge">203</span></a>
               <a href="room.jsp" class="list-group-item"><span class="	glyphicon glyphicon-home" aria-hidden="true"></span> Rooms <span class="badge">203</span></a>
                <a href="section.jsp" class="list-group-item"><span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span> Sections <span class="badge">203</span></a>
                <a href="tslot.jsp" class="list-group-item"><span class="glyphicon glyphicon-time" aria-hidden="true"></span> TimeSlots <span class="badge">203</span></a>
            </div>

           
          </div>