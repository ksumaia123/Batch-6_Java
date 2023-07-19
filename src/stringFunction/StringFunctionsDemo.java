package stringFunction;

import java.nio.charset.StandardCharsets;
public class StringFunctionsDemo {

    public void stringPractice() {
        String name = "Upright";

        int lengthOfMyString = name.length();
        System.out.println(lengthOfMyString);

        // System.out.println(name.length);

    }


    public static void changeCase() {
        String name = "Upright";
        String upper = name.toUpperCase();
        System.out.println(upper);
        String lower = name.toLowerCase();
        System.out.println(lower);

    }

    public static void splitString() {
        String schoolName = "Upright_Tech Solutions";
        String[] arrayofSchoolName = schoolName.split("_");
        System.out.println(arrayofSchoolName.length);
        System.out.println(arrayofSchoolName[0]);
        System.out.println(arrayofSchoolName[1]);

        // Homework ---- split with limit
        String NewschoolName = "Upright Tech Solutions";
        String[] arrayofSchoolName1 = schoolName.split(" ", 2);

    }


    public static void stringtoint() {
        String money = "fifty";
        System.out.println(money + 100);
        int money1 = Integer.parseInt(money);
        System.out.println(money1 + 100);


    }

    public static void intTOString() {
        int money = 200;
        System.out.println(money + 200);
        String newMoney = String.valueOf(money);
        System.out.println(newMoney + 100);

    }

    public static String subStringDemo() {
        String email = "uprighttechsolutions@gmail.com";
        String newText = email.substring(7);  //+1
        // System.out.println(newText);
        return newText;

    }


    public static void replaceDemo() {
        String email = "uprighttechsolutions_gmail.com";
        String newEmail = email.replace("_", "@");
        System.out.println(newEmail);
    }


    public static void reverse() {
        String schoolName = "UprightTechSolutions";   //thgirpu
        System.out.print(schoolName.charAt(6));
//        System.out.print(schoolName.charAt(5));
//        System.out.print(schoolName.charAt(4));
//        System.out.print(schoolName.charAt(3));
//        System.out.print(schoolName.charAt(2));
//        System.out.print(schoolName.charAt(1));
//        System.out.print(schoolName.charAt(0));


        for (int i = schoolName.length() - 1; i >= 0; i--) {
            System.out.print(schoolName.charAt(i));

        }

    }


    public static void reverseBuffer() {
        String schoolName = "UprightTechSolutions";
        StringBuffer sb = new StringBuffer(schoolName);

        sb.insert(6,"-");
        System.out.println(sb);
        sb.append("Hello");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }


    public static void palindromeDemo() {
        //madam---madam
        //kayak---kayak
        //mom ---mom
        //dad---dad

        String name = "mom";
        String rev = "";
        for (int i = name.length()- 1; i >=0; i--) {
            rev = rev + name.charAt(i);
        }
        if (name.equals(rev)) {
            System.out.println("This is palindrome");
        }
        else {
            System.out.println("this is not palindrome");
        }
    }


    /* HOMEWORK
1. lets say String Name = "UprightTechSolutions_gmail.com";
validate that if the string has "@" symbol then print (" it is ok")


2. Lets say
String name = "my name is Sumaia";

write program so that you can print the following
"My Name Is Sumaia"

     */

public static void validateEmail(){
    String email = "UprightTechSolutions_gmail.com";
if (email.contains("@gmail.com")){
    System.out.println("it is ok]");
    }
else{
    System.out.println("not good");
}
}


public static void formatName(){
    String name = "my name is sumaia";
    String[]words = name.split(" ");
    // String[]words = {"my", "name", "is", "Sumaia"};
//    System.out.println(words[0]);
//    System.out.println(words[1]);
//    System.out.println(words[2]);
//    System.out.println(words[3]);

    for(String singleword: words){
     String  firstLetter = singleword.substring(0,1);   // will pick m from my
    String afterFirstLetter = singleword.substring(1); //will pick y from my
        String fullword = firstLetter.toUpperCase()+afterFirstLetter+ " ";
        System.out.print(fullword);

    }
}






    public static void main(String[] args) {
        // stringPractice();
        //  changecase();
        //  splitString();
        //  stringtoint();
        // intTOString();
        // String printNewText =  subStringDemo();
        // System.out.println(printNewText);
        // validation
        // replaceDemo();
        // reverse();
        // reverseBuffer();
       // palindromeDemo();
       // validateEmail();
        formatName();


//            if (printNewText.equalsIgnoreCase("tech")){
//                System.out.println("We are good");
//            }
//            else {
//                System.out.println("please check back the string");
//
//            }

    }

}
