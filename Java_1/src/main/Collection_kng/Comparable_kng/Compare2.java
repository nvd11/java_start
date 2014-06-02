package Collection_kng.Comparable_kng;
import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable{
    private String name;
    private int ranking;

    public Student(String name, int ranking){
        this.name = name;
        this.ranking = ranking;
    } 

    public String toString(){
        return this.name + ":" + this.ranking;
    }

    public int compareTo(Object o){
        Student s = (Student)(o);
        return this.ranking - s.ranking;
    }
}

public class Compare2{
    public static void f(){
        ArrayList arr = new ArrayList();
        arr.add(new Student("Jack",10));
        arr.add(new Student("Bill",23));
        arr.add(new Student("Rudy",7));

        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
    } 
}


