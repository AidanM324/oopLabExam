package org.example;


import java.util.Scanner;
public class ShiftWorker {
    private String name;
    private String gender;
    private int userShift;
    private int age;

    public ShiftWorker() {
        this.name = "";
        this.gender = "";
        this.userShift = 0;
        this.age = 0;
    }

    public ShiftWorker(String name, String gender, int userShift, int age) {
        this.name = name;
        this.gender = gender;
        this.userShift = userShift;
        this.age = age;
    }

    public void getUserInput() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Name: ");
        this.name = scanner.nextLine();

        System.out.println("Enter Gender: ");
        this.gender = scanner.nextLine();

        try {
            System.out.println("Enter Shift : ");
            String input = scanner.nextLine();

            this.userShift = Integer.parseInt(input);

            if (userShift == 1 || userShift == 2) {
                System.out.println("you Entered : " + userShift);

            } else {
                System.out.println("Not a valid number");
            }

        } catch (Exception e) {
            System.out.println("Not a valid number.");
        }
        try {
            System.out.println("Enter Age : ");
            String input2 = scanner.nextLine();

            this.age = Integer.parseInt(input2);

            if (age < 18) {
                System.out.println("Invalid Age Error.");

            } else {
                System.out.println("Cleared");
            }
        } catch (NumberFormatException e) {
            System.out.println("Not a valid number.");
        }


    }

    public void displayInfo() {
        System.out.println("Name: " + name + " " + ", Gender: " + gender + " " + ", Shift Chosen: " + userShift + " " + ", Age: " + age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getUserShift() {
        return userShift;
    }

    public void setUserShift(int userShift) {
        this.userShift = userShift;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

