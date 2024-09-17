# cs542-fall-22-assign2
# CSX42: Assignment 2
## Name: Ritika Sanjay Kale
## B-Number: B00976254

Number of Slays day used = 0
-----------------------------------------------------------------------
-----------------------------------------------------------------------

## Instruction to clean:

####Command: ant -buildfile studentCoursesBackup/src/build.xml clean

Description: It cleans up all the .class files that were generated when you
compiled your code.

## I am using the same command to clean but the path is set to :

rkale2@remote03:~/DP/cs542-fall-22-assign2-ritikakale2$ ant -buildfile studentRecordsBackupTree/src/build.xml clean

-----------------------------------------------------------------------
## Instruction to compile:

####Command: ant -buildfile studentCoursesBackup/src/build.xml all

Description: Compiles your code and generates .class files inside the BUILD folder.

## Same command

rkale2@remote03:~/DP/cs542-fall-22-assign2-ritikakale2$ ant -buildfile studentRecordsBackupTree/src/build.xml all

-----------------------------------------------------------------------
## Instruction to run:

####Command: ant -buildfile studentCoursesBackup/src/build.xml run -Darg0=<input_file.txt> -Darg1=<delete_file.txt> -Darg2=<output1_file.txt> -Darg3=<output2_file.txt> -Darg4=<output3_file.txt>

## I am using the same command with change of file names:

rkale2@remote03:~/DP/cs542-fall-22-assign2-ritikakale2$ ant -buildfile studentRecordsBackupTree/src/build.xml run -Darg0=bstInput.txt -Darg1=bstOutput.txt -Darg2=bstError.txt -Darg3=10 -Darg4=1

## If path is not set then absolute path is given while running the command as follows:

ant -buildfile /home/rkale2/DP/cs542-fall-22-assign2-ritikakale2/studentRecordsBackupTree/src/build.xml run -Darg0=bstInput.txt -Darg1=bstOutput.txt -Darg2=bstError.txt -Darg3=10 -Darg4=1

------------where the third argument is debug level and fourth argument is updated value.


Note: Arguments accept the absolute path of the files.

-----------------------------------------------------------------------
## Description:
# Reason for choosing the data structure :
I have used Linkedlist and BST. As Linkedlist is more dynamic and is ideal for application who requires frequent operations like insert, update, etc.
Also it is more efficient in terms of space complexity as each time you are adding a element a node is created and there is no wastage of space.

# For Design:
As we have used observer pattern for design it is a behavioral pattern and is useful to get notified whenever there is any change. It defines one to many relationships between object so that when one object changes state, all its dependents are notified and updated automatically. As in our program we are making changes in Main Binary search tree and the chnages are reflected in the Backups tree automatically.

# About my project
I have used an intermediate class (BST Builder) whic process the input and update the backup classes.
Also I had done boundary check and handled exception and the errors which are printed the bstError file. For example, if the input file is missing the bsterror file will show 
While processing input file : FileNotFoundException bstInput.txt (No such file or directory)

## Citations for external material used :
I refered geeksforgeeks for reading and writing the file. I also referred some youtube videos and javatpoint to see how observer pattern is used.

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

Date: -- 23/10/2022


--------------------------------------------------------------------------
## Output 
# (I am getting)

Inorder Traversal
BST: 5,7,10,13,14,
Backup-1: 5,7,10,13,14,
Backup-2: 5,7,10,13,14,


BST: 49
Backup-1: 49
Backup-2: 49

Sum of all the B-Numbers After Increment: 

BST: 54
Backup-1: 54
Backup-2: 54

