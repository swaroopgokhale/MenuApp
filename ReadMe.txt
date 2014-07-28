--Clone the Menu App
	Create ethe folder D:\SpringLearning\testMenuApp
	 go to the folder and open the command prompt
	 D:\SpringLearning\testMenuApp>

	fire the command
	 D:\SpringLearning\testMenuApp>git clone https://github.com/swaroopgokhale/MenuApp .
		source code will get downloaded into the 'testMenuApp' folder
		
--Create the initial Database
	Start the WAMP server 
	Import the database 'springdb' usign the file cretaeDatabase.sql
		--- Use phpadmin's Import tab, to import the database using the sql file 'createDatabase.sql'
		--- After import ,Click on the 'springdb' to check 'menu' table exist with 2 entries ,one for samosa and one for panipuri

(You may have the same MenuApp so we need to rename our test menu app as below)
		
	-- open the POM.xml to change 
			--artifactId to TestMenuApp
			--change final build name as belwo 
				<build><finalName>TestMenuApp</finalName> </build>

	-- modify the .project file as below 
				<name>TestMenuApp</name>

	-- import the project into the eclipse by using 'File --> Import --> Existing Maven Project'

	--	right click on the project and select maven upsate project.
	--	right click on the project and run as maven clean

	--	right click on the project and run it 'maven install'
	--	right click on the project and run it on tomcat server

TESTING :----------------
	
	 
	get the menulist by using below url
	
	1] get all menu's 
	
		http://localhost:8080/TestMenuApp/rest/Menu/getMenuList
			-- it will 2 records as below
				[{"id":1,"name":"samosa","category":"snacks","photo":"photo1"},{"id":10,"name":"panupuri","category":"snacks","photo":"puri1"}]
			
	2] get specific menu Item
		http://localhost:8080/TestMenuApp/rest/Menu/getMenu/samosa
			-- o/p will be as below
			{"id":1,"name":"samosa","category":"snacks","photo":"photo1"}
			
	3] delete the specific menu item
	
		First , in database make sure that 'panipuri' exist with the id 10 , then run below url
		
		http://localhost:8080/TestMenuApp/rest/Menu/deleteMenu/10
		 get the menu list again to make sure that we 'panipuri' got deleted 
		 http://localhost:8080/TestMenuApp/rest/Menu/getMenuList
		
	4] Add a new menu item
			we are addign panipuri again by the jsp page
			jsp contains the hard coded JSON which will get posted 
			Open the index.jsp to change 
				---the ajax url to point "http://localhost:8080/TestMenuApp/rest/Menu/addMenu"
				---Data point to data:"{\"id\" : 11,\"name\":\"panupuri\",\"category\":\"snacks\",\"photo\":\"puri1\"}",
			
			
			open the below URL
			http://localhost:8080/TestMenuApp/
			click on JSON button
			
			 get the menu list again to make sure that we 'panipuri' got deleted 
		 http://localhost:8080/TestMenuApp/rest/Menu/getMenuList		
			It will dosplay
			[{"id":1,"name":"samosa","category":"snacks","photo":"photo1"},{"id":11,"name":"panupuri","category":"snacks","photo":"puri1"}]
	





