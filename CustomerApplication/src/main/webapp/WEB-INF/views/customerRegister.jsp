 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 <h1 align="center">Enter Student Details</h1>
 <form:form action="register.form"  method="POST" commandName="customer">
 <table>
 	<tr>
 		<td>*First Name:</td>
 		<td><form:input path="firstName"/><br></td><td style='color:red'><form:errors path="firstName"/></td>
 		<td><form:input path="middleName"/><br> </td>
 		<td>Last Name:</td>
 		<td><form:input path="lastName"/><br></td><td style='color:red'><form:errors path="lastName"/></td>
 	</tr>
 	<tr>
 		<td>*Date of Birth:</td>
 		<td><form:input path="dateOfBirth"   /><br></td><td style='color:red'><form:errors path="dateOfBirth"/></td>
 		 <td>Gender</td>
 		<td> <form:radiobutton path="gender" value="MALE" label="Male"/>
 		 <form:radiobutton path="gender" value="FEMALE" label="Female"/><br></td><td style='color:red'><form:errors path="gender"/>
 		 </td>
 	</tr>
 	<tr>
 	   <td>*Email ID: </td>
 		<td><form:input path="email"/><br></td><td style='color:red'><form:errors path="email"/></td>
 		<td>*Mobile No:</td>
 		<td><form:input path="mobileNo"/><br></td><td style='color:red'><form:errors path="mobileNo"/></td>
 	</tr>
 	<tr>
 	<td>PAN NO:</td>
 		<td><form:input path="panNo" /><br></td><td style='color:red'><form:errors path="panNo"/></td>
 	</tr>
 	<tr>
 		<td>Street</td>
 		<td> <form:input path="address.street"  /></td>
 		<td> <form:input path="address.city"  /></td>
 		<td> <form:input path="address.district"  /></td>
 		<td> <form:input path="address.pinNo"  /></td>
 		<td> <form:input path="address.state"  /></td>
 		<td> <form:input path="address.country"  /></td>
 		  <td>*Skill Set(Multiple)</td>
 		<td> <form:select path="cource" multiple="">
 					<form:option value="JAVA">JAVA</form:option>
 					<form:option value="DOTNET">.NET</form:option>
 					<form:option value="ORACLE">ORACLE</form:option>
 					<form:option value="HADOOP">HADOOP</form:option>
 					<form:option value="PHP">PHP</form:option>
 					<form:option value="PYTHON">PYTHON</form:option>
 					<form:option value="C/C++">C/C++</form:option>
 		</form:select>
 		
</td>
 	</tr>
 	
 	<tr><td align="center"><input type="submit" value="submit"></td></tr>
 	</table>
 </form:form>