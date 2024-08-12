ctrl+shift+P for commmand palette
git: stash to stash changes from last commit (note it has to be in the same directory as the .git hidden files folder)
git: pop stash to return changes and remove from stash
stashes do not save changes to new/removed files?
yippee

# week 2
- if you print an object with no definition it will print the classname@hexnumber
- classes are things you make objects from
- java.lang.Object is also a class - Object() class constructs a new Object, has a bunch of methods on it. every object in Java is an instance of a class, and every class derives from the java.lang.Object class. therefore every method in java has the toString() method etc. as such, any object can be printed to console. default behaviour of toString() is class@hash.
- if you want to change the behaviour of an inherent method e.g. toString(), you should use the @Override thing to tell it we want to override it.
- the @Override method tells the compiler "i'm definitely changing the behaviour of an existing method" like a safety feature, just in case we mistype tostring() etc.
```
@Override
public String toString(){
    return "foo";
}
```

- constructors: only have to write the word once `Point3D(int x, int y, int z)`
- `this.x` refers to the attribute of the object, rather than the parameter of the constructor. though it could be smelly. maybe better to just use different parameter names.
- avoid repeating yourself
```
Point3D(int in){
    //x = in;
    //y = in;
    //z = in; 
    this(in, in, in);
}
```

- static variables are attributes that belong to a class. any object of that class will have the class's static variable, even if the object isn't instatiated. so even if you set a `static int w` to something for p4, it will also change it for p5.

 
- public is the default behaviour for everything in Java. so even if you write nothing in front of it, it will be public.
- if you change an attribute to private, then you won't be able to access it from outside the object/class itself, i.e. you need to use a method to modify that attribute. e.g. `Point3D.w = 27;` won't work anymore. making it private an only accessible using methods means that if we decide to change something like the data type (int to double), we only have to amend the method, rather than edit every single time we mention the attribute.

prac:
Canvas extends JPanel so has the paint(Graphics g) method. create a blank grid (which the constructor then makes an arraylist of cells) and call the grid's paint method. that takes each cell in the list and tells it to paint itself at its position.
getmousposition from canvas. returns a point2D (x,y). pass it all the way down to the cell when it's drawn, and check, is that point's position within the bounds of the cell? if so, then colour it.

# week 3 - class inheritance
- will always get the variable from the most local scope (if same name)
- instance scope, use `this` keyword
- `super` gets the inheritance scope
- dynamic binding - OOP languages make decisions of which methods to run at runtime if inheritance is involved (e.g. cat breathe() or mammal breathe())
- okay to call a method on a class's parent (e.g. mammal1.eat() but not animal1.breathe())
- @Override helps to say we are overriding an existing method on the parent class, to avoid typos and doubled methods
- can pass a reference variable and assign it to a variable of a higher type e.g. `Animal creature = new Cat();`
- however, cannot do the other way. but can typecast: `simon = (Cat) creature;` treat this thing as a subclass but only if it is this subclass
```
Animal creature;
Cat simon = new Cat();
creature = simon;
simon = (Cat) creature;
simon.eat();
```
- don't repeat yourself - avoid pulling code from the superclass...
- interfaces are another kind of inheritance - a way of listing behaviours/methods.
- i.e. methods (breathe, eat), not attributes (weight, age)
- e.g. `class Automobile implements Driveable` 
- if we create 2 classes that both implement the Driveable interface, we have a way of describing sets of behaviours thta apply tomultiple classes.
- only available through interfaces??
```
public interface Driveable {
    boolean startEngine();
    void stopEngine();
    float accelerate(float acc);
}
```
- by implementing an interface we are telling the complier to check these things are in the class and are the same types?
- calling the method of a Driveable d = automobile will call the method of the class.
- you can implement multiple interfaces in one class `class Automobile implements Driveable, Parkable` - need to have all th emethods defined in the Driveable interface defined in the class, plus the methods in the Parkable interface. must implement all methods to use that interface, but still okay to have extra methods unique to the class.
- no method body in interface method declaration
- can have inheritance as well as implement interfaces

- can also extend an interface
```
public interface Flyable extends Driveable {
    void fly();
}
```
`class Automobile implements Flyable` - gets methods fly() as well as Driveable methods


inner classes:
- sometimes you only need a class once/for the class that it's in, rather that creating a new class fiile
- can put the definition inside another class definition
```
Class Animal {
    Class Brain {
        ...
    }
}
```
- probably avoid using inner classes if you're unclear as to if you should use one

polymorphism:
- The most common use of polymorphism in OOP occurs when a parent class (`Animal`) reference `a` is used to refer to a child class (`Deer`) object `d`. 
- compile-time polymorphism - static polymorphism, multiple methods with the same name but different parameters
- runtime polymorphism - dynamic method dispatch, implemented by method overriding
- An overridden method is essentially hidden in the parent class, and is not invoked unless the child class uses the super keyword within the overriding method.
- virtual method invocation - if a subclass has the same method defined as a parent method, and we say `Employee e = new Salaryman();` and call `e.getSalary();`, it will call `getSalary()` for the Employee class at compile time, but then at run time the JVM will run it for the Salaryman class. therefore, an overridden method is always invoked at runtime, no matter the data type of the reference

# week 4
ArrayLists:
- take Objects/wrapper classes, not types (Integer not int, Character not char) for every primitive type there is a wrapper class for it. except for arrays - ArrayLists
- in Java, String is a primitive type, but like a built in arraylist of chars
Generics:
- class and method definitions that include parameters for types - allows to write code that applies to any class
- e.g. define a class for a list of items of type T, where T is a type parameter. then 