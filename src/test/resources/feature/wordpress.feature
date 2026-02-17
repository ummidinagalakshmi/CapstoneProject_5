Feature: WordPress Capstone Project

Scenario: Verify WordPress functionalities

Given User launches WordPress website
Then Verify the title of the page
When User mouse hover and click Get WordPress
Then Verify Get WordPress text
When User clicks Community and Photo Directory
And User searches photo name "nature"
Then Verify pictures are displayed