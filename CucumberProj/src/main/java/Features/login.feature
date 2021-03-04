Feature: Create Test case

#Scenario: Test Application
#Given User is on login page
#When Title is gmail
#Then user enters username 
#Then user enters password
#Then user sucessfully logged in

#Scenario: Test application1
#Given user on login
#When title is gm

#with examples keyword
Scenario Outline: Test Application2
Given Userone is on login page
When Title is gmail as
Then user enters "<username>" and "<password>"

Examples:
   
   | username | password |
   | ashish   | Rout     |
  # | abcdef   | qwey     |

   
Scenario: Test Application3
Given Userone is on login page
When Title is gmail as
   