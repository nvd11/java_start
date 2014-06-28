import java.util.ArrayList;

class Student{
    int id;
    private String name;
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return this.id + ": " + this.name;
    }
}

public class ArrayList1{
    public static void main(String args[]){
        ArrayList arr = new ArrayList();
        arr.add(new Student(1,"Jack"));
        arr.add(new Student(2,"Bill"));
        arr.add(1);
        arr.add("Jack");

        //Student st = arr.get(2); error
        Student st = (Student)arr.get(1);
        System.out.println(st);
        
    }

}
