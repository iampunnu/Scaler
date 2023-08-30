package AccessModifier;

public class Client {
    public static void main(String args[]){
  //  Student st=new Student();
        ShallowCopy shallowCopy=new ShallowCopy();
        shallowCopy.name="praveen";
        shallowCopy.age=24;
        shallowCopy.batch.add("parveen");
        shallowCopy.batch.add("ram");
        shallowCopy.batch.add("shayam");
        ShallowCopy shallowCopy1=new ShallowCopy(shallowCopy);
        System.out.println(shallowCopy.name.hashCode()+" "+shallowCopy1.name.hashCode());


        System.out.println(shallowCopy.toString());
        System.out.println(shallowCopy1.toString());
        shallowCopy.name="shayam";
        shallowCopy1.batch.add("rahul");
        shallowCopy1.batch.remove(1);
        shallowCopy1.age=34;
        System.out.println(shallowCopy.toString());
        System.out.println(shallowCopy1.toString());
        System.out.println(shallowCopy.name.hashCode()+" "+shallowCopy1.name.hashCode());
        System.out.println(shallowCopy.batch.hashCode()+" "+shallowCopy1.batch.hashCode());

    }
}
