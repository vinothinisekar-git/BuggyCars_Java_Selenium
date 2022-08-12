# Test approach - Buggy Cars Rating

# Scope and Objective
BuggyCars Rating (https://buggy.justtestit.org) application has been automated. The objective is to find as much as bugs as possible to make sure that the application has met the best standards before it gets released. #
As part of this automation, I am following the dynamic approach which covers Functional testing, Regression Testing, Data driven, Keyword driven Testing. Basically, it is the test approaches that carries out the parallel execution and evaluation of the test cases.

# Features
The below 5 features have been identified as critical that need to be tested.
•	Register a new user
•	Login/Logout
•	Vote the Car by a Model
•	Vote the Car by a Popular Make
•	User Profile changes

# Tools Used
I am following the Hybrid Framework using both Keyword driven and POM Framework executed through testing test-suite. The below automation tools are used:

•	testing: 7.4.0
•	Selenium-java: 4.2.1
•	Junit: 4.12
•	selenium-chrome-driver (drivers are configurable. Just mention the driver name in the TestCase class. Any driver can be added and just mention the dependency in pom.xml)
•	Build Tool - Maven: 3.0.0
•	Reporting Tool - Extentreports: 2.40.2
•	IntelliJ IDEA 2022.1.2 (Community Edition)

# Steps to execute the Test
1. Download the Project
2. Launch InteliJ Idea/Eclipse
3. Set up the project as Maven project
4. Open pom.xml and make sure that the dependencies are resolved without any errors. (If any errors, make sure that the respective jars are manually added to the project via InteliJ/Eclipse Project Configuration)
5. Build the project using mvn clean install
6. Run the testng.xml file (This will run all the test cases)
7. If any testcase fails due to wrong data, it is the expected behavior.

# For running the testcases with new data, you may need to edit the data by going to the below folders
Go to the folder "data" and enter the new data in the respective file
Go to the folder "keywords" and edit the file TC001_RegisterUser_Keyword.xlsx 
