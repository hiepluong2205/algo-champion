package io.github.hiepluong2205.fhda.cis35a;
/*
Lab 2a -
You must use arrays, static methods, loops and decision making constructs. Please put each part in its own project.
Total points - 30.

Part 2
Your instructor has asked you to write a program that grades an exam. The exam has 15 multiple choice questions. Here are the correct answers:

{"B", "D", "A", "A", "C", "D", "A", "B", "C", "A", "B", "C", "D", "A", "B"}

A student must correctly answer 12 out of the 15 questions to pass the exam.
Write a program that holds the correct answers to the exam in an array. The program should have an array that hold's the student's answers.
The program should have the following static methods:
a. passed() returns true if the student passed the exam or false if the student failed.
b. totalCorrect() - Return the total number of correctly answered questions.
c. totalIncorrect() - Returns the total number of incorrectly answered questions.
d. An int array containing the questions numbers of the questions that the student missed.
//which questions were either not answered or were incorrect.
//declaring a char array that keeps track of the questions that were incorrectly answered.

Demonstrate the program by setting the values of student's answers in main(You are not required to prompt the user to enter values using Scanner or System.in.read()),
and then display the result returned from the methods written in the program.
*/

public class ExamGrader {
    private static final String[] arrAnswers = {"B", "D", "A", "A", "C", "D", "A", "B", "C", "A", "B", "C", "D", "A", "B"};
    char[] correctAns = new char[15];
    char[] studentAns = new char[15];

    static boolean hasPassed(char[] correct, char[] student) {
        return true;
    }

    static int totalCorrectAnswers(char[] correct, char[] student) {
        return 0;
    }

    static int totalInCorrectAnswers(char[] correct, char[] student) {
        return 0;
    }

    static int[] questionNumbersMissed(char[] correct, char[] student) {
        return new int[]{};
    }
}