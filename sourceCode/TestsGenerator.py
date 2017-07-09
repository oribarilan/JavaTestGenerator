import os
import glob
import datetime
from os import listdir
from os.path import isfile, join
import re,sys
from subprocess import call
import ntpath
import argparse


parser = argparse.ArgumentParser(description='java test generator')
parser.add_argument(dest='rootpath', type=str, nargs='?', help='the path of the root directory of the Java project')
parser.add_argument(dest='timeout', type=int, nargs='?', default=60,
                    help='time limit in seconds for the test generation process. default is 60 seconds.')

args = parser.parse_args()


def print_header(rootpath, timeout):
    print("Test Generator Details:")
    print("==========================")
    print("root path: {0}".format(rootpath))
    print("timeout: {0}".format(timeout))
    print()

JAVA_TXT_FILE = 'jfiles.txt'
GENERATED_TEST_JAVA_TXT_FILE = 'generated_test_files.txt'
CLASSLIST_TXT_FILE = 'classlist.txt'
GENERATED_TESTS_FOLDER = 'Generated_Test_Classes_{0}'.format(datetime.datetime.now().strftime('%Y-%m-%d_%H-%M-%S'))

def GenerateTests():
    # TODO: add flag to rebuild
    rootpath = args.rootpath
    timeout = args.timeout
    print_header(rootpath, timeout)
    bin_dir = r"{0}\bin".format(rootpath)
    if not os.path.exists(bin_dir):
        os.makedirs(bin_dir)
    folder = rootpath
    # folder = r'C:\Users\t-avadir\eclipse-workspace\Calculator\src'
    jfiles = glob.glob('{0}\**\*.java'.format(folder), recursive=True)
    classlist = []
    with open(JAVA_TXT_FILE,"w+") as jfilestxt:
        for jfile in jfiles:
            jfilestxt.write(jfile+os.linesep)
            filename = ntpath.basename(jfile).split('.')[0]
            classlist.append(filename)
    # write classlist to file
    with open(CLASSLIST_TXT_FILE,"w+") as classlisttxt:
        for c in classlist:
            classlisttxt.write(c+os.linesep)
    # compile project
    call(r'javac -cp ".\junit-4.12.jar;.\hamcrest-core-1.3.jar" @{1} -d "{0}"'.format(bin_dir, JAVA_TXT_FILE))
    # generate test classes
    call(r'java -ea -classpath ".\randoop-all-3.1.5.jar";"{0}" randoop.main.Main gentests --classlist={1} --timelimit={2}'.format(bin_dir, CLASSLIST_TXT_FILE, str(timeout)))
    # compile test classes

    generated_test_files = glob.glob(r'.\*.java', recursive=False)
    # generated_test_files_joined = ' '.join(generated_test_files)
    with open(GENERATED_TEST_JAVA_TXT_FILE,"w+") as gjfilestxt:
        for gjfile in generated_test_files:
            gjfilestxt.write(gjfile+os.linesep)

    call(r'javac -cp .\junit-4.12.jar;.\hamcrest-core-1.3.jar @{1} @{2} -d "{0}"'.format(bin_dir, JAVA_TXT_FILE, GENERATED_TEST_JAVA_TXT_FILE))
    # run test classes
    call(r'java -cp ".\;junit-4.12.jar;hamcrest-core-1.3.jar;{0}" org.junit.runner.JUnitCore RegressionTest'.format(bin_dir))

    # move generated test classes to folder
    if not os.path.exists(GENERATED_TESTS_FOLDER):
        os.makedirs(GENERATED_TESTS_FOLDER)
    for gtf in generated_test_files:
        os.rename(gtf, r".\{0}\{1}".format(GENERATED_TESTS_FOLDER,gtf))

    # clean redundant files
    os.remove(JAVA_TXT_FILE)
    os.remove(GENERATED_TEST_JAVA_TXT_FILE)
    os.remove(CLASSLIST_TXT_FILE)

GenerateTests()