# AgileProject
First I have created a feature folder and under feature file I have created one file name feature file where I have write my test cases using gherkin Language.
Then I have automated the test case and put it in Stepdefs.
I have created another folder which is called config where I have created another folder called testNG.xml
I created another Package under that package I created one class called TestRunner class which connect the manual test case which is feature file and automation script stepdefs
I put all my webElement in Page Factory which is a interface and write the code in stepdefs
I updated my pom.xml by two plug in name Mavan sure fire plugin and Maven compiler plugin and dependency Selenium Java, Cucumber Java, Cucumebr TestNg and TestNG.
I push the code to GIT hub 
I open the Jenkins and updated by Maven Integrated plugin and select the Java path, GIT path and Run the project build periodically
Generate report from Target folder.
