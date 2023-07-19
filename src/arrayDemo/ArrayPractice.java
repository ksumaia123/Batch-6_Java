package arrayDemo;

public class ArrayPractice {
    // single variable can take only one value
    // int[] age={20,21,22,23};

    // int[]age={20,21,22,23};

    String[] name = {"Bashir", "Akshara", "Tarikuzzaman"};     // index oder..0,1,2
    //Array Value holds multiple variable it follows index order which start with 0,1,2.
    // What is the characteristic of Array -- it is fixed in length
    // Array is Static
    //String name1[] = new String[]{"Bashir", "Akshara", "Tarikuzzaman"};

    //Array Variable
    public void arraydemo1() {
        //      name[0]= "Bashir";
        //      name[1]="Akshara";
        //      name[2]= "Tarikuzzaman";


//        System.out.println("The name of the instructor is " + name[0]);
//        System.out.println("The name of the instructor is " + name[1]);
//        System.out.println("The name of the instructor is " + name[2]);
//        System.out.println("The name of the instructor is " + name[3]);


        for (int i = 0; i < name.length; i++) {
            String firstone = name[i];
        }


        // for each loop
        for (String studentsName : name) {
            System.out.println(name);
        }

        int lengthofArray = name.length;
        System.out.println(lengthofArray);


    /* Very Common interview questions;
    What are the java exceptions you have encountered
    i. Arrayindexoutofboundexception

     */
    }

        String students = "Sumaia";
        int i = 2;


        public static void main (String[]args){
            ArrayPractice obj = new ArrayPractice();
            obj.arraydemo1();
        }

    }
