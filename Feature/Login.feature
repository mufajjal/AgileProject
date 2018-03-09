Feature: contact with AgileTraiblazers by email
In order to contact with AgileTraiblazers
As a user
I want to sent an email
Scenario Outline:  User should be able to sent email to contact with AgileTraiblazers with all required fields
Given new user to the AgileTraiblazers home page
And user wants to contact with AgileTraiblazers management 
When enter "<name>", "<E-mail Address>", "<Phone Number>", "<Office number>", "<Choose Subject>", "<Write Message>"
Then user click submit 
And user get a message"Your message was sent successfully"
Examples:
|  name 		| E-mail Address	|Phone Number	 |office number	| Choose Subject		|Write Message         |  
|  Ahmed		|  rat@yahoo.com    | 0152222        |10032	 	    | Agile                 |How are you 		   |   


