package myFirstPackage;

public class Cars {     //Carle barces

    //Properties -- Variables
    //Functions -- Methods


    /* cars --class
    Properties --color, wheels, backdoor, back mirror, engine--how the object looks like
    Behavior --speed, run faster, change the gear, carries goods,--how it functions

    my car,
    Jewel's car
    Ashraf's car
    your car
     */
    //

    // package always starts with lower case, no space but other words should be upper case
    // Class always start with upper case, no space but other words should be upper case


    /* Data Types
    Primitive(old) Data Type
    byte   Stores whole numbers from -128 to 127
    short  stores whole numbers from -32,768 to 32,767
    int    stores whole numbers from -2,147,483,648 to 2,147,483,647
    long   stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    float  stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
    double store fractional numbers. Sufficient for storing 15 decimal digits
    boolean stores true or false values
    char    store single value

    Non - Primitive (New) Data Type
    String
    Class
    Array

     */
// VAriable has three parts -- i. Declaring   ii. defining/initiating   iii.using
// I can declare variable in two places, i. inside class   ii. inside method
// when i declare inside class -- this is called intance/ global variable
// when i declare variable inside any method -- this is called local variable

    byte wheels;
    short milage;
    int regNo;
    // long ---
    float height;
    double length;
    boolean isEV;
    char FirstLetter;
    String color;


    /* Is java is 100% object oriented programming language --
    Answer -- because of primitive data types these are not class -- i cannot create object of primitive data types--
    */


    public void speed(){    // Functions--Methods --- Custom Methods
        System.out.println("Car can be operated speedily");
    }

    public void changingGear(){ // Functions--Methods -- Custom Methods
        System.out.println("Gear can be changed frequently in the car");

    }


    // IDE -- Integrated Development Environment

    public static void main(String[] args) {   // special method given by java itself to run the code.

  // whatever command I pass over here, it will run

      //  byte wheels; //declaring -- local variable
           // wheels= 4; //defining/initiating
        // short milage = 32767;
        //  int regNo = 2147483647;
        // long ---
        // float height = 3.235455f;
        // double length = 100.85085205235825;
        // boolean isEV = false;
        // char FirstLetter = 'T';
        // String color = "Red";




        Cars mycar = new Cars(); // object of the Cars class

        mycar.wheels = 4;
        mycar.milage = 32767;
        mycar.regNo = 2147483647;
        //long---
        mycar.height = 3.235455f;
        mycar.length = 100.85085205235825;
        mycar.isEV = false;
        mycar. FirstLetter = 'N';
        mycar.color= "Red";
        // calling the method/functions
        mycar.speed();
        mycar.changingGear();



        Cars jewelscar = new Cars();
        jewelscar.wheels = 4;
        jewelscar.milage = 32764 ;
        jewelscar.regNo = 214343647;
        //long---
        jewelscar.height = 3.2343455f;
        jewelscar.length = 100.853352525;
        jewelscar.isEV = true;
        jewelscar. FirstLetter = 'M';
        jewelscar.color= "White";

        //calling the method
 //       jewelscar.speed();
  //      jewelscar.changingGear();
    }





}
