package interviewPrep;

public class EvenOdd {

    /*
    how many types of variable are there?
    i. Static //belongs to class
    ii. local
    iii. global/instance // belongs to object

     */

    static int number = 3;   //Global or Instance variable

    public  void evenOdd(){
        // Any variable inside the method is called local variable.
       if (number%2 ==0){
           System.out.println(number + " is a even number");

       }
        else {
           System.out.println(number + " is a odd number");
       }
    }

    public static void main(String[] args) {
        EvenOdd obj = new EvenOdd();  // I am creating an object of the class. instantiated  the class
        // creating an instance of the class
        obj.evenOdd();
    }


}
