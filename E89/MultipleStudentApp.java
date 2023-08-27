package E89;

import java.util.Scanner;

public class MultipleStudentApp {
    static  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter the number of students: ");
        int numbersOfStudents = scanner.nextInt();
        scanner.nextLine();

        String[] studentNames = new String[numbersOfStudents];
        for (int i = 0; i < numbersOfStudents; i++){
            System.out.println("Enter the name of students ( " + (i+1) + " ): ");
            studentNames[i] = scanner.nextLine();
        }

        for (int i = 0; i < numbersOfStudents; i++){
            System.out.println("Calculating final scores of students :" + studentNames[i]);
            int finalScore = calculatedFinalScore();
            System.out.println( studentNames[i] + "'s final score: " + finalScore);
        }
    }

    public static int calculatedFinalScore() {
        System.out.print("Enter the number of quizzes: ");
        int numberOfQuizzes = scanner.nextInt();

        int totalScore = 0;
        for (int i = 0; i < numberOfQuizzes; i++) {
            System.out.print("Enter the score for quiz " + (i+1) + ": ");
            totalScore = totalScore + scanner.nextInt();
        }

        return totalScore;
    }
        }

