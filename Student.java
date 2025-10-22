package day1;

// Class names should start with an uppercase letter
public class Student {

    // Instance variables to store student details
    private String name;
    private int rollNo;
    private int totalMarks;

    // Static variable to keep track of the number of students created
    private static int count = 0;

    // Default constructor assigns default values
    public Student() {
        this("AVIRAM", 0, 99);
    }

    // Parameterized constructor to initialize a student
    public Student(String name, int rollNo, int totalMarks) {
        this.name = name;
        this.rollNo = ++count; // Automatically increment roll number for each new student
        this.totalMarks = totalMarks;
    }

    // Getter method for marks
    public int getMarks() {
        return totalMarks;
    }

    // Override toString() method to provide readable student info
    @Override
    public String toString() {
        return "Student name: " + name + ", Roll No: " + rollNo + ", Marks: " + totalMarks;
    }
}
