package controlFlowStatements;

public class SwitchCase {

    int a = 5;
    public void switchCaseStatement(){
      switch (a){

          case 1 :
              System.out.println("the value of a is 1");
          case 2 :
              System.out.println("the value of a is 2");
          case 3 :
              System.out.println("the value of a is 3");
          case 4 :
              System.out.println("the value of a is 4");
          case 5 :
              System.out.println("the value of a is 5");
              break;
          case 6 :
              System.out.println("the value of a is 6");
      }
    }


    public static void main(String[] args) {
        SwitchCase obj = new SwitchCase();
        obj.switchCaseStatement();
    }
}
