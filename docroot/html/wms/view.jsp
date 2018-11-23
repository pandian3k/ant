<%@page import="com.sbi.wms.service.WMS_INB_BRANCH_MASTERLocalServiceUtil"%>
<%@page import="com.sbi.wms.model.WMS_INB_BRANCH_MASTER"%>
<%@page import="com.liferay.portal.kernel.bean.PortletBeanLocatorUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.OrderFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.Projection"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQuery"%>
<%@page import="com.liferay.portal.kernel.portlet.PortletClassLoaderUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQueryFactory"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />


<script src="<%=request.getContextPath()%>/js/jquery-1.9.1.min.js"></script>
 <script src="<%=request.getContextPath() %>/js/jquery.validate.js"></script> 
<!--  <script src="https://ajax.aspnetcdn.com/ajax/jquery.validate/1.9/jquery.validate.min.js"></script> -->

<style type="text/css">
	#container{margin:0 auto; width:575px;  line-height:30px; background-color:#29A3CC; padding: 10px 20px; font-family:arial; font-size:13px;}
	#sel_group{width:202px;}

	.frm_sumbit{text-align:center; margin:10px 150px 20px; width:80px;}
	.frm_sumbit a{color:#fff; text-decoration:none; display:block;}
	td label{color:#fff;}
	
	#form_table td {padding-bottom: 20px; /* positive: absolute; */}
</style>

<portlet:actionURL var="actionURL" name="add"> 


</portlet:actionURL>

<div id="container">  
<form name="Wmsfm" id="Wmsfm" method="post" action="<%=actionURL.toString()%>">
<table id="form_table">
<tr>
 <td width="110px;">
  <label>Name *</label>
 </td>
 <td>
  <input type="text" size="25" name="name">
 </td>
</tr>
 
<tr>
 <td>
  <label for="last_name">City *</label>
 </td>
 <td>
 
  <select name="city" id="sel_group">
        <option value="" disabled="disabled" selected="selected">---Select City---</option>
        
 <%
 DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(WMS_INB_BRANCH_MASTER.class, PortletClassLoaderUtil.getClassLoader());
 Projection projection =ProjectionFactoryUtil.property("CITY");	  
 dynamicQuery.setProjection(ProjectionFactoryUtil.distinct(projection));
 dynamicQuery.add(RestrictionsFactoryUtil.isNotNull("CITY"));
 //dynamicQuery.add(RestrictionsFactoryUtil.ne("CITY", "-"));
 //dynamicQuery.add(RestrictionsFactoryUtil.ne("CITY", "."));
 //dynamicQuery.add(RestrictionsFactoryUtil.ne("CITY", ""));
 dynamicQuery.addOrder(OrderFactoryUtil.asc("CITY"));
 List<String> cityList = WMS_INB_BRANCH_MASTERLocalServiceUtil.dynamicQuery(dynamicQuery); 		  
 System.out.println("cityList>>>>>>>>>>"+cityList.size()); 
 
 for(String list :cityList){
%>
	  <option value="<%=list%>"> <%=list %> </option> 
	 
	 <%
}
	 %>
	       
    </select> 
    
    
    
 </td>
</tr>
<tr>
 <td>
  <label for="telephone">Mobile *</label>
 </td>
 <td>
    <input type="text" size="25" name="mobileno" maxlength="10">
 </td>
</tr>
<tr>
 <td>
  <label for="email">Email Address *</label>
 </td>
 <td>
    <input type="text" size="25" name="email">
 </td>
</tr>
<tr>
 <td colspan="2" style="text-align:left; margin:10px 0;">
  <input type="checkbox" value="1" name="agree" required="required">&nbsp; <label for="agree" id="chkAgree">I agree to be contacted by SBI over phone or e-mail</label>
 </td>
</tr>
</table>
 <div class="frm_sumbit">
 <input type="submit" value="Submit" id="wms" />
 </div>
</form>	
</div>



		  	
<style type="text/css">
.error{
 color: red; 
 padding-left: 20px;
 /* position: relative; */
}
</style> 


<script type="text/javascript">
   $(document).ready(function(){	
		  			  		
   jQuery.validator.addMethod("lettersonly", function(value, element) {
		  		  return this.optional(element) || /^[a-z ]+$/i.test(value);
		  		}, "Letters only please"); 
		
		  		  		
		  		  $('#wms').click(function () {
		  			
		  			formvalidate();
		          $("#Wmsfm").submit();  
		      });
		  		
		  		
		  	
		  		 
		  		  function formvalidate(){
		  				  			   
				  	  $('#Wmsfm').validate({
				  		 onfocusout: false,
				  		onkeyup: false,
				  		 
				  		  
				  		  			rules:{
				  		  				"name": {
				                              required: true,
				                              lettersonly: true
				                          },  
				                          "city": {
				                              required: true                            
				                              
				                          },  
				  		  				"mobileno":{
				  		  					required:true,
				  		  					number: true,
				  		  				    minlength: 10
				  		  					
				  		  				},
				  		  			   "email":{
			  		  					required:true,
			  		  					email:true
			  		  				
			  		  				},
			  		  			 agree: "required"
				  		  				
				  		  			},
				  		  			messages:{	
				  		  				 "name": {
				  	                         required:"Please enter Name",
				  	                         lettersonly :"No special character or numbers allowed"
				  	                     },
				  	                     "city": {
				  	                         required:"Please select a City"
				  	                         
				  	                     },
				  		  		
				  		  			   "mobileno": {
				                           required: "Please enter Mobile No",
				                           number : "Mobile number must contain digits only",
				                           minlength: "Mobile number must be 10 digits"
				                       },
				                       "email": {
				                           required: "Please enter Email address",
				                           email : "Please enter valid email address"
				                       },
				                       
				                       agree:"Please check agree"
				                            
				                           //number : "Mobile number must contain digits only"
				                       
				                       
				                       },
				                       

				                       
				                        
				                       errorPlacement: function (error, element) {
		            if (element.attr("type") == "checkbox") {
		                error.insertAfter("#chkAgree");
		            }else{
		            	console.log($(element));
		            	error.insertAfter($(element));
		            }
		        } 
				                     
				  		  		}); 
		  			  
		  		  }
		  		  
		  	
		  				
		  	});	
		  	</script>
		  	
