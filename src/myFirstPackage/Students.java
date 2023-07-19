package myFirstPackage;

public class Students {
    // variable or properties
    // the following variables are gloval variables.
    // only declared
    String name;
    int studentID;
    char gender;
    String group;
    static String schoolName = "Upright Tech Solutions";

    public static void study(){   //Custom method
        String location;
        location = "USA";
        System.out.println(location);
        System.out.println("students study to prepare the homework");
    }

    public void exam(){     //Custom method
        int ZipCode;
        System.out.println("Students prepare for the exam every quarter of the year");
        study();
    }

    public static void main(String[] args) {
        Students obj = new Students(); // object of the "students" class/instantiate the class.
        // obj is reference variable.

        obj.name = "Arafat"; //initialize means assiging a value to the variable/defining the variable
        obj.studentID = 101;
        obj.gender = 'M';
        obj.group = "Selenium";
        //obj.schoolName = "Upright Tech Solutions";

        System.out.println("The first name of the student is " + obj.name); //using the variable
        // When we merge and a variable -- we need to use + sign. the + sign called here concatenation.

        System.out.println(obj.studentID);
        System.out.println(obj.gender);
        System.out.println(obj.group);
        System.out.println(schoolName);


        study();
        obj.exam();


        System.out.println("-----------------------------------");


        Students obj2= new Students(); //Reference variable

        obj2.name = "Farzana"; //initialize means assiging a value to the variable/defining the variable
        obj2.studentID = 102;
        obj2.gender= 'F';
        obj2.group= "API Testing";
        obj2.schoolName = "Upright Tech Solutions";

        System.out.println(obj2.name+ " is the First name of the student ");
        System.out.println(obj2.studentID);
        System.out.println(obj2.gender);
        System.out.println(obj2.group);
        System.out.println(schoolName);

        study();
        obj2.exam();


    }



}
