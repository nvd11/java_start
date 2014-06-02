package Collection_kng.Iterator_kng;
import java.util.HashSet;
import java.util.Iterator;


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


public class Iterator1{
    public static void f(){
        HashSet hs = new HashSet();
        hs.add(new Student(1,"Jack"));
        hs.add(new Student(2,"Bill"));
        hs.add(new Student(3,"Alice"));
        hs.add(new Student(4,"Cici"));

        Student st;
        Iterator it = hs.iterator();  //Poly
        while (it.hasNext()){
            st = (Student)(it.next());
            System.out.println(st);
        } 
    }

}
