package org.example;

public class ShiftWorkerApp {
    public static void main(String[] args) {
        ShiftWorker myShiftWorker1 = new ShiftWorker();
        ShiftWorker myShiftWorker2 = new ShiftWorker("aidan", "male", 6, 9);

        myShiftWorker1.getUserInput();


        myShiftWorker1.setName("aidan");
        myShiftWorker1.setGender("male");
        myShiftWorker1.setUserShift(3);
        myShiftWorker1.setAge(9);

        myShiftWorker1.displayInfo();

       // System.out.println("Name: " + myShiftWorker1.setName() + "gender: " + myShiftWorker1.setGender() + "Shift Chosen: " + myShiftWorker1.setUserShift() + "age: " + myShiftWorker1.setAge());
        System.out.println(myShiftWorker2.toString());


    }
}
