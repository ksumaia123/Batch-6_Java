package oopConcept.abstractionDemo;

public abstract class AbstractSuper {

    // abstraction is a process where we hide the implementation and showing only functionality
    // Abstract class cannot be instantiated.
    // In a abstract class there can be abstract and non-abstract methods
    // Abstract class can be 0% - 100% abstraction

    String customerName;
    int customerCardNo;
    int cardExpDate;
    int cardCvv;

    public abstract void placeOrder();



    public abstract void reduceAmount();

    public void cardDetails(){
        customerName ="Bashir";
        customerCardNo = 545440854;
        cardExpDate = 1224;
        cardCvv = 857;

    }




}
