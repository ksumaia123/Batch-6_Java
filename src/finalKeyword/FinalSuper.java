package finalKeyword;

public  class FinalSuper {

    /*
    Final Variable cannot be modified
    Final variable cannnot be overridden
    Final class cannnot be extended
     */

    final String name = "Bashir"; // instance variable


    public void UprightTechSolutions(){
        String mode = "online";
    }


    public static void main(String[] args) {
        FinalSuper obj = new FinalSuper();
       // obj.name = "Tipu";

        System.out.println(obj.name);

    }
}
