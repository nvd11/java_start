package Array_kng;

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

public class Array2{
    public static void f(){
        Student[] sArr = new Student[3];
        sArr[0] = new Student(1,"Jack");
        sArr[1] = new Student(2,"Bill");
        sArr[2] = new Student(3,"Cindy");

        showArr(sArr);
    }

    public static void showArr(Object[] a){
        int i;
        for (i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
}
