rd /s/q web\WEB-INF\classes
md web\WEB-INF\classes
xcopy bin\* web\WEB-INF\classes\ /H /Y /C /R /S
cd web\
jar -cvf avto##1.0.0.war *
pause