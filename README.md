# Sp-Dagger2
Documentation of Dagger 2 in Android Application

**Dependency Injection** in build upon the concept of Inversion of Control. Which says that a class should get its dependencies from outside. In simple words, no class should instantiate another class but should get the instances from a configuration class.

If a java class creates an instance of another class via the new operator, then it cannot be used and tested independently from that class and is called a hard dependency.


**Mode of Injection:**
Constructor Injection: Injecting the method parameters.
Field Injection: Injecting the member variable (must not be private).
Method Injection: Injecting the method parameter.
Order of dependency injection according to JSR330

- Constructor
- Field
- Method

**Notes:**
The order in which the methods or fields annotated with @Inject are called is not defined by JSR330. You cannot assume that the methods or fields are called in the order of their declaration in the class.
As fields and method parameters are injected after the constructor is called, you cannot use injected member variables in the constructor.


### Advantage Of Dagger2
- increases the possibility of reusing the class and to be able to test them independent of other classes
- create a class that is not a specific implementation of a business logic.

### Dagger2 Components and its use 
- **Module :** Used on classes which contains methods annotated with @Provides.
- **Component :** Used on an interface. This interface is used by Dagger 2 to generate code which uses the modules to fulfill the requested dependencies. Enable selected modules and used for performing dependency injection
- **Subcomponent :**
- **Provide :** Can be used on methods in classes annotated with @Module and is used for methods which provides objects for dependencies injection. define classes and methods which provide dependencies.
- **Scope :** This mechanism takes responsibility of making and keeping a single instance of required class while corresponding Scope exists.
- **Inject :** request dependencies. Can be used on a constructor, a field, or a method
- **Singleton :**  Single instance of this provided object is created and shared.
- **ChatScope :**  for chat objects.
- **ChatScreenScope :**  for particular chat screen objects.
- **Qualifier :** annotation is provided by javax inject package and is used to qualify the dependency. For example, a class can ask both, an Application Context and an Activity Context. But both these Objects will be of type Context. So, for Dagger2 to figure out which variable is to be provided with what, we have to explicitly specify the identifier for it.
- **Named :** annotation provided by Dagger2.@Named itself is annotated with @Qualifier. With @Named we have to provide string identifier for similar class objects and this identifier is used to map the dependency of a class. We will explore the @Named at the end of this example. 


**Dependency provider:** Classes annotated with @Module are responsible for providing objects which can be injected. Such classes define methods annotated with @Provides. The returned objects from these methods are available for dependency injection.
**Dependency consumer:** The @Inject annotation is used to define a dependency.
Connecting consumer and producer: A @Component annotated interface defines the connection between the provider of objects (modules) and the objects which express a dependency. The class for this connection is generated by the Dagger.

**Limitations of Dagger2:**

Dagger2 does not inject fields automatically.
It cannot inject private fields.
If you want to use field injection you have to define a method in your @Component annotated interface which takes the instance of the class into which you want to inject the member variable.

