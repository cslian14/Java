public class LabCourse extends CollegeCourse {
    private static final double LAB_FEE = 50;

    public LabCourse(String department, int courseNumber, int credits) {
        super(department, courseNumber, credits, 120 * credits + LAB_FEE); 
    }

    @Override
    public void display() {
        super.display();
        System.out.println("This course is a lab course.");
    }
}