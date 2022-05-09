/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public String calc_grades() {
        Scanner sc = new Scanner(System.in);
        String grade = "";
        int count = 0, points = 0;
        float gpa = 0;
        double total = 0;
        System.out.println("plz enter you grade");
        while (points != -1) {   //we need to use while loop until it is -1
            points = sc.nextInt();
            if (points >= 0) {
                if (points > 100) {
                    System.out.println("Invalid grade");
                    return "Invalid Grade";
                } else if (points >= 95) {
                    System.out.println("A");
                    grade += "A ";
                    gpa += 1.0;
                    //return "A";
                } else if (points >= 90) {
                    System.out.println("A");
                    grade += "A ";
                    gpa += 1.3;
                    //return "A";
                } else if (points >= 85) {
                    System.out.println("B");
                    grade += "B ";
                    gpa += 1.7;
                    //return "B";
                } else if (points >= 80) {
                    System.out.println("B");
                    grade += "B ";
                    gpa += 2.0;
                    //return "B";
                } else if (points >= 75) {
                    System.out.println("B");
                    grade += "B ";
                    gpa += 2.3;
                    //return "B";
                } else if (points >= 70) {
                    System.out.println("C");
                    grade += "C ";
                    gpa += 2.7;
                    //return "C";
                } else if (points >= 65) {
                    System.out.println("C");
                    grade += "C ";
                    gpa += 3.0;
                    //return "C";
                } else if (points >= 60) {
                    System.out.println("C");
                    grade += "C ";
                    gpa += 3.3;
                    //return "C";
                } else if (points >= 55) {
                    System.out.println("D");
                    grade += "D ";
                    gpa += 3.7;
                    //return "D";
                } else if (points >= 50) {
                    System.out.println("D");
                    grade += "D ";
                    gpa += 4;
                    //return "D";
                } else if (points >= 0) {
                    System.out.println("F");
                    grade += "F ";
                    gpa += 5;
                    //return "F";
                }

                total += points;
                count++;

            } else if (points < -1) {
                System.out.println("Invalid Grade");
                return "Invalid Grade";
            }
        }
        System.out.println("Your Grades is " + grade);
        System.out.println("Your Average is " + total / count + " points");
        System.out.println("Your Average GPA is " + gpa / count);
        if (total / count >= 90) {
            return "A";
        } else if (total / count >= 75) {
            return "B";
        } else if (total / count >= 60) {
            return "C";
        } else if (total / count >= 50) {
            return "D";
        } else {
            return "F";
        }
        //return grade;

    }

    public static void main(String[] args) {
        //String x = calc_grades();
        //System.out.println(x);
    }

}
