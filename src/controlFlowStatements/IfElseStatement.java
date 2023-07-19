package controlFlowStatements;

import java.util.Scanner;

public class IfElseStatement {

    // Conditional Statement -- it has two parts -- one is i. condition ii. block
    // the following variables are global/instance variables...
    int a = 2;
    int b = 4;
    int c = 7;

    /* There are few types of conditional statement
    i. if statement
    ii. if else statement
    iii. if else ladder
    iv. Nester if else
    */

    public void ifStatement(){
        if (a ==2){
            System.out.println("a is equal to 2");

        String hi = "hello";
            System.out.println(hi);
        }
    }

    public void ifElseStatement(){
  //      if(a==2){
 //           System.out.println(" a is equal to 1");
 //       }
  //      else {
  //          System.out.println("the value of a is something else");
 //       }

        if(b%2 ==0)
            System.out.println("This is a even number");

        else {
            System.out.println("this is a odd number");
        }

    }


    public void ifElseLadder(){
  //      int a = 2;
  //      int b = 4;
  //      int c = 7;

        Scanner scan = new Scanner(System.in);
        System.out.println("Print Your a number");
        int a = scan.nextInt();
        System.out.println("Print Your b number");
        int b = scan.nextInt();
        if((a>b)&& (b<c)){
            System.out.println("a>b and b<c");
        }
        else if ((a>c)||(c>b)){
            System.out.println("a>c or C<a");
        }
        else if ((a+b<c)&&(a>b)){
            System.out.println("a+b<c and a>b");
        }
        else {
            System.out.println("nothing matches");

        }
    }


    public void nestedIfElseStatement(){
        if((a>b)&& (b<c)){
            System.out.println("a>b and b<c");
        }
        else if ((a>c)||(c>b)){
            System.out.println("a>c or C<a");
        }
        else if ((a+b<c)&&(a>b)){
            System.out.println("a+b<c and a>b");
        }
        else {
            System.out.println("nothing matches");
            if((a*b<c)&&(a<c)) {
                System.out.println("a*b<c && a<c");
            }
            else if ((a+b<c)&&(a>b)){
                    System.out.println("a+b<c and a>b");
                }
            else{
                System.out.println("nothing matches");
            }
        }
    }







    public static void main(String[] args) {
        IfElseStatement obj = new IfElseStatement();
       // obj.ifStatement();
      //  obj.ifElseStatement();
        obj.ifElseLadder();

    }
}
