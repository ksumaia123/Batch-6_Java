package javaOperators;

public class JavaOperatorsDemo {

    //Arrithmatic
    //Relational
    //logical Operator
    //Assignment Operator...

    public static void arithmaticOperators(){
    // Arthmatics operators are -- +,-,*,/...
        int a = 20;
        int b = 9;
        int result = 0;

        result = a+b;
        System.out.println(result);


        result = a-b;
        System.out.println(result);

        result = a*b;
        System.out.println(result);

        result = a/b;
        System.out.println(result);

        float height = 20/9f;
        System.out.println(height);

        float fraction = (float)a/b;
        System.out.println(fraction);

//        byte   Stores whole numbers from -128 to 127
//        short  stores whole numbers from -32,768 to 32,767

        byte wheels = 4;
        short x = wheels;
        System.out.println(x);


        short regNo = 32767;
        byte y = (byte)regNo;
        System.out.println(y);
    }


    public static void relationalOperators(){
 //    relational operators are >,<,>=,<=, != will return bullian value
        int a = 20;
        int b = 9;
        boolean result = false;

        result = a>b;
        System.out.println(result);

        result = a<b;
        System.out.println(result);

        result = a>=b;
        System.out.println(result);

        result = a!=b;
        System.out.println(result);

    }

    public static void logicalOperators(){
        //logical operators are &&(and), ||(Or) and also return boolean value

        int a = 20;
        int b = 9;
        int c = 5;

        boolean result1 = (a>b)&&(b<c);
        System.out.println(result1);


        boolean result2 = (b<a)||(a<c);
        System.out.println(result2);

        boolean result3 = (a>b)||(b<a)&&(a<c);
        System.out.println(result3);
    }






    public static void main(String[] args) {
//        JavaOperatorsDemo obj = new JavaOperatorsDemo();
//        obj.arithmaticOperators();
//        arithmaticOperators();

//        relationalOperators();

        logicalOperators();
    }








}

