package bmi;

import java.util.Scanner;

public class bmi {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
System.out.println("Input weight in kilogram: ");
      double weight = sc.nextDouble();
      System.out.println("\nInput height in meters: ");
      double height = sc.nextDouble();
      double BMI = weight / (height * height);
      System.out.println("The Body Mass Index (BMI) is " + BMI + " kg/m2");

}    
}