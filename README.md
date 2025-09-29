# 1.5-Java-Utils-Level1

## 📄 Description – Exercise Statement

This project contains the solution to the following Java exercises:

### Exercise 1
Create a class that lists alphabetically the contents of a directory received as a parameter.

#### ✅ What was implemented
- `DirectoryLister`:
  - Validates that the directory exists and is valid.
  - Prints the directory contents alphabetically.
  - Handles the case of empty or invalid directories.

### Exercise 2
Extend the previous class to list a **directory tree recursively**, including all subdirectories.  
For each entry, print:
- Whether it is a directory `(D)` or a file `(F)`.
- The last modified date.

#### ✅ What was implemented
- `RecursiveDirectoryLister`:
  - Traverses all subdirectories recursively.
  - Sorts contents alphabetically within each directory.
  - Shows indentation for each level of depth.
  - Prints the last modified timestamp for each entry.

### Exercise 3
Modify the previous class so that the result is saved in a **TXT file** instead of being displayed on the console.

#### ✅ What was implemented
- `RecursiveDirectoryListerToFile`:
  - Writes the directory tree structure to an `output.txt` file.
  - Uses a global constant to configure the output file path.
  - Maintains alphabetical ordering and recursion as in Exercise 2.

### Exercise 4
Add the functionality to **read any TXT file** and print its contents to the console.

#### ✅ What was implemented
- `TxtFileReader`:
  - Reads a `.txt` file line by line with `BufferedReader`.
  - Validates that the file exists and is not empty.
  - Prints its content to the console.

### Exercise 5
Serialize a Java object into a `.ser` file and then deserialize it back.

#### ✅ What was implemented
- `Person` class:
  - Implements `Serializable`.
  - Contains fields `name` and `age`.
- `ObjectSerialization`:
  - Serializes a `Person` object into `person.ser`.
  - Deserializes the file back into a `Person` instance.
  - Demonstrates that original and deserialized objects match.

## 💻 Technologies Used
- Java 17  
- IntelliJ IDEA  
- Git & GitHub  

---

## 📋 Requirements
- JDK 17 or higher installed  
- IntelliJ IDEA (or any Java-compatible IDE)  
- Git  

---

## 🛠️ Installation
Clone the repository and access the project folder:

```sh
git clone https://github.com/leilaweicman/1.5-Java-Utils-Level1.git
cd 1.5-Java-Utils-Level1
```

---

## ▶️ Execution

### Exercise 1

```sh
javac exercise1/DirectoryLister.java
java exercise1.DirectoryLister <directoryPath>
```

### Exercise 2

```sh
javac exercise2/RecursiveDirectoryLister.java
java exercise2.RecursiveDirectoryLister <directoryPath>
```

### Exercise 3

```sh
javac exercise3/RecursiveDirectoryListerToFile.java
java exercise3.RecursiveDirectoryListerToFile <directoryPath>
# Output saved in exercise3/output.txt
```

### Exercise 4

```sh
javac exercise4/TxtFileReader.java
java exercise4.TxtFileReader <filePath>
```

### Exercise 5

```sh
javac exercise5/Person.java exercise5/ObjectSerialization.java
java exercise5.ObjectSerialization
```
---

## 🌐 Deployment
Not applicable (local practice project).


---

## 🤝 Contributions

1. Fork this repository.
2. Create a new branch:
```sh
git checkout -b feature/NewFeature
```
3. Commit your changes:
```sh
git commit -m "Add NewFeature"
```
4. Commit your changes:
```sh
git push origin feature/NewFeature
```
5. Open a Pull Request.
