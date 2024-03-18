package structural.adapter;

public class AdapterTester {
    public static void main(String[] args) {

        AppleCharger appleCharger = new IphoneCharger();
        Iphone13 iphone13 = new Iphone13(appleCharger);
        iphone13.charge();

        AndroidCharger androidCharger = new DKCharger();
        Android android  = new Android(androidCharger);
        android.charge();

        // In case when we don't have Iphone charger but need to charge iphone then we can use adapter.

        AppleCharger adapterAppleCharger = new Adapter(androidCharger);
        Iphone13 iphone13_two = new Iphone13(adapterAppleCharger);
        iphone13_two.charge();

    }
}
