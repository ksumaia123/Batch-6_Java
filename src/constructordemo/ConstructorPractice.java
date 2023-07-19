package constructordemo;

public class ConstructorPractice {
    /*Constructor is a special method that hold the same name as class.
     we can parametrize the constructor and give argument while creating a object.

     There are two types of Constructor?
     i. Parametrize
     ii. Default
    */

    // constructor won't return anything

    String name;
    int id;
    String location;
    boolean isMale;
    
    public ConstructorPractice(String name, int id, String location, boolean isMale){
    this. name = name;
    this. id = id;
    this. location = location;
    this. isMale = isMale;

    }


    public ConstructorPractice() {    //Default Parametrized
        System.out.println("hi");
    }


    public static void main(String[] args) {
        ConstructorPractice obj = new ConstructorPractice("Arafat", 101, "New York", true);
//        obj.name ="Arafat";
//        obj.id= 101;
//        obj.location= "New York";
//        obj.isMale = true;
        System.out.println(obj.name+" " +obj.id+ " "+obj.location+ " "+ obj.isMale );

        System.out.println("--------------------------------");


        ConstructorPractice obj2 = new ConstructorPractice("Suriya", 102, "New York", true);
//        obj2.name ="Suriya";
//        obj2.id= 102;
//        obj2.location= "New Jersey";
//        obj2.isMale = true;
        System.out.println(obj2.name+" " +obj2.id+ " "+obj2.location+ " "+ obj2.isMale);
        System.out.println("--------------------------------");



        ConstructorPractice obj3 = new ConstructorPractice("Sarita",103, "Texas",false);
//        obj3.name ="Sarita";
//        obj3.id= 103;
//        obj3.location= "Texas";
//        obj3.isMale = false;
        System.out.println(obj3.name+" " +obj3.id+ " "+obj3.location+ " "+ obj3.isMale);
        System.out.println("--------------------------------");




        ConstructorPractice obj4 = new ConstructorPractice();


    }

}
