r"""
This scripts automatically generates test for a Java project
This can be invoked like so:
python testgen.py "C:\MyProjects\MyJavaProject\"
python testgen.py "C:\MyProjects\MyJavaProject\" 30
"""

import datetime
import argparse
import os
from os.path import isfile
import glob
from subprocess import call
import ntpath

# parse arguments
PARSER = argparse.ArgumentParser(description='java test generator')
PARSER.add_argument(dest='rootpath', type=str, nargs='?',
                    help='the path of the root directory of the Java project')
PARSER.add_argument(dest='timeout', type=int, nargs='?', default=60,
                    help="""time limit in seconds for the test generation process.
                    default is 60 seconds.""")
ARGS = PARSER.parse_args()


def print_header(rootpath, timeout):
    """
    print execution description
    """
    print("Test Generator Details:{0}=========================={0}root path: {1}{0}timeout: {2}{0}"
     .format(os.linesep, rootpath, timeout))

JAVA_TXT_FILE = 'jfiles.txt'
GENERATED_TEST_JAVA_TXT_FILE = 'generated_test_files.txt'
CLASSLIST_TXT_FILE = 'classlist.txt'
GENERATED_TESTS_FOLDER = 'Generated_Test_Classes_{0}'.format(
    datetime.datetime.now().strftime('%Y-%m-%d_%H-%M-%S')
    )

def generate_tests():
    """
    generate tests
    """
    rootpath = ARGS.rootpath
    timeout = ARGS.timeout
    print_header(rootpath, timeout)
    bin_dir = r"{0}\bin".format(rootpath)
    if not os.path.exists(bin_dir):
        os.makedirs(bin_dir)
    folder = rootpath
    jfiles = glob.glob('{0}\**\*.java'.format(folder), recursive=True)
    classlist = []
    # write java files to files
    with open(JAVA_TXT_FILE, "w+") as jfilestxt:
        for jfile in jfiles:
            jfilestxt.write(jfile + os.linesep)
            filename = ntpath.basename(jfile).split('.')[0]
            classlist.append(filename)
    # write classlist to file
    with open(CLASSLIST_TXT_FILE, "w+") as classlisttxt:
        for classname in classlist:
            classlisttxt.write(classname + os.linesep)
    # compile project
    call(r'javac -cp ".\junit-4.12.jar;.\hamcrest-core-1.3.jar" @{1} -d "{0}"'
         .format(bin_dir, JAVA_TXT_FILE))
    # generate test classes
    call(r'java -ea -classpath ".\randoop-all-3.1.5.jar";"{0}" randoop.main.Main gentests --classlist={1} --timelimit={2}'
         .format(bin_dir, CLASSLIST_TXT_FILE, str(timeout)))
    # compile test classes
    generated_test_files = glob.glob(r'.\*.java', recursive=False)
    with open(GENERATED_TEST_JAVA_TXT_FILE, "w+") as gjfilestxt:
        for gjfile in generated_test_files:
            gjfilestxt.write(gjfile+os.linesep)
    call(r'javac -cp .\junit-4.12.jar;.\hamcrest-core-1.3.jar @{1} @{2} -d "{0}"'
         .format(bin_dir, JAVA_TXT_FILE, GENERATED_TEST_JAVA_TXT_FILE))
    # run test classes
    call(r'java -cp ".\;junit-4.12.jar;hamcrest-core-1.3.jar;{0}" org.junit.runner.JUnitCore RegressionTest'.format(bin_dir))
    # move generated test classes to folder
    if not os.path.exists(GENERATED_TESTS_FOLDER):
        os.makedirs(GENERATED_TESTS_FOLDER)
    for gtf in generated_test_files:
        os.rename(gtf, r".\{0}\{1}".format(GENERATED_TESTS_FOLDER, gtf))
    # clean redundant files
    os.remove(JAVA_TXT_FILE)
    os.remove(GENERATED_TEST_JAVA_TXT_FILE)
    os.remove(CLASSLIST_TXT_FILE)

generate_tests()
