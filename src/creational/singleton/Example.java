package creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Example {

    public static void main(String[] args) throws Exception, CloneNotSupportedException {

        System.out.println("Printing two separate object hashcode. Same hashcode means same object is used");

        System.out.println("\nSamosa Objects:  (Using Lazy way of creating) ");
        Samosa samosa = Samosa.getSamosa();
        System.out.println(samosa.hashCode());
        Samosa samosa1 = Samosa.getSamosa();
        System.out.println(samosa1.hashCode());


        System.out.println("\nJalebi Objects:  (Using Eager way of creating)");
        Jalebi jalebi = Jalebi.getJalebi();
        System.out.println(jalebi.hashCode());
        Jalebi jalebi1 = Jalebi.getJalebi();
        System.out.println(jalebi1.hashCode());

        // Breaking singleton Pattern

        Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Samosa samosa2 = constructor.newInstance();
        System.out.println("\nAfter breaking singleton pattern of Samosa Class");
        System.out.println(samosa2.hashCode());


        // In case we are using Deserialization
        System.out.println("Using Serialization and deserialization");

        Samosa samosa3 = Samosa.getSamosa();
        System.out.println(samosa3.hashCode());
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
        oos.writeObject(samosa);
        System.out.println("Serialization Done");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
        Samosa samosa4 = (Samosa) ois.readObject();
        System.out.println(samosa4.hashCode());

        System.out.println("Object creation using clone method");

        Samosa samosa5 = (Samosa) samosa.clone();
        System.out.println(samosa5.hashCode());


    }
}
