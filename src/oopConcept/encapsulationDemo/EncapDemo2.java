package oopConcept.encapsulationDemo;

public class EncapDemo2 {

    public static void main(String[] args) {
        EncapDemo obj = new EncapDemo();
        obj.setSSN(23232333);
        int mySSN = obj.getSSN();
        System.out.println(mySSN);

    }
}
