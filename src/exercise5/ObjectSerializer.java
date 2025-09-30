package exercise5;

import java.io.*;

public class ObjectSerializer {
    private final String fileName;

    public ObjectSerializer(String fileName) {
        this.fileName = fileName;
    }

    public void serialize(Person person) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(person);
            System.out.println("Person serialized to " + fileName);
        } catch (IOException e) {
            System.out.println("Error during serialization: " + e.getMessage());
        }
    }

    public Person deserialize() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Person) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        }
        return null;
    }
}
