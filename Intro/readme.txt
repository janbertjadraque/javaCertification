Here are the review points that we will create:

Environment:
java has JDK which is used to compile and run java applications.
JDK previously has JRE which is a runtime environment used just to run java application without the compiling engine part but storage is cheap nowadays so the compiling engine is packaged and we refer to java development environment as entirely JDK.

javac -> compiles the java classes
java -> runs java programs
jar -> java archive (more like a zip file of java compiled classes and programs)
javadoc -> used to document java classes


Classes:
The building blocks of every java program. 
Because java is an object oriented language hence we have classes which is a blueprint or specifications on what our objects will be formed like into, the state and the behavior it will have.

Classes in essence is the cookie mold and the actual cookies are the objects. In this case when we realize a class we call it instantiation and we call these instantations objects.
So because we instantiate a lot of objects from different classes we should have a means to recall them in our program and we achieve it through referencing them, through what we call a variable.

These variables are what we call object references.
Not all variables are object references but we are getting ahead here, variables can sometimes contain primitive types which we will soon discuss in another chapter.

Classes has fields and methods. The fields store the state of the objects these fields can be distinct for each of the object instantations or shared through objects of the same classes or parent classes.
We are getting ahead again about parent classes we will tackle them in another chapter. What is important here is to know that fields store the state of the object.

methods on the other hand is our behavior we can say that methods are like functions. In fact we can interchange the terms function and methods but for clarity we should always use methods.

There should only be one class per file it is good practice but we can have multiple classes in one file. There should only be one public class in a file and this class is the top level class and the same file name with the java file. If this is not followed we will have compiler error.
