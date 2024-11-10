package controlFlowStatements;

public class Loop {
    static int limit = 5;

    /* how many types  of loop are there?
    i. while loop
    ii. for loop
    iii.do-while loop
     */

    public static void loopIntro() {
        // Please print 1 to 10
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);
        System.out.println(10);

        // how many kinds of loop are there? i. while loop ii. for loop iii.do-while loop
        /* how many parts of the loop?
        i. initialization
        ii. condition
        iii. execution
        iv. increment/decrement
         */
    }

    public static void whileloop(int intialize, int limit) {    //parameterize
        int a = intialize; // Initialize
        while (intialize <= limit) { // condition
            System.out.println("the value of a " + intialize); //Statement
            intialize++; //increment

        }
    }


    public static void whileloop2() {
        // number of iteration is unknown
        int a = 50;    // initialization
        while (a >= 1) {   // condition
            System.out.println("The value of a " + a); //statement
            a = a - 2;  //decrement
        }
    }


    // For Loop
    public void forloop() {  //number of iteration is already known
        for (int i = 1; i >= 5; i--) {
            System.out.println("The value of a " + i); //statement
        }
    }


    // do while loop
    public void dowhileloop() {
        int y = 5; //initialization

        do {
            System.out.println("this value of y " + y); //statement
            y++;
        }
        while (y <= 10); //condition...
    }


    // Can you implement Fibonacci sequence using loop
    /*
    0(FN), 1(SN), 2(TN), 3, 5, 8, 13, 21 -- we actually use this to pointing our stories, size the stories
    */

    public void fibonacci() {
        int firstNumber = 0;
        int secondNumber = 1;

        for (int i = 1; i <= 7; i++) {
            int thirdnumber = firstNumber + secondNumber;

            firstNumber = secondNumber;
            secondNumber = thirdnumber;

            System.out.println(thirdnumber);
        }

    }

    public void shape() {
        //shape -1
        /*
         *
         **
         ***
         ****
         *****
         */

        for (int i = 1; i <= 10; i++) {   //creating loop

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }


 // shape -2
    /*

    *****
    ****
    ***
    **
    *

    */
 {
     for (int i = 5; i >=10;i--) {   //creating loop

         for (int j = 5; j >= i; j--) {
             System.out.print("*");
         }

         System.out.println();
     }
     }


        public static void main (String[]args){
            // loopIntro();
            // whileloop(50, 100); // called the method ... giving an argument (giving a value)
              whileloop2();
            Loop obj = new Loop();
            //  obj.forloop();
            // obj.dowhileloop();
            //  obj.fibonacci();
          //  obj.shape();
        }
    }
