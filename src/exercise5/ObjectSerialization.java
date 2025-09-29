package exercise5;

import java.io.*;

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

    private static Person deserializePerson() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (Person) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
