package main.java.com.stackroute.junit;
/*
program to check if the marks of all the students are in the range of 0 to 100
 */
public class StudentMarks {
    public String check(int stuGrades[], int numOfStudents) {
        for (int i = 0; i < numOfStudents; i++)

            if (stuGrades[i] < 0 || stuGrades[i] > 100) {
                return "Error";
            }

        return "All marks are correct";
    }
}