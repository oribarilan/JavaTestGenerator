# JavaTestGenerator
A Pyhon test generator utility script for Java projects.

Created by Aviram Adiri & Ori Bar-ilan

## Credits
This project wraps the [Randoop](https://randoop.github.io/randoop/ "Randoop") test generator for ease-of-use.

## Installation
- Install [Java SE Development Kit 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html "JDK") (well, duh)
- Add `jdk\bin` folder to the `PATH` system variable of the environment variables
	> For example, the default Java 8 installation for Windows will place the `jdk\bin` folder at:
	> `C:\Program Files\Java\jdk1.8.0_131\bin`
- Add `jdk` folder as a new system variable of environment variables. The name of the variable should be `JAVA_HOME`
	> For example, the default Java 8 installation for Windows will place the `jre\bin` folder at:
	> `C:\Program Files\Java\jre1.8.0_131\bin`
- Make sure both `java` and `javac` commands are valid cmd commands
- Copy `tools.jar` from `jdk\lib` to `jre\lib`

## Run
- Run `testgen.py` together with a `rootpath` argument (and optionally a `timeout` argument)
	> For Example: 
	>	*	`python testgen.py "C:\MyJavaWorkspace\MyJavaProject\"` *(a default timeout of 60 seconds will be set)*
	>	*	`python testgen.py "C:\MyJavaWorkspace\MyJavaProject\" 30`
- Run `testgen.py -help` for help

## Output
- Generated java test classes are created in a new folder `Generated_Tests_Classes_DATE_TIME` in this project's root folder
- Additionally, you can add `> output.txt` to the invokation in order to save the output to a text file
	> For Example: 
	>	*	`python testgen.py "C:\MyJavaWorkspace\MyJavaProject\" > output.txt`
	
### Enjoy!
