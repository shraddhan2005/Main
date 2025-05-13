import java.util.ArrayList;
import java.util.List;

// Class to represent a Course
class Course {
    private String courseName;
    private int marks;

    public Course(String courseName, int marks) {
        this.courseName = courseName;
        this.marks = marks;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getMarks() {
        return marks;
    }
}

// Class to represent a Student
class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Add a course to the student's list
    public void addCourse(Course course) {
        courses.add(course);
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    // Display all course marks
    public void displayCourseMarks() {
        System.out.println("Marks for " + name + ":");
        for (Course course : courses) {
            System.out.println(course.getCourseName() + ": " + course.getMarks());
        }
    }

    // Display courses where marks are below 40
    public void displayCoursesWithLowMarks() {
        System.out.println("Courses where " + name + " scored less than 40:");
        for (Course course : courses) {
            if (course.getMarks() < 40) {
                System.out.println(course.getCourseName() + ": " + course.getMarks());
            }
        }
    }
}

// Main class to test the functionality
public class Main {
    public static void main(String[] args) {
        // Create a student
        Student student = new Student("Alice");

        // Add courses and marks
        student.addCourse(new Course("Math", 85));
        student.addCourse(new Course("Physics", 38));
        student.addCourse(new Course("Chemistry", 75));
        student.addCourse(new Course("Biology", 33));

        // Retrieve student name and registered courses
        System.out.println("Student Name: " + student.getName());
        System.out.println("Registered Courses:");
        for (Course c : student.getCourses()) {
            System.out.println("- " + c.getCourseName());
        }

        // Retrieve marks for each course
        student.displayCourseMarks();

        // Show courses with marks less than 40
        student.displayCoursesWithLowMarks();
    }
}
