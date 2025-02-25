	@tag
	Feature:
as admin user validate Supplier and Customer
Scenario Outline:
i want verify suppliers with multiple data
Given Launch url"http://webapp.qedgetech.com/" in a browser
When enter user name  with "name" and "username" and "admin"
And enter password with "xpath" and "//input[@id='password']" and "master"
And click login button with "xpath" and "//button[@id='btnsubmit']"
Then validate title with "Dashboard « Stock Accounting"
When click suppliers link with "xpath" and "(//a[contains(text(),'Suppliers')])[2]"
When click add icon with "xpath" and "(//span[@data-caption='Add'])[1]"
When capture a supplier number with "name" and "x_Supplier_Number"
When enter in "<SupplierName>" with "id" and "x_Supplier_Name"
When  enter in "<address>" with "xpath" and "//textarea[@id='x_Address']"
When  enter in "<city>" with "xpath" and "//input[@id='x_City']"
When  enter in "<country>" with "xpath" and "//input[@id='x_Country']"
When  enter in "<cpersion>" with "xpath" and "//input[@id='x_Contact_Person']"
When  enter in "<pnumber>" with "xpath" and "//input[@id='x_Phone_Number']"
When  enter in "<mail>" with "xpath" and "//input[@id='x__Email']"
When  enter in "<mnumber>" with "xpath" and "//input[@id='x_Mobile_Number']"
When  enter in "<notes>" with "xpath" and "//textarea[@id='x_Notes']"
When  click add button with "id" and "btnAction"
When click confirm ok with "xpath" and "//button[normalize-space()='OK!']"
When click alert ok with "xpath" and "(//button[contains(text(),'OK')]"
Then validate supplier table
When close browser
Examples:
|SupplierName|address|city|country|cpersion|pnumber|mail|mnumber|notes|
|Navaneetha|Ameerpet|Hyderabad|India|QedgeTech|6756456788|Testing@gmail.com|5643278906|Supplying goods|
|Navaneetha1|Ameerpet1|Hyderabad|India|QedgeTech1|6756456788|Testing@gmail.com|5643278906|Supplying goods|
|Navaneetha2|Ameerpet2|Hyderabad|India|QedgeTech2|6756456788|Testing@gmail.com|5643278906|Supplying goods|
|Navaneetha3|Ameerpet3|Hyderabad|India|QedgeTech33|6756456788|Testing@gmail.com|5643278906|Supplying goods|
|Navaneetha4|Ameerpet4|Hyderabad|India|QedgeTech4|6756456788|Testing@gmail.com|5643278906|Supplying goods|








