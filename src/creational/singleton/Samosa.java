package creational.singleton;

/**

1. Constructor has to be private
2. Make a static method to provide object
3. Create field to store the object
4. How to break Singleton Pattern ?? --> Making new constructor and creating object through it
5. How to make the code unbreakable singleton pattern ?? --> (Use Reflection API) Make constructor changes or make enum class with only INSTANCE variable
6. How to break singleton pattern using Serialization ? ---> First serialize then deserialize object
7. How to protect singleton pattern from serialization breaking process ? -- > Implement method  readObject()
8. How to stop cloning different object ? -- > Overriding clone method and return same object as it was initialized first.


 **/


import java.io.Serializable;

/**
 // If we want to make samosa class unbreakable singleton pattern then do the following

 public enum Samosa{
    INSTANCE
 }

 */



public class Samosa  implements Serializable, Cloneable {

    private static Samosa samosa;

      // Generic Constructor

     private Samosa() {

     }


/**
//    Reflection API : To make The singleton pattern unbreakable make the following changes to constructor.
                       If the object is already created then throw an Exception

 private Samosa() {
        if (samosa != null) {
            throw new RuntimeException("You are trying to break the singleton Pattern");
        }
    }
**/

    public static Samosa getSamosa() {
        if (samosa == null) {
            samosa = new Samosa();
        }
        return samosa;
    }


    /**

     //Thread safe getSamosa

     public static Samosa getSamosa(){
     if(samosa==null){
     synchronized (Samosa.class){
     samosa = new Samosa();
     }
     }
     return samosa;
     }
     **/

/**
 *
 * In case we want to stop multiple object creation using serialization process
 *
    public Object readResolve(){
        return samosa;
    }
**/

@Override
    public Object clone() throws CloneNotSupportedException {
//    return super.clone();

    // In case we want to stop cloning
     return samosa ;
}

}
