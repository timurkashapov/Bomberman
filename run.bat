@echo off

cd src

javac -encoding UTF-8 *.java


java GameApp

pause

del /s /q *.class

cd ..

exit

