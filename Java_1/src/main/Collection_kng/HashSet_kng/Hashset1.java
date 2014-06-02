package Collection_kng.HashSet_kng;
import java.util.HashSet;

class Student{
    private int id;
    private String name;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    //overwrite
    public String toString(){
        return this.id + ":" + this.name;
    }

    //overwrite hashCode()
    public int hashCode(){
        return id * name.hashCode();
    }

    //overwrite equals()
    public boolean equals(Object o){
        Student s = (Student)o;
        return (s.id == this.id) && (s.name.equals(this.name));
    }

}

public class Hashset1{
    public static void f(){
        HashSet hs = new HashSet();
        hs.add(1);
        hs.add(2);
        hs.add(1);
        hs.add(1);

        System.out.println(hs);
        hs.clear();

        hs.add(new Student(1,"Jack"));
        hs.add(new Student(2,"Bill"));
        hs.add(new Student(1,"Jack"));
        hs.add(new Student(1,"Jack"));
        
        System.out.println(hs);
    } 
}
