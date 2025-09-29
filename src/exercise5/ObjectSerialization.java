package exercise5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectSerialization {

    private static final String FILE_NAME = "exercise5" + File.separator + "person.ser";
    public static void main(String[] args) {

    }

    private static void serializePerson(Person person) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(person);
            System.out.println("Person serialized to " + FILE_NAME);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
