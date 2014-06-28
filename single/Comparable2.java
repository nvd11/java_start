import java.lang.Comparable;

class Student implements Comparable<Student>{
    int id;
    private String name;
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return this.id + ": " + this.name;
    }

    public int compareTo(Student s){
        return this.id - s.id;
    } 
}

public class Comparable2{
    public static void main(String args[]){
        Student jack = new Student(1,"Jack");
        Student bill= new Student(2,"Bill");

        System.out.println(bill.compareTo(jack));
        //System.out.println(bill.compareTo("jack")); compile error
    }
}
