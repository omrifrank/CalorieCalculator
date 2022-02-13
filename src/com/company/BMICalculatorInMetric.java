package com.company;

import javax.swing.*;
import java.util.Objects;
import java.util.Scanner;

// BMI Calculator in Java
// Uses metric units
public class BMICalculatorInMetric {

    public static void main(String[] args) throws Exception {
        calculateCalories();
    }

    private static void calculateCalories() throws Exception {
        float age;
        float height;
        float weight;
        String gender;
        float BMR;
        String exercise;


        Scanner s = new Scanner(System.in);

        System.out.println("Please enter gender( Male / Female): ");
        gender = s.nextLine();

        System.out.println("Please enter your age: ");
        age = s.nextFloat();

        System.out.print("Please enter your weight in kg: ");
        weight = s.nextFloat();

        System.out.print("Please enter your height in cm: ");
        height = s.nextFloat();

        Scanner v = new Scanner(System.in);
        System.out.println("Whats your exercise level? type nothing if theres no exercise");
        System.out.println("Type 1 if you do little exercise 1-3 times a week");
        System.out.println("type 2 if you do a moderate amount of exercise a week  3-5 times a week");
        System.out.println("type 3 if you have intense exercise 6-7 times a week ");
        System.out.println("type 4 if you have intense exercise 6-7 times a week and work a physical job");

        exercise = v.nextLine();


        BMR = 0;
        if (Objects.equals(gender, "Male")) {
            BMR = ((float) (10 * weight + (6.25 * height) - (5 * age) + 5));
        } else if (Objects.equals(gender, "Female")) {
            BMR = (float) ((10 * weight + (6.25 * height) - (5 * age) - 161));
        }

        switch (exercise) {
            case "nothing" -> System.out.println(BMR * 1);
            case "1" -> System.out.println(BMR * 1.375);
            case "2" -> System.out.println(BMR * 1.55);
            case "3" -> System.out.println(BMR * 1.725);
            case "4" -> System.out.println(BMR * 1.9);
        }


    }

}

