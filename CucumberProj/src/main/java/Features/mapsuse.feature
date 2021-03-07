Feature: Check accessbility 

Scenario: check login 
	Given Provide Credentials 
		| username | Password|
		| user1    | pass1   |
	When user enters values 
		| Test1|Test2|Test3|
		| set1| set2|set5|
		| set3| set4|set6|
	Then user logged in 
	And user checks title 
	Then user closes browser