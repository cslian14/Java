import java.util.Scanner;

public class UseCourse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter course information:");
        System.out.print("Department: ");
        String department = scanner.nextLine();
        System.out.print("Course Number: ");
        int courseNumber = scanner.nextInt();
        System.out.print("Credits: ");
        int credits = scanner.nextInt();

        scanner.close();

        CollegeCourse course;
        if (department.equals("BIO") || department.equals("CHM") || department.equals("CIS") || department.equals("PHY")) {
            course = new LabCourse(department, courseNumber, credits);
        } else {
            course = new CollegeCourse(department, courseNumber, credits);
        }

        course.display();
    }
}