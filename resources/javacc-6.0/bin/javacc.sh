#!/bin/sh
JAR="`dirname $0`/lib/javacc.jar"

case "`uname`" in
     CYGWIN*) JAR="`cygpath --windows -- "$JAR"`" ;;
esac

java -classpath "$JAR" javacc "$@"