package day1;

public class dept {

    private studentClass[] students;

    public dept(studentClass[] students) {
        this.students = students;
    }

    public double calculateTotalMarks() {
        double total = 0;
        for (studentClass s : students) {
            total += s.getMarks();
        }
        return total;
    }

    public double calculateAverageMarks() {
        if (students.length == 0) return 0;
        return calculateTotalMarks() / students.length;
    }

    public double calculatePercentage() {
        // Assuming each student is graded out of 100
        return (calculateTotalMarks() / (students.length * 100)) * 100;
    }

    public void displayReport() {
        System.out.println("Department Report:");
        for (studentClass s : students) {
            System.out.println(s.toString());
        }
        System.out.println("Total Marks: " + calculateTotalMarks());
        System.out.println("Average Marks: " + calculateAverageMarks());
        System.out.println("Overall Percentage: " + calculatePercentage() + "%");
    }

    public static void main(String[] args) {
        studentClass s1 = new studentClass("A", 1, 68);
        studentClass s2 = new studentClass("B", 2, 78);
        studentClass s3 = new studentClass("C", 3, 90);

        studentClass[] studentArray = {s1, s2, s3};

        dept dept = new dept(studentArray);
        dept.displayReport();
    }
}
