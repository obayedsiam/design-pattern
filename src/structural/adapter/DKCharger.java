package structural.adapter;

public class DKCharger implements AndroidCharger{

    @Override
    public void chargeAndroid() {
        System.out.println("Your android phone is charging...");
    }
}
