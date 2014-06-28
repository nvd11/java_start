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

public class ArrayList2{
    public static void main(String args[]){
        ArrayList<Student> arr = new ArrayList<Student>();
        arr.add(new Student(1,"Jack"));
        arr.add(new Student(2,"Bill"));
        //arr.add(1);
        //arr.add("Jack");

        Student st = arr.get(1);
        //Student st = (Student)arr.get(1);
        System.out.println(st);
        
    }

}
