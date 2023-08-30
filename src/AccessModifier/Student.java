package AccessModifier;


import javax.swing.plaf.synth.SynthScrollBarUI;

public class Student {
    private int id;
    String name;
   protected String gender;
   public int age;
   public String batch;
   public void changeBatch(String newBatch){
        batch=newBatch;
    }
   private void pauseCourse(int duration){
        batch=null;
        System.out.println("pause course");
    }
}
