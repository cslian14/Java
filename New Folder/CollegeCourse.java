public class CollegeCourse {
    private String department;
    private int courseNumber;
    private int credits;
    private double fee;

    public CollegeCourse(String department, int courseNumber, int credits) {
        this.department = department;
        this.courseNumber = courseNumber;
        this.credits = credits;
        this.fee = 120 * credits;
    }

    public void display() {
        System.out.println("Course Information:");
        System.out.println("Department: " + department);
        System.out.println("Course Number: " + courseNumber);
        System.out.println("Credits: " + credits);
        System.out.println("Fee: $" + fee);
    }
}