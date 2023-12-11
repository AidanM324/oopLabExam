package ie.atu;


import java.util.Scanner;
public class ShiftWorker {
    private String name;
    private String gender;
    private int userShift;
    private int age;

    public ShiftWorker{
        this.name="";
        this.gender="";
        this.userShift=0;
        this.age=0;
    }

    public ShiftWorker(String name, String gender, int userShift, int age){
        this.name=name;
        this.gender=gender;
        this.userShift=userShift;
        this.age=age;
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
