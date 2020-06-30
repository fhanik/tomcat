#!/bin/bash

set -e


CURDIR=`pwd`

# resolve links - $0 may be a softlink
PRG="$0"

while [ -h "$PRG" ]; do
  ls=`ls -ld "$PRG"`
  link=`expr "$ls" : '.*-> \(.*\)$'`
  if expr "$link" : '/.*' > /dev/null; then
    PRG="$link"
  else
    PRG=`dirname "$PRG"`/"$link"
  fi
done

# Get standard environment variables
PRGDIR=`dirname "$PRG"`

cd $PRGDIR
#clean up
apache-ant-1.10.7/bin/ant clean 
#build main code base
apache-ant-1.10.7/bin/ant 
#generate embedded jar fles
apache-ant-1.10.7/bin/ant embed 
#install embedded jar files into local Maven repo
(cd res/maven && ../../apache-ant-1.10.7/bin/ant -f mvn-pub.xml generic-install)


cd $CURDIR