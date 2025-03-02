public class constructor {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "ganesh";
        s1.roll = 15;
        s1.password = "ganesh";

        // Using the copy constructor
        student s2 = new student(s1);
    }
}

class student {
    String name;
    int roll;
    String password;

    // Copy Constructor
    student(student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
        this.password = s1.password;
    }

    // Default Constructor
    student() {
        System.out.println("Constructor is called");
    }

    // Parameterized Constructors
    student(String name) {
        this.name = name;
    }

    student(int roll) {
        this.roll = roll;
    }

    student(String password, boolean isPassword) { // Added a boolean flag to differentiate
        this.password = password;
    }
}
