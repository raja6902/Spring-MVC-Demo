<%@ taglib prefix = "form" uri="http://www.springframework.org/tags/form"  %>

<!DOCTYPE html>

<html>


<head>


<title>Student Registration Form</title>




</head>

<body>


	<form:form action="processForm" modelAttribute="student">

First name: <form:input path="firstName" />
		<br>
		<br>
Last name: <form:input path="lastName" />

		<br>
		<br>
		
Country: <form:select path="Country">

           <form:options items = "${student.countryOptions}"/>
          
           
           
           
           
         </form:select>  
            

 	
		<br>
		<br>
		 
		 Favorite Language:
		 Java <form:radiobutton path="favoriteLanguage" value="Java"/>
		  C# <form:radiobutton path="favoriteLanguage" value="C#"/>
		   Ruby<form:radiobutton path="favoriteLanguage" value="Ruby"/> 
		   PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>

		 <br><br>
		 
		 Operating System:
		 Mac OS: <form:checkbox path="operatingSystems" value="Mac OS"/>
		 MS Windows: <form:checkbox path="operatingSystems" value="MS Windows "/>
		  Linux: <form:checkbox path="operatingSystems" value="Linux OS"/>
		 
		 
		 <br><br>

		<input type="submit" value="Submit" />
	</form:form>







</body>




</html>