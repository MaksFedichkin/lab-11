@ECHO OFF

set CLASSPATH=%PATH%;MyPack;MyPack1
javac -encoding UTF-8 TestBalance.java
java TestBalance
pause