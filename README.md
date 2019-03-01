# Code Challenge

## QA Principles

Prevention over goalkeeping
Risk based test coverage over systematic test coverage
Testing skill over test detail
Automation over manual (as much as possible)
Fail as a team over Success as an individual
Continuous Improvement over big bang changes
   
## Instruction for you mission:

Fork this project, and provide your own github or bitbucket repository.
Setup this project with all the libraries you needed to set a testing framework
Make sure you work on a feature branch , not on master.
Naming convention for the feature branch should be "feature/<YourName-QloyalCodeTest>".
Once you are complete push code to the feature branch only.
Use best practices to write code which you follow in your day to day development.

## Your mission

- Try to complete as much as possible with in **2 days** base on the **Role you are applying** 
- Ensure you provide a ***README.md*** file explaining how to run your code and the **ROLE that you are applying for**
- **Avoid using .docx** files (this is not easy to read on git repositories)

### REST API 

Go to URL : https://www.weatherbit.io/api/swaggerui/weather-api-v2#/
Create an automated regression for the below ACs
Using either RestAssure or Newman
API documentation https://www.weatherbit.io/api/swaggerui/weather-api-v2#/

- AC1. I want to get Current Weather Data for multiple places in the world base on Lat and Lon
- AC2. I want to get Current Weather Data for multiple places in the world base on PostCode

    - 1 point per test case executed
    - 2 points per Bug found and Documented

Provide a reports of the exucution and any bugs found ( be creative )


### WEB

Go to URL : http://phptravels.com/demo/

Create an automated smoke test suite using http://devexpress.github.io/testcafe/ or your framework of choice for the below ACs 
(you can do some manual set up, but this must be documented)

- AC1. I want to be able book hotels, flights or tours

    - 1 point per test case executed
    - 2 points per Bug found and Documented

Provide a reports of the exucution and any bugs found ( be creative )


### MOBILE

Go to https://apkpure.com/fitbit/com.fitbit.FitbitMobile/download
Create an automated smoke test suite using http://appium.io/ and any BDD framework

- AC1. User is able to login

    - 1 point per test case executed
    - 2 points per Bug found and Documented

Provide a reports of the exucution and any bugs found ( be creative )


## EXTRA POINTS

+ 10 points each


1. Go to https://github.com/awslabs/aws-device-farm-sample-app-for-ios and run the below feature files
- https://github.com/awslabs/aws-device-farm-sample-app-for-ios/blob/master/features/login_page.feature
- https://github.com/awslabs/aws-device-farm-sample-app-for-ios/blob/master/features/home_page.feature

2. Run Services automation regression in a CI tool like circle-ci, shippable, AWS codebuild

3. Deploy a Selenium grid with Docker and run phptravels smoke test in Chrome and Firefox

4. Provide performance test for https://qa-challenges-lightbulb.atlassian.io services

5. Run lighthouse performance test for http://phptravels.com/demo/ homepage and 3 other pages you think are relevant

6. Fire off SoapUI tests by sending the SoapUI project file to a docker container. 

## NOTE

If you are not able to complete the challenge with the tools requested,
but you have a framework you are familiar with, please submit the alternative with the relevant documentation 
on how to install and run your tool **(Linux base installations are prefered)**