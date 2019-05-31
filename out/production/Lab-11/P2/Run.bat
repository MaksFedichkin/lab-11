@ECHO OFF

set CLASSPATH=%PATH%;P1;P2
javac -encoding UTF-8 Demo.java

java Demo
pause