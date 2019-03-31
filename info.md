# MyServer from a Birdseye

## Back End
The back end of the webapp is just a java program that is configured to listen on port 8080 (tomcat standard run port) 
and have controller listeners for various paths off of port 8080 (eg localhost:8080/home) has a controller listener looking on the 
path /home. Back End files can be found in the project under:
- /src/main/java

### Start Up 
Spring first looks for the @SpringBootApplication annotation, this generally is put on the main class that will "spin up"
instantiating the tomcat server.  This annotation in our case also handles the component scan, which is the lazy mans way of
defining the beans that spring will use in the application (passing in the base package which spring will look for specially 
annotated classes like controllers or entites).

### Listeners
@Controllers and @RestController mappings are used in the back end to define "resources" or URI endpoints that can be accessed and are picked up by the component scan.
#### @RestController
Think of these as means of which Java can deliver data from the file system/database to the UI via packaged up objects. these objects
will be automatically serialized and sent in the HTTP response body in a JSON format (https://www.w3schools.com/js/js_json_intro.asp).
#### @Controller
These are a little less familiar to me - but @Controllers seem to work very closely with the context that ThymeLeaf creates for our
webapp.  if you take a look at HomeController.java, you see we simply return a string "index". The @Controller somehow knows with 
linkage set up by ThymeLeaf to look for a file named "index" in src/main/resources/templates/


## Front End
The front end of the webapp is a simple single page webpage using HTML/Bootstrap, JavaScript (angularjs, and jQuery). 
- Bootstrap is just HTML with some extra goodies, and polished styles that looks a little nicer out of the box. 
- Javascript used here is AngularJS which we will use to talk to our API via http requests, that we then "pack" the 
response body received into javascript objects to use within ourb UI.  

### ThymeLeaf
Thymeleaf I am not totally familiar with but seems to be a nice little UI helper for hosting the front end files within our tomcat
container.  By defualt it makes static "template" html files to be registered and mad available to be hosted by
tomcat (our backend server instance).  Usually a separate server would be used to host the front end html files like Apache HTTPD, but
since we are only going to have a single page web app (or relatively simple) it seems beneficial to keep everything contained in one project.

#### xmlns:th
This needs to be added to the root of the html file to allow the htmnl file to know to use ThymeLeaf configurations etc throughout
the page. (i think this is where we can configure folders/naming/etc by providing our own namespace other than the default webhosted one)

#### th:src
th:scr is another example similar to @Controller knowing to "look" in the right location for template html files, however, th:src 
is used within the html template files to define where javascript/linked files for the front end would be (see script tags towards bottom
of index.html).  I'm sure this linkage is more configurable, but I haven't looked into it yet.

### Angular
There is gonna be WAY better docs out on google than what I can provide. But here's my (dumb) take on Angular components. 

#### Modules
Large chunks of a front end web application. I think of these as like pages (eg a home page may have its own module, where a view of
the marketplace may have its own module on a site like eBay.)

#### Controllers
Controllers hold all the logic for a piece of a component.  Sticking with the ebay example, you may have a component that would 
handle building the item list. including invoking the api resource to get the marketplace/item list (built from the database data etc)
and packaging it into a useful javascript object to be consumed by the ui.  HTML pages will be able to access objects defined in the 
controller for a module via double curly braces {{$scope.test}}

#### Services
Services are just javascript work horses that handle the back and forth between the api. They actually invoke the http request that
is desired (GET/POST/PUT/DELETE etc).
