
<%@page import="dao.FetchScheduleDao"%>
<%@page import="dto.FetchScheduleDto"%>
<%@page import="dto.SectionDto"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="dao.SectionDao"%>
<%@ include file="headerGTT.jsp" %>
<script>
    function insertScriptData(mtid , course , instructor)
    {
        
        for(i=1;i<37;i++)
        {
           if(mtid=='MT'+i)
            {
                document.getElementById('mt'+i).innerHTML=course+"<br>"+instructor;
                break;
//                document.getElementById('mt1').innerHTML=instructor;
            } 
        }
        
//            if(mtid=='MT1')
//            {
//                document.getElementById('mt1').innerHTML=course+"<br>"+instructor;
////                document.getElementById('mt1').innerHTML=instructor;
//            }else
//            if(mtid=='MT2')
//            {
//                document.getElementById('mt2').innerHTML=course+"<br>"+instructor;
////              
//            }else
//            if(mtid=='MT3')
//            {
//                document.getElementById('mt3').innerHTML=course+"<br>"+instructor;
////              
//            }else
//            if(mtid=='MT4')
//            {
//                document.getElementById('mt4').innerHTML=course+"<br>"+instructor;
////              
//            }else
//            if(mtid=='MT5')
//            {
//                document.getElementById('mt5').innerHTML=course+"<br>"+instructor;
////              
//            }else
//            if(mtid=='MT6')
//            {
//                document.getElementById('mt6').innerHTML=course+"<br>"+instructor;
////              
//            }else
//            if(mtid=='MT7')
//            {
//                document.getElementById('mt7').innerHTML=course+"<br>"+instructor;
////              
//            }else
//            if(mtid=='MT8')
//            {
//                document.getElementById('mt8').innerHTML=course+"<br>"+instructor;
////              
//            }else
//            if(mtid=='MT9')
//            {
//                document.getElementById('mt9').innerHTML=course+"<br>"+instructor;
////              
//            }else
//            if(mtid=='MT10')
//            {
//                document.getElementById('mt10').innerHTML=course+"<br>"+instructor;
////              
//            }else
//            if(mtid=='MT11')
//            {
//                document.getElementById('mt11').innerHTML=course+"<br>"+instructor;
////              
//            }else
//            if(mtid=='MT12')
//            {
//                document.getElementById('mt12').innerHTML=course+"<br>"+instructor;
////              
//            }else
//            if(mtid=='MT2')
//            {
//                document.getElementById('mt13').innerHTML=course+"<br>"+instructor;
////              
//            }else
//            if(mtid=='MT2')
//            {
//                document.getElementById('mt14').innerHTML=course+"<br>"+instructor;
////              
//            }else
//            if(mtid=='MT2')
//            {
//                document.getElementById('mt15').innerHTML=course+"<br>"+instructor;
////              
//            }else
//            if(mtid=='MT2')
//            {
//                document.getElementById('mt16').innerHTML=course+"<br>"+instructor;
////              
//            }else
//            if(mtid=='MT2')
//            {
//                document.getElementById('mt17').innerHTML=course+"<br>"+instructor;
////              
//            }else
//            if(mtid=='MT2')
//            {
//                document.getElementById('mt18').innerHTML=course+"<br>"+instructor;
////              
//            }else
//            if(mtid=='MT2')
//            {
//                document.getElementById('mt19').innerHTML=course+"<br>"+instructor;
////              
//            }else
//            if(mtid=='MT2')
//            {
//                document.getElementById('mt20').innerHTML=course+"<br>"+instructor;
////              
//            }else
//            if(mtid=='MT2')
//            {
//                document.getElementById('mt21').innerHTML=course+"<br>"+instructor;
////              
//            }else
//            if(mtid=='MT2')
//            {
//                document.getElementById('mt22').innerHTML=course+"<br>"+instructor;
////              
//            }else
//            if(mtid=='MT2')
//            {
//                document.getElementById('mt23').innerHTML=course+"<br>"+instructor;
////              
//            }else
//            if(mtid=='MT2')
//            {
//                document.getElementById('mt24').innerHTML=course+"<br>"+instructor;
////              
//            }else
//            if(mtid=='MT2')
//            {
//                document.getElementById('mt25').innerHTML=course+"<br>"+instructor;
////              
//            }else
//            if(mtid=='MT2')
//            {
//                document.getElementById('mt26').innerHTML=course+"<br>"+instructor;
////              
//            }else
//            if(mtid=='MT2')
//            {
//                document.getElementById('mt27').innerHTML=course+"<br>"+instructor;
////              
//            }else
//            if(mtid=='MT2')
//            {
//                document.getElementById('mt28').innerHTML=course+"<br>"+instructor;
////              
//            }else
//            if(mtid=='MT2')
//            {
//                document.getElementById('mt29').innerHTML=course+"<br>"+instructor;
////              
//            }else
//            if(mtid=='MT2')
//            {
//                document.getElementById('mt30').innerHTML=course+"<br>"+instructor;
////              
//            }else
//            if(mtid=='MT2')
//            {
//                document.getElementById('mt31').innerHTML=course+"<br>"+instructor;
////              
//            }else
//            if(mtid=='MT2')
//            {
//                document.getElementById('mt32').innerHTML=course+"<br>"+instructor;
////              
//            }else
//            if(mtid=='MT2')
//            {
//                document.getElementById('mt33').innerHTML=course+"<br>"+instructor;
////              
//            }else
//            if(mtid=='MT2')
//            {
//                document.getElementById('mt34').innerHTML=course+"<br>"+instructor;
////              
//            }else
//            if(mtid=='MT2')
//            {
//                document.getElementById('mt35').innerHTML=course+"<br>"+instructor;
////              
//            }else
//            if(mtid=='MT2')
//            {
//                document.getElementById('mt36').innerHTML=course+"<br>"+instructor;
////              
//            }
}

