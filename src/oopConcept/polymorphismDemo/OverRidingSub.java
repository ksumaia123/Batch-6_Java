package oopConcept.polymorphismDemo;

public class OverRidingSub extends OverRidingSuper{

    // Create a method about Upright Course and add location

@Override

    public void UprightCourse() {
    super.UprightCourse();
        String location = "USA";
        System.out.println(location);
    }




    public static void main(String[] args) {
    OverRidingSub obj = new OverRidingSub();
    obj.UprightCourse();
    }
}
