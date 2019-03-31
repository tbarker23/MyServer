# MyServer
basic simple spring boot rest server 

## Getting Started
Since this is a springboot project built with Maven, depenedencies should be downloaded and installed automatically
when the project is imported.  Noted softwared includes embedded tomcat instance (container hosting the webaap),
springboot (handles the class injection throughout the application), springboot web (handles the URI/HTTP listeners), 
and thymeleaf (handles the front end templating for html/js support).  All of these components are defined in the pom.xml file.

### Required Software:
- Eclipse https://www.eclipse.org/downloads/
- JDK 1.8 https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
- Spring Tools (via eclipse market place Help > Eclipse Marketplace)

**NOTE make sure that eclipse is pointed to use the 1.8 jdk**
- Open the Eclipse preferences, select Java > Installed JREs from navigator
- Click Add…
- Select “Standard VM”, click Next
- Enter the path to the Java 1.8 jdk downloaded above
- ensure that eclipse is selected to use mentioned jdk

### Import via e-Git (eclipse):
- Right Click -> Team > import > import... > Projects from Git > clone uri > {this_github_uri}
- Import existing eclipse projects

### Compiling/installing:
#### Compile and get dependencies/sources:
- Right click project > Run As ... > Maven Build ... 
- "clean install" for Goals field
- Run
#### Update the project:
- Right click project > Maven > Update project

### Running
- Right click project > Run > Run as > Run Configurations > Spring Boot App 
- In you new configuration use the project imported as the Project
- Browse for MyServerApplication.java or enter "com.example.demo.MyServerApplication" as the Main Type
- localhost:8080/home should bring up the default dashboard

