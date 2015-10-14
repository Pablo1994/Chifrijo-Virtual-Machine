@echo off
if [%1]==[] goto error
echo *** Testing CH with chtest\%1 ***
java -cp .;lib;%CLASSPATH%  CHMain chtest\%1
goto :eof
:error
echo *** Para usarlo teclee '%0 filename' para un archivo 'filename' en chtest ***