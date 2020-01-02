# DAGGER2 IN DETAILS
  
https://codinginflow.com/tutorials/android/dagger-2/part-2-component-provision-method-constructor-injection  
  
Follow One by one Video in this  
https://www.youtube.com/watch?v=ZZ_qek0hGkM  
  
Dagger is nothing but the dependency injection. Lets take a look into Dependency Injection  
Lets understand what is Dependency. In Programming Dependency means One class depands on another class.  
  
Lets Object of class A has an reference of Object of class B, then Class A have dependency on Class B.Class A needs class B to   
perform its action  
  
In this example Class User depends on Class Address, because user contains a field named Address.  
  
In image Loader classes like Picaso, Glide depends on Http Client to load image, So here Picaso, Glide have dependency on  
Http Client To load Image   
  
In Object oriented programming there is lots of dependency injection. Because each class have a set of responsibility to  
to perform its action, for that it depand on outer classes. Injection is nothing but passing these dependencies from outside  
of the class.  
  
The Idea here is that classes should not responsible to create their own dependencies. Instead these dependencies should be  
created somewhere else and passed to the class who need the dependencies classes.  
