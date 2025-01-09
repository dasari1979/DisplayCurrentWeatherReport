# WeatherReportAPI

# Spring boot Application to fetch current Weather report 
  **  System requirements

      -- Java 1.8
	  -- Srping boot 2.7.18
	  -- Maven 3.3.8(EMBEDDED)
	  -- Eclipse Oxygen Release (4.7.0) or IntelliJ
	  -- MySQL
	  -- Postman
	  -- Web Browser
	  -- API KEY
	  
# Steps to set up and run
  
  ## Install MySQL database
  ```
     1. Create database
	 2. Set UserName and Password in application.properties
  ```
  ## Generate API KEY
  
   **  https://api.openweathermap.org/
  
  ## Checkout repository
  ``` 
       open bash command and run the command
	   git clone https://github.com/dasari1979/DisplayCurrentWeatherReport.git
	   cd weatherreport
  ```

  ## Step 1: command prompt
  ```	 
	   1. Press Windows + R, type cmd, and press Enter.
	   2. Navigate to the Application Directory
	   3. Run jar
          java -jar target\weatherreport-0.0.1-SNAPSHOT.jar
  ```
  ## Step 2: Run the Application
	```	  Run command
          java -jar target\weatherreport-0.0.1-SNAPSHOT.jar	
    ```
  ## Step 3: Authentication and Autherization
  
     *** User Registration
     ```
		### Steps to Send a Request in Postman:

		1. **Open Postman**:
		   - Launch the Postman application.

		2. **Create a New Request**:
		   - In Postman, click on the **"New"** button on the top-left corner.
		   - Select **"Request"** from the options that appear.

		3. **Enter the URL**:
		   - In the **"Request"** tab, you'll see a field labeled **"Enter URL"**.
		   - Paste or type the URL http://localhost:8000/app/auth/register.

		4. **Select the HTTP Method**:
		   - Next to the URL field, there is a dropdown menu to select the HTTP method (e.g., GET, POST, PUT, DELETE).
		   - Choose the appropriate method for the request, please choose POST.

		5. **Select Body tabs below the URL field.**:
		   - Select **raw** radio button and add data below format
			{
			"username": "Test",
			"password": "Test"
             }

		6. **Send the Request**:
		   - Once everything is set up, click the **"Send"** button on the right side of the request bar.
		   - Postman will make the request and display the response in the lower section of the interface.

		7. **View Response**:
		   - Postman will show the response status(201) and headers once the request completes.
		
		8. **User registered**:

		### Example:
		- URL: `http://localhost:8000/app/auth/register`
		- Method: `POST`
		- After clicking "Send," Postman will display the list of posts from the JSONPlaceholder API.
					 
	 ```
	      *** User Login
     ```
		### Steps to Send a Request in Postman:

		1. **Open Postman**:
		   - Launch the Postman application.

		2. **Create a New Request**:
		   - In Postman, click on the **"New"** button on the top-left corner.
		   - Select **"Request"** from the options that appear.

		3. **Enter the URL**:
		   - In the **"Request"** tab, you'll see a field labeled **"Enter URL"**.
		   - Paste or type the URL http://localhost:8000/app/auth/login.

		4. **Select the HTTP Method**:
		   - Next to the URL field, there is a dropdown menu to select the HTTP method (e.g., GET, POST, PUT, DELETE).
		   - Choose the appropriate method for the request, please choose POST.

		5. **Select Body tabs below the URL field.**:
		   - Select **raw** radio button and add data below format
			{
			"username": "Test",
			"password": "Test"
             }

		6. **Send the Request**:
		   - Once everything is set up, click the **"Send"** button on the right side of the request bar.
		   - Postman will make the request and display the response in the lower section of the interface.

		7. **View Response**:
		   - Postman will show the response status(200) and headers once the request completes.
		   - Token will be generated
		
		8. **Generate Token**:
           - Copy token from Response body.
		   
		### Example:
		- URL: `http://localhost:8000/app/auth/login`
		- Method: `POST`
		- After clicking "Send," Postman will display the list of posts from the JSONPlaceholder API.
					 
	 ```
  
  ## Step 4: Insert data into database
  
       *** User Registration
     ```
		### Steps to Send a Request in Postman:

		1. **Open Postman**:
		   - Launch the Postman application.

		2. **Create a New Request**:
		   - In Postman, click on the **"New"** button on the top-left corner.
		   - Select **"Request"** from the options that appear.

		3. **Enter the URL**:
		   - In the **"Request"** tab, you'll see a field labeled **"Enter URL"**.
		   - Paste or type the URL http://localhost:8000/app/weather.

		4. **Select the HTTP Method**:
		   - Next to the URL field, there is a dropdown menu to select the HTTP method (e.g., GET, POST, PUT, DELETE).
		   - Choose the appropriate method for the request, please choose POST.

		5. **Authorization**:
		   - Select the Authorization tab.
		   - Choose Bearer Token from the dropdown.
		   - Enter the token in the Token field.
		   - Postman will add the Authorization: Bearer <token> header to your request.
		   
		6. **Select Body tabs below the URL field.**:
		   - Select **raw** radio button and add data below format
			{
				"postalCode": "123456",
				"user": "max"
            }

		7. **Send the Request**:
		   - Once everything is set up, click the **"Send"** button on the right side of the request bar.
		   - Postman will make the request and display the response in the lower section of the interface.

		8. **View Response**:
		   - Postman will show the response status(201) and headers once the request completes.
		   - Data will be stored in the Database
		

		### Example:
		- URL: `http://localhost:8000/app/weather`
		- Method: `POST`
		- After clicking "Send," Postman will display the list of posts from the JSONPlaceholder API.
					 
	 ``` 
  ## Step 5: Test the Application  
     ```
	    1. **Open Your Web Browser**: 
		2. **Navigate to the Weather URL:**:		
		In the browser’s address bar, type the following URL, replacing Postalcode or user with the code and Max.
	      
     ```	 
	   ***  http://localhost:8000/app/history?postalcode=560100
	   ***  http://localhost:8000/app/history?user=Max
	   
  ## Step 6: Review the project code
  
      *** Import the proejct into eclipse or IntelliJ
  ```
       1. File->Import->Existing Maven Project
	   2. Browse the project directory
	   3. Click Finish
  ```