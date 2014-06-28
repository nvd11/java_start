package Collection_kng.HashMap_kng;
import  java.util.HashMap;
import  java.util.Set;
import  java.util.Iterator;

class Student{
    int id;
    private String name;
    public Student(int id, String name){
        this.id =  id;
        this.name = name;
    }

    public String toString(){
        return this.id + ": " + this.name;
    }
}

public class HashMap1{
    public static void f(){
        HashMap hm = new HashMap();
        Student st = new Student(1,"Jack");
        hm.put(st.id, st);
        
        st = new Student(2,"Bill");
        hm.put(st.id, st);

        st = new Student(3,"Carlos");
        hm.put(st.id, st);

        st = new Student(4,"Alice");
        hm.put(st.id, st);

        System.out.println(hm.get(4));

        //get the HashSet of keys
        Set keyset = hm.keySet();

        Iterator it = keyset.iterator();
        while(it.hasNext()){
            st = (Student)hm.get(it.next());    
            System.out.println(st);
        }

    }
}

