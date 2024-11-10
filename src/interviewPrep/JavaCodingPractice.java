package interviewPrep;

public class JavaCodingPractice {

    // print out numbers from 1-10
    // index value in array starts with 0,
    // length or number value in forloop starts with 1,

    public static void PrintNumbers() {

        for (int i = 10; i <= 10; i++) {
            System.out.println(i);

        }
    }

    //print out numbers from 10-1

    public static void PrintCode2 () {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);

        }

    }


    //3,5,27,4,7
    // create array
    // condition is 4 using index/position of numbers/ value from 0

    public static void PrintCode3(){
        int [] numbers = { 3, 5, 27, 4, 7};
        for (int i = 0; i<=4; i++){
            System.out.println(numbers[i]);
        }





    }

    //reverse index value

    public static void PrintCode4(){
        int [] numbers  = { 3, 5, 27, 4, 7};
        for (int i =4; i >=0; i--){
            System.out.println(numbers[i]);
        }



    }

    // using string print second lettter of name "sumaia"
    //charat used for indiviual character

public static void PrintCode5(){
        String name = "Sumaia";
    //System.out.println(name.charAt(3));
    for (int i =name.length()-1; i>=0; i--){
        System.out.print(name.charAt(i));
    }

}

// reverse string using parametrize

    public static void PrintCode6(String name){
for (int i =name.length()-1; i>=0; i--){
    System.out.print(name.charAt(i));

}

    }


    // Palindrome example "mom" reading left to right or right to left same
    //reverse empty string
    public static void PrintCode7(String name) {
        String Reverse = "";  //Sumaia
        for (int i = name.length() - 1; i >= 0; i--) {

            Reverse = Reverse + name.charAt(i);

        }
        System.out.println(Reverse);

        if (name.equalsIgnoreCase(Reverse))
        {
            System.out.println("Palindrome");

        }
        else {
            System.out.println("This is Not Palindrome");
        }

    }



    public static void main (String[]args){
            //  JavaCodingPractice obj = new JavaCodingPractice();
            // obj.PrintNumbers();
           // PrintNumbers();
           // PrintCode2();
           // PrintCode3();
           // PrintCode4();
           // PrintCode5();
          //  PrintCode6("Jewel");
        PrintCode7("Mom");
        }
    }






