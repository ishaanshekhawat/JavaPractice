package day1;

// Class names should start with uppercase letters
public class Department {

    // Array to store students belonging to the department
    private Student[] students;

    // Constructor to initialize the department with a list of students
    public Department(Student[] students) {
        this.students = students;
    }

    // Method to calculate the sum of all students' marks
    public double calculateTotalMarks() {
        double total = 0;
        for (Student s : students) {
            total += s.getMarks();
        }
        return total;
    }

    // Method to calculate the average marks across all students
    public double calculateAverageMarks() {
        if (students.length == 0) return 0; // Prevent division by zero
        return calculateTotalMarks() / students.length;
    }

    // Method to calculate overall percentage assuming each student is graded out of 100
    public double calculatePercentage() {
        return (calculateTotalMarks() / (students.length * 100)) * 100;
    }

    // Method to display a summary report of the department
    public void displayReport() {
        System.out.println("Department Report:");
        for (Student s : students) {
            System.out.println(s.toString());
        }
        System.out.println("Total Marks: " + calculateTotalMarks());
        System.out.println("Average Marks: " + calculateAverageMarks());
        System.out.println("Overall Percentage: " + calculatePercentage() + "%");
    }

    // Main method for testing
    public static void main(String[] args) {
        Student s1 = new Student("A", 1, 68);
        Student s2 = new Student("B", 2, 78);
        Student s3 = new Student("C", 3, 90);

        Student[] studentArray = {s1, s2, s3};

        Department dept = new Department(studentArray);
        dept.displayReport();
    }
}
