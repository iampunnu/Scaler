package AccessModifier;

import java.util.ArrayList;
import java.util.List;

public class ShallowCopy {
    String name;
    Integer age;
    List<String> batch=new ArrayList<>();
    public ShallowCopy(){}


    @Override
    public String toString() {
        return "ShallowCopy{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", batch=" + batch +
                '}';
    }

    public ShallowCopy(ShallowCopy s){
        this.age=s.age;
        this.name=s.name;
        this.batch=s.batch;
    }
}
