package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

    /*
    List is an Interface, Arraylist is a class, Arraylist implements List.
     Arraylist Allows/hold duplicate values
     Array is static whereas Arraylist is dynamic
     */

    public void ListPractice() {

        List<String> students = new ArrayList<>();

        students.add("Arafat");
        students.add("Jobayda");
        students.add("Sarita");
        students.add("Majed");
        students.add("Suriya");
        students.add("Arafat");


        boolean isEmptyBeforeAdd = students.isEmpty();
        System.out.println("Empty Before adding elements " + isEmptyBeforeAdd);


        int sizeBeforeAdd = students.size();
        System.out.println("Size before add" + sizeBeforeAdd);


        boolean isEmptyAfterAdd = students.isEmpty();
        System.out.println("Empty After adding Element" + isEmptyAfterAdd);

        int sizeAfterAdd = students.size();
        System.out.println("Size After add" + sizeAfterAdd);

        //get all students name
        System.out.println(students);


        String oneName = students.get(2);
        System.out.println(oneName);

        boolean Sarita = students.contains("Sarita");
        System.out.println(Sarita);


        students.add("Shorna");
        students.add("Duaa");

        System.out.println(students);
        //remove jobayda
        students.remove(1);
        System.out.println("After removing Jobayda");
        System.out.println(students);


        students.set(1, "Anjuman");

        System.out.println("after adding Anjuman" + students);

        //students.clear();


        Collections.sort(students);
        System.out.println("After sorting" + students);


        Collections.shuffle(students);
        System.out.println("After Shuffling" + students);


        System.out.println(students.indexOf("Majed"));
    }

    public void ListofNumber() {
        List<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
        number.add(60);
        number.add(20);

        System.out.println(number);


        int maxValue = Collections.max(number);
        System.out.println(maxValue);

        int minValue = Collections.min(number);
        System.out.println(minValue);


        for (int i = 0; i < number.size(); i++) {
            System.out.println("the value of i " + number.get(i));
        }


    }

    public static void maxOfArraylist() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        int max = numbers.get(3);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                //100<200
                max = numbers.get(i);
                //max=200
            }
            System.out.println(max);
        }
    }

    //duplicate value
    public static void DuplicateArraylist() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(100);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        int duplicate = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (duplicate == numbers.get(i)) {
                //100<200
                duplicate = numbers.get(i);
                //max=200
            }
        }
        System.out.println(duplicate);

    }
        public static void main (String[]args){
            ArrayListDemo obj = new ArrayListDemo();
            // obj.ListPractice();
           // obj.ListofNumber();
            DuplicateArraylist();
          //  System.out.println("hello changes from local");
           // System.out.println("Hello changes from remote ");
        }
    }
