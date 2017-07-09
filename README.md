# JavaTestGenerator
A Pyhon test generator utility script for Java projects.


## Installation
- Install Java
- Add jdk\bin folder to PATH system variable in environment variables
- Add jdk folder to a new variable in system variables in environment variables names "JAVA_HOME"
- make sure both "java" and "javac" commands are valid in the command line
- Copy "tools.jar" from jdk\lib to jre\lib

## Run
- run TestsGenerator.py and set the "rootpath" parameters
- run TestsGenerator.py -help for help

- Generated java tests are created as a new folder "Generated_Tests_Classes_DATE_TIME"
- Add '> output.txt' to save the output to a text file