package arrayDemo;

import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {

    /* Set is an Interface. Hashset is a class. Hashset implements Set.
    Hashset cannot hold duplicate value. it always hold unique value.
    Hashset does not follow insertion order.
    Null Value ===Research
    */


    public void hashSetDemo(){
        Set<String> students = new HashSet<>();

        boolean isEmptyBeforeAdd = students.isEmpty();
        System.out.println("Empty Before adding elements" + isEmptyBeforeAdd);


        int sizeBeforeAdd = students.size();
        System.out.println("Size before add" + sizeBeforeAdd);

        students.add("Arafat");
        students.add("Jobayda");
        students.add("Sarita");
        students.add("Majed");
        students.add("Suriya");
        students.add("Arafat");

        System.out.println(students);

    }

    public static void main(String[] args) {
        HashSetPractice obj = new HashSetPractice();
        obj.hashSetDemo();
    }
}
