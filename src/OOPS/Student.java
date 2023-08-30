package OOPS;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Student {
    int id;
    String name;
    String gender;
    int age;
    String batch;
    void changeBatch(String newBatch){
        batch=newBatch;
    }
    void pauseCourse(int duration){
        batch=null;
        System.out.println("pause course");
    }
}