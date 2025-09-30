package exercise5;

import java.io.*;

public class ObjectSerialization {

    private static final String FILE_NAME = "exercise5" + File.separator + "person.ser";
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);

        ObjectSerializer serializer = new ObjectSerializer(FILE_NAME);
        serializer.serialize(person);
        Person deserialized = serializer.deserialize();

        System.out.println("Original: " + person);
        System.out.println("Deserialized: " + deserialized);
    }
}
