# cs542-fall-22-assign3
# Assignment 3
## Name: Ritika Sanjay Kale
## B-Number: B00976254

Number of Slays day used = 0

-----------------------------------------------------------------------
-----------------------------------------------------------------------


Following are the commands and the instructions to run ANT on your project.
#### Note: build.xml is present in myCampusTour/src folder.

-----------------------------------------------------------------------
## Instruction to clean:

####Command: ant -buildfile myCampusTour/src/build.xml clean

Description: It cleans up all the .class files that were generated when you
compiled your code.

# Same command just the path is set as follows

rkale2@remote03:~/DP/cs542-fall-22-assign3-ritikakale2$ ant -buildfile myCampusTour/src/build.xml clean

-----------------------------------------------------------------------
## Instruction to compile:

####Command: ant -buildfile myCampusTour/src/build.xml all

Description: Compiles your code and generates .class files inside the BUILD folder.

# Same command just the path is set as follows

rkale2@remote03:~/DP/cs542-fall-22-assign3-ritikakale2$ ant -buildfile myCampusTour/src/build.xml all

-----------------------------------------------------------------------
## Instruction to run:

####Command: ant -buildfile myCampusTour/src/build.xml run -Darg0=<bstError.txt> -Darg1=<UPDATE_VALUE> 

## you can run it in the following manner:

ant -buildfile myCampusTour/src/build.xml run -Darg0=campusTourError.txt -Darg1=2

# The command to run

rkale2@remote03:~/DP/cs542-fall-22-assign3-ritikakale2$  ant -buildfile myCampusTour/src/build.xml run -Darg0=10 -Darg1=error.txt

Note: Arguments accept the absolute path of the files.

-----------------------------------------------------------------------
## Description:

# For Design:
We have used Builder pattern for design which consist of different steps to simplify the object creation.

# About my project
I have used an Calculate class (driver) which calculate the value for carbonfootprint, cost, duration, etc.
I have enums in my Builder class which implements BuilderWorkshopI Interface which contains construct method.
Also I have a tour class in which all the get methods are there.
Also the principle of Programming to Interface is satisfied as I have implemented all the interfaces such as CarbonFootprint, Cost, Duration, etc in Calculate class.
Done Exception handling in the Driver class for creating file. If error.txt file is not found it will be handled and create the file.

## Citations for external material used :
I refferred some online tutorial to get clear idea about enums.

-----------------------------------------------------------------------
### Academic Honesty statement:
-----------------------------------------------------------------------

"I have done this assignment completely on my own. I have not copied
it, nor have I given my solution to anyone else. I understand that if
I am involved in plagiarism or cheating I will have to sign an
official form that I have cheated and that this form will be stored in
my official university record. I also understand that I will receive a
grade of 0 for the involved assignment for my first offense and that I
will receive a grade of F for the course for any additional
offense.""

Date: -- 17 November 2022

------------------------------------------------------------------------
### OUTPUT
------------------------------------------------------------------------

 [java] Hello World! Lets get started with the assignment
     [java] 
     [java] For Tour 1
     [java] Calculation for each activity
     [java] Cost : 121$
     [java] Duration : 50 min
     [java] Carbon footprint in terms of CO2 : 38 CO2
     [java] Effort : 337 Calories
     [java] 
     [java] ------------------------------------------------
     [java] 
     [java] For Tour 2
     [java] Calculation for each activity
     [java] Cost : 130$
     [java] Duration : 53 min
     [java] Carbon footprint in terms of CO2 : 40 CO2
     [java] Effort : 354 Calories