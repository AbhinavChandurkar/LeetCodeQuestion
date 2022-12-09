import java.util.Scanner;


/**
 * pen
 */
class Pen {
    String color;
    String type;
    public void write(){
        System.out.println("......................");
    }
    public void disp(){
        System.out.println(color);
    }
}

class student {
    String name;
    int age;
    student(String name,int age){
        this. name = name;
        this.age = age;
    }
    public void dispInfo(){
        System.out.println(name);   
        System.out.println(age);   
    }
}


public class oop {
    public static void main(String[] args) {
        // Pen p1 = new Pen();
        // p1.color = "green";
        // p1.type = "ball";

        // Pen p2 = new Pen();
        // p2.color = "black";
        // p2.type = "ball";

        // p1.write();        
        // p1.disp();
        // p2.disp();
        // p1.disp();

        student s1 = new student("abhinav",12);
        s1.dispInfo();

    }
}
