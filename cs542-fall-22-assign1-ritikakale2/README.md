# CSX42: Assignment 1
## Name: Ritika Sanjay Kale
## B-Number: B00976254

-----------------------------------------------------------------------
-----------------------------------------------------------------------

## Instruction to clean:

####Command: ant -buildfile studentCoursesBackup/src/build.xml clean

Description: It cleans up all the .class files that were generated when you
compiled your code.

## I am using the same command to clean but the path is set to :
rkale2@remote05:~/DP/cs542-fall-22-assign1-ritikakale2$  ant -buildfile studentCoursesBackup/src/build.xml clean

-----------------------------------------------------------------------
## Instruction to compile:

####Command: ant -buildfile studentCoursesBackup/src/build.xml all

Description: Compiles your code and generates .class files inside the BUILD folder.

## Same command

rkale2@remote05:~/DP/cs542-fall-22-assign1-ritikakale2$ ant -buildfile studentCoursesBackup/src/build.xml all

-----------------------------------------------------------------------
## Instruction to run:

####Command: ant -buildfile studentCoursesBackup/src/build.xml run -Darg0=<input_file.txt> -Darg1=<delete_file.txt> -Darg2=<output1_file.txt> -Darg3=<output2_file.txt> -Darg4=<output3_file.txt>

## Replace <fileName.txt> with real file names. For example, if the files are available in the path,
## you can run it in the following manner:

## I am using the same command with change of file names:

rkale2@remote05:~/DP/cs542-fall-22-assign1-ritikakale2$ ant -buildfile studentCoursesBackup/src/build.xml run -Darg0=courseInfo.txt -Darg1=coursePrefs.txt -Darg2=regResults.txt -Darg3=errorLog.txt -Darg4=regConflicts.txt

## If path is not set then absolute path is given while running the command as follows:

ant -buildfile /home/rkale2/DP/cs542-fall-22-assign1-ritikakale2/studentCoursesBackup/src/build.xml run -Darg0=courseInfo.txt -Darg1=coursePrefs.txt -Darg2=regResults.txt -Darg3=errorLog.txt -Darg4=regConflicts.txt



Note: Arguments accept the absolute path of the files.

-----------------------------------------------------------------------
## Description:
Reason for choosing the data structure :
I choosed Hashmap as a data structure to avoid the overlapping of time as it doesnt accept duplicate keys and it is more efficient in terms of time complexity.

## Citations for external material used :
I refered geeksforgeeks for reading and writing the file.

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

Date: -- 29/09/2022


--------------------------------------------------------------------------
## Output 

ID : 111 :: Courses : [D, C, B]:: Satisfaction rate : 7.67
ID : 112 :: Courses : [F, E, D]:: Satisfaction rate : 8.00
ID : 113 :: Courses : [D, F, E]:: Satisfaction rate : 7.33
ID : 114 :: Courses : [D, C, F]:: Satisfaction rate : 7.67

and so on.