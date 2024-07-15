package gradesystem;

import java.util.Scanner;

public class StudentGradeCalculator {

public static void main(String[] args) { Scanner scanner = new Scanner(System.in);

// Assuming we have 5 subjects, you can change this as per your need
int numSubjects = 5;
int[] marks = new int[numSubjects];

// Input marks for each subject
System.out.println("Enter marks obtained (out of 100) for each subject:");
for (int i = 0; i < numSubjects; i++) {
    System.out.print("Subject " + (i + 1) + ": ");
    marks[i] = scanner.nextInt();
}

// Calculate total marks
int totalMarks = 0;
for (int mark : marks) {
    totalMarks += mark;
}

// Calculate average percentage
double averagePercentage = (double) totalMarks / numSubjects;

// Determine grade based on average percentage
char grade;
if (averagePercentage >= 90) {
    grade = 'A';
} else if (averagePercentage >= 80) {
    grade = 'B';
} else if (averagePercentage >= 70) {
    grade = 'C';
} else if (averagePercentage >= 60) {
    grade = 'D';
} else {
    grade = 'F';
}

// Display results
System.out.println("\nResults:");
System.out.println("Total Marks: " + totalMarks);
System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
System.out.println("Grade: " + grade);

scanner.close();
} }