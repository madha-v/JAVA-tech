# JAVA-tech
concept of java programming language pre built functions and classes 

🔥

📌 Introduction to Java
Java is a high-level, object-oriented programming language developed by James Gosling at Sun Microsystems (now owned by Oracle).

🔹 Importance of Java
Platform-Independent → "Write Once, Run Anywhere" (WORA)

Object-Oriented → Supports concepts like classes, objects, inheritance, etc.

Secure → No pointers, automatic memory management

Multi-threaded → Can handle multiple tasks simultaneously

Robust & Portable → Strong memory management, runs on any OS

📌 Features of Java
✅ Simple & Easy → Syntax similar to C++
✅ Object-Oriented → Everything revolves around objects
✅ Platform-Independent → Runs on any OS via JVM
✅ Secure → No direct memory access
✅ Robust → Handles exceptions, memory leaks are rare
✅ Multithreading → Supports concurrent programming
✅ High Performance → JIT compiler improves execution speed

📌 Java Virtual Machine (JVM)
JVM converts Java code into machine code for execution.

🔹 Compilation & Execution Flow: 1️⃣ Java Code (.java file) → Written by programmer
2️⃣ Compiler (javac) → Converts to Bytecode (.class file)
3️⃣ JVM → Interprets Bytecode and runs on any OS

Example:

java
Copy
Edit
// Simple Java Program
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
✔ Compilation: javac HelloWorld.java
✔ Execution: java HelloWorld

📌 Keywords, Constants, Variables, and Data Types
🔹 Keywords in Java
Reserved words with special meaning (50 total). Example:
public, static, void, class, final, if, else, for, while, try, catch, this, super, etc.

🔹 Constants in Java
Fixed values that do not change (declared using final).
Example:

java
Copy
Edit
final int MAX = 100; // Constant variable
🔹 Variables in Java
Variables store data in memory.
Example:

java
Copy
Edit
int num = 10;
String name = "Anku";
🔹 Data Types
Type	Example	Size
byte	byte b = 100;	1 byte
short	short s = 500;	2 bytes
int	int x = 1000;	4 bytes
long	long l = 10000L;	8 bytes
float	float f = 3.14f;	4 bytes
double	double d = 3.1415;	8 bytes
char	char c = 'A';	2 bytes
boolean	boolean flag = true;	1 bit
📌 Operators and Expressions
Operators are used to perform operations on variables.

🔹 Types of Operators
Operator	Example	Meaning
Arithmetic	+, -, *, /, %	Basic math operations
Relational	==, !=, >, <	Comparison
Logical	&&, `	
Bitwise	&, `	, ^, <<, >>`
Assignment	=, +=, -=, *=, /=	Assign values
Example:

java
Copy
Edit
int a = 10, b = 5;
System.out.println(a + b); // Output: 15
System.out.println(a > b); // Output: true
📌 Control Statements
Used to control the flow of execution.

🔹 Conditional Statements (if-else, switch)
Example:

java
Copy
Edit
int num = 10;
if (num > 0) {
    System.out.println("Positive Number");
} else {
    System.out.println("Negative Number");
}
🔹 Loops (for, while, do-while)
Example:

java
Copy
Edit
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
📌 Wrapper Classes
Wrapper classes convert primitive types to objects.

Primitive	Wrapper Class
int	Integer
char	Character
float	Float
double	Double
boolean	Boolean
Example:

java
Copy
Edit
int a = 10;
Integer obj = a; // Autoboxing
int b = obj; // Unboxing
📌 Scanner Class (User Input)
Scanner class is used to take input from the user.

Example:

java
Copy
Edit
import java.util.Scanner;
public class InputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name);
    }
}
🔹 Common Scanner Methods:

Method	Description
next()	Reads a single word
nextLine()	Reads a full line
nextInt()	Reads an integer
nextDouble()	Reads a double value
📌 Class and Object in Java
Everything in Java revolves around Classes & Objects.

Example:

java
Copy
Edit
class Student {
    String name;
    int age;

    // Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    // Method
    void display() {
        System.out.println(name + " is " + age + " years old.");
    }

    public static void main(String[] args) {
        Student s1 = new Student("Anku", 20);
        s1.display();
    }
}
📌 Arrays in Java
Used to store multiple values.

Example:

java
Copy
Edit
int[] arr = {10, 20, 30};
System.out.println(arr[1]); // Output: 20
📌 String Handling in Java
🔹 String (Immutable)
java
Copy
Edit
String s = "Hello";
s = s + " World"; // Creates a new object
🔹 StringBuffer (Mutable)
java
Copy
Edit
StringBuffer sb = new StringBuffer("Hello");
sb.append(" World"); // Modifies the existing object
System.out.println(sb);
📌 Summary
✅ Java is Object-Oriented, Platform-Independent, and Secure.
✅ JVM executes Bytecode on any OS.
✅ String is immutable, StringBuffer is mutable.
✅ Scanner class helps take user input.
✅ Classes, Objects, and Arrays are core to Java.