function insertScriptDataBlank()
{
//    console.log("DS");
    st=["Minor","library","Sports","SDL","SIG"];
 for(j=1;j<37;j++)
 {
     console.log("This prese");
  str =document.getElementById('mt'+j).innerHTML;
  console.log(str);
            if(str=="")
            {
                console.log("thus");
                document.getElementById('mt'+j).innerHTML=st[Math.floor(Math.random()*5)];
                
//                document.getElementById('mt1').innerHTML=instructor;
            } 
 }
}
    </script>
<div class="col-md-9">
<section id="main">
      <div class="container">
        <div class="row">
          <div class="col-md-9">
            <div class="list-group">
              <a href="homeAdmin.jsp" class="list-group-item active main-color-bg">
                <span class="glyphicon glyphicon-cog" aria-hidden="true"></span> Select  departments
              </a>
<form action="ViewGeneratedTimeTableBranchSelectedShowTimeTable.jsp"
<div class="form-group">
    
Select Section:
                 <select name="section" class="form-control" >
                <%
                    System.out.println("kasnfsdfnsdjnf");
                    
                    String branch = request.getParameter("branch");
                    System.out.println(branch);
                    SectionDao iDao = new SectionDao();
                      List<SectionDto> l1 = iDao.getAllSectionDataBranchWise(branch);
                      Iterator<SectionDto> itr1=l1.iterator();
                      while(itr1.hasNext())
                      {
                       System.out.println("jasdnfjansdjfn");   
                          SectionDto insDto = new SectionDto();
                              
                          insDto=itr1.next();
                      %>
                      <option value="<%= insDto.getSectionName()%>"><%= insDto.getSectionName() %></option>
                      <!--<option>LoL</option>-->
                      <% } %>
                    
              
              
          </select>
</div>
                      <input type="text" name="branch" value="<%= branch %>" hidden>
      <input type="submit" value="Submit" class="btn btn-danger">
</form>
                      <div>
                          <table width="1000" height="500px" border="3px">
                              <tr>
                                  <td></td>
                                  <td>9-10</td>
                                  <td>10-11</td>
                                  <td>11-12</td>
                                  <td>12-13</td>
                                  <td>13-14</td>
                                  <td>14-15</td>
                                  
                              </tr>
                              <tr>
                                  <td>Monday</td>
                                  <td id="mt1"></td>
                                  <td id="mt2"></td>
                                  <td id="mt3"></td>
                                  <td id="mt4"></td>
                                  <td id="mt5"></td>
                                  <td id="mt6"></td>
                              </tr>
                          <tr>
                                  <td>Tuesday</td>
                                  <td id="mt7"></td>
                                  <td id="mt8"></td>
                                  <td id="mt9"></td>
                                  <td id="mt10"></td>
                                  <td id="mt11"></td>
                                  <td id="mt12"></td>
                              </tr>
                          
                              <tr>
                                  <td>Wednesday</td>
                                  <td id="mt13"></td>
                                  <td id="mt14"></td>
                                  <td id="mt15"></td>
                                  <td id="mt16"></td>
                                  <td id="mt17"></td>
                                  <td id="mt18"></td>
                              </tr>
                          
                              <tr>
                                  <td>Thrusday</td>
                                  <td id="mt19"></td>
                                  <td id="mt20"></td>
                                  <td id="mt21"></td>
                                  <td id="mt22"></td>
                                  <td id="mt23"></td>
                                  <td id="mt24"></td>
                              </tr>
                          <tr>
                                  <td>Friday</td>
                                  <td id="mt25"></td>
                                  <td id="mt26"></td>
                                  <td id="mt27"></td>
                                  <td id="mt28"></td>
                                  <td id="mt29"></td>
                                  <td id="mt30"></td>
                              </tr>
                          <tr>
                                  <td>Saturday</td>
                                  <td id="mt31"></td>
                                  <td id="mt32"></td>
                                  <td id="mt33"></td>
                                  <td id="mt34"></td>
                                  <td id="mt35"></td>
                                  <td id="mt36"></td>
                                  
                              </tr>
                          <!--<input type="submit" onclick="insertScriptData()" ?value="asd">-->
                          </table>
                          
                          
                      </div>
                      
                        <%
                            String section = request.getParameter("section");
//                            System.out.println("kasdf   ");
                            FetchScheduleDao fdao = new FetchScheduleDao();
                        List<FetchScheduleDto> l = fdao.fetchAllScheduleDataOfGivenSection(section);
                        Iterator<FetchScheduleDto> itrFetch = l.iterator();
                        while(itrFetch.hasNext())
                        {
                            FetchScheduleDto f = itrFetch.next();
                            System.out.println("ajsdnf");
                            %>
                        
                            <script> insertScriptData("<%= f.getMid()%>","<%= f.getCourse() %>","<%= f.getFaculty() %>"); </script>
                            
                            <%
                            }
                        
                        %>
                          <script> insertScriptDataBlank(); </script>
                           
                        <button onclick="window.print()">Print the timetable</button>