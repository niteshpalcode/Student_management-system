This is a basic Spring Boot application that uses Thymeleaf as a template engine to display and manipulate data related to student objects. 
Here is the documentation for each operation:

Displaying all students:
Endpoint: GET /student
Description: This endpoint retrieves all the student objects from the database using the StudentService, adds them to the model, and returns the student.html template, which displays the list of students.
Template: student.html
Model Attribute: List<student> students
  
  
  Adding a new student:
Endpoint: GET /students/add
Description: This endpoint creates a new student object and adds it to the model, and returns the studentAdd.html template, which displays a form to add a new student.
Template: studentAdd.html
Model Attribute: student student
  
 Posting a new student:
Endpoint: POST /students
Description: This endpoint retrieves the student object from the request body, adds it to the database using the StudentService, and redirects the user to the /student endpoint to display the updated list of students.
Redirect Endpoint: GET /student

  Updating a student:
Endpoint: GET /students/update/{id}
Description: This endpoint retrieves a student object by its id from the database using the StudentService, adds it to the model, and returns the updatestudent.html template, which displays a form to update the student.
Template: updatestudent.html
Model Attribute: student student
  
  
