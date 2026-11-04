import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int subjects = 5;
        int[] marks = new int[subjects];

        int total = 0;
        double average;
        boolean passed = true;

        System.out.println("================================");
        System.out.println("     STUDENT GRADE CALCULATOR");
        System.out.println("================================");

        // Input marks
        for (int i = 0; i < subjects; i++) {

            System.out.print("Enter marks for Subject "
                    + (i + 1) + " (0-100): ");

            marks[i] = sc.nextInt();

            while (marks[i] < 0 || marks[i] > 100) {

                System.out.println("Invalid marks! Enter between 0 and 100.");

                System.out.print("Enter marks again: ");
                marks[i] = sc.nextInt();
            }

            total += marks[i];

            if (marks[i] < 33) {
                passed = false;
            }
        }

        // Calculate average
        average = (double) total / subjects;

        // Display results
        System.out.println("\n========== RESULT ==========");

        System.out.println("Total Marks: " + total + "/500");

        System.out.println("Average Percentage: "
                + average + "%");

        // Grade calculation
        String grade;

        if (!passed) {
            grade = "F";
        }
        else if (average >= 90) {
            grade = "A+";
        }
        else if (average >= 80) {
            grade = "A";
        }
        else if (average >= 70) {
            grade = "B";
        }
        else if (average >= 60) {
            grade = "C";
        }
        else if (average >= 50) {
            grade = "D";
        }
        else {
            grade = "E";
        }

        System.out.println("Grade: " + grade);

        if (passed) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }

        System.out.println("============================");

        sc.close();
    }
}
