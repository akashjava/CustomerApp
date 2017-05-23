 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 <h1 align="center">Enter Customer Details</h1>
 <table align="center">
 	<tr>
 		<td>
			 <form:form action="custregister.form"  method="POST" commandName="customervo">
			 <table>
			 	<tr>
			 		<td>*First Name:</td>
			 		<td><form:input path="firstName"/><br></td><td style='color:red'><form:errors path="firstName"/></td>
			 		<td>Middle Name:</td>
			 		<td><form:input path="middleName"/><br> </td>
			 		<td>*Last Name:</td>
			 		<td><form:input path="lastName"/><br></td><td style='color:red'><form:errors path="lastName"/></td>
			 	</tr>
			 </table>
			 	
			 	
			 <table>
			 	<tr>
			 		<td>*Date of Birth:</td>
			 		<td><form:input path="dateOfBirth"   /><br></td><td style='color:red'><form:errors path="dateOfBirth"/></td>
			 		 <td>Gender</td>
			 		<td> <form:radiobutton path="gender" value="MALE" label="Male"/>
			 		 <form:radiobutton path="gender" value="FEMALE" label="Female"/><br></td><td style='color:red'><form:errors path="gender"/>
			 		 </td>
			 	  </tr>
			  </table>
			  
					 <h3>Enter Contact Details</h3> 
			  <table>
				   <tr>
				 	   <td>*Email ID: </td>
				 		<td><form:input path="email"/><br></td><td style='color:red'><form:errors path="email"/></td>
				 		<td>*Mobile No:</td>
				 		<td><form:input path="mobileNo"/><br></td><td style='color:red'><form:errors path="mobileNo"/></td>
				 	 </tr>
				 	
				</table>
				<table>
					<tr>
				 	<td>PAN NO:</td>
				 		<td><form:input path="panNo" /><br></td><td style='color:red'><form:errors path="panNo"/></td>
				 	</tr>
				 </table>
				  <h3>Customer Address:</h3>
				 <table>
			 	<tr>
			 		<td>Street</td>
			 		<td> <form:input path="address.street"  /></td><td style='color:red'><form:errors path="address.street"/></td>
			 		<td>City</td>
			 		<td> <form:input path="address.city"  /></td><td style='color:red'><form:errors path="address.city"/></td>
			 		<td>District</td>
			 		<td> <form:input path="address.district"  /></td><td style='color:red'><form:errors path="address.district"/></td>
			 		</tr>
			 		<tr>
			 		<td>PIN</td>
			 		<td> <form:input path="address.pinNo"  /></td><td style='color:red'><form:errors path="address.pinNo"/></td>
			 		<td>State</td>
			 		<td> <form:input path="address.state"  /></td><td style='color:red'><form:errors path="address.state"/></td>
			 		<td>Country</td>
			 		<td> <form:input path="address.country"  /></td> <td style='color:red'><form:errors path="address.country"/></td>
			 	</tr>
			 	
			 	<tr><td align="center"><input type="submit" value="submit"></td></tr>
			 	</table>
			 </form:form>
			</td>
		</tr>
 </table>