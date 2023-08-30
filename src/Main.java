import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student s1=new Student("ravi",1);
        Student s2=new Student("shavi",5);
        Student s3=new Student("tinku",3);
        Student s4=new Student("minku",19);
        Student s5=new Student("pinku",13);

        Collection<Student> students=new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        System.out.println(students.toString());
        Collections.sort((ArrayList)students,new SortById());
        System.out.println(students.toString());

        String s="my name is %s i am from %s \n" +"   i am a software engineer %s";
        s=String.format(s,"praveen","dehma","");
        System.out.println(s);



    }

    public static int compare(Student a, Student b)
    {
        return a.id - b.id;
    }
}