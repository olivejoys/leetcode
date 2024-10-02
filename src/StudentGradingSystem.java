import java.util.Scanner;

public class StudentGradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score;
        char grade; // Changed from int to char

        System.out.println("Student Grading System");

        while (true) {
            System.out.println("Enter your score (0-100) or a negative number to stop: ");
            score = sc.nextInt();

            if (score < 0) {
                System.out.println("Program terminated.");
                break; // Exit the loop if score is negative
            }

            // Grading
            if (score >= 90) {
                grade = 'A';
            } else if (score >= 80) {
                grade = 'B';
            } else if (score >= 70) {
                grade = 'C';
            } else if (score >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            // Feedback using switch
            switch (grade) {
                case 'A':
                    System.out.println("Feedback: You've done an excellent job!");
                    break;
                case 'B':
                    System.out.println("Feedback: You've done a good job!");
                    break;
                case 'C':
                    System.out.println("Feedback: You passed.");
                    break;
                case 'D':
                    System.out.println("Feedback: Needs improvement.");
                    break;
                case 'F':
                    System.out.println("Feedback: Failure. Please try again.");
                    break;
                default:
                    System.out.println("Invalid grade.");
                    break;
            }
        }

        sc.close(); // Close the scanner after the loop
    }
}
