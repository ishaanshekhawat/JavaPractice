package day1;

public class studentClass {

    private String name;
    private int rollno;
    private int totalMarks;
    static int count = 0;

    public studentClass() {
        this("AVIRAM", 0, 99);
    }

    public studentClass(String name, int rollno, int totalMarks) {
        this.name = name;
        this.rollno = ++count; // auto-increment roll number
        this.totalMarks = totalMarks;
    }

    public int getMarks() {
        return totalMarks;
    }

    public String toString() {
        return "Student name: " + name + ", Roll No: " + rollno + ", Marks: " + totalMarks;
    }
}
