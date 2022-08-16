Feature: SwiggyFood

Scenario: A user should be able to order food from Swiggy.com
Given a user is on the landing page of Swiggy
When user enters Bangalore, Karnatka, India in city field 
And user clicks on Go
And selects the first restaurant available
And user clicks Add on the first item of the restaurant page
And user clicks Checkout button on same page
Then user verifies they are on checkout page by validated text 'SECURE CHECKOUT'

