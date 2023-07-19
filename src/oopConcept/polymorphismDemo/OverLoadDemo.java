package oopConcept.polymorphismDemo;

public class OverLoadDemo {
    /* Polymorphism is another OOP Principle. Poly means Many.... morphism means form.
    that means many forms.

    That means we can have many forms of method.

    There is two kinds of Polymorphism.
    i. Method Overloading
    ii. Method Overriding

    Lets say you are working on Three Applications. each applications has different url
    and different login information.

    Method overloading can be achieved by keeping the same method name with
    different number of parameter, different data types  and different order of parameter.

     */

    /**
     * This method is created for www.macys.com
     * @param username
     * @param Password
     */

    public void login(String username, int Password){   //method signature
        //www.macys.com
        System.out.println("Macys front-end credential");

    }

    // assertEqual


    /**
     * this method is created for www.macyscard.com
     * @param username
     * @param pin
     * @param password
     */

    public void login(String username, int pin, int password){
        // www.macyscard.com
        System.out.println("Macy's card credential ");
    }


    /**
     * this method is created for www.mysql.com
     * @param number
     * @param hostUserName
     */

    public void login(int number, String hostUserName){
        // www.mysql.com
        System.out.println("macy's backend credential");
    }


    public static void main(String[] args) {
        OverLoadDemo obj = new OverLoadDemo();
        obj.login(43545, "Bashir");
        obj.login("BashirUddin", 345);
        obj.login("BashirTipu", 123, 45456);


    }
}







