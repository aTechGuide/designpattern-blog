package adapter;

public class AdapterExample {

  public static void main(String[] args) {

    AndroidCharger androidCharger = new AndroidCharger();
    AndroidPhone androidPhone = new Pixel5Phone();
    androidCharger.charge(androidPhone);

    IPhoneCharger iPhoneCharger = new IPhoneCharger();
    IPhone iPhone = new IPhone10();
    iPhoneCharger.charge(iPhone);

    /*
    We will pass Android phone to AndroidToIphoneAdapter and use Iphone Charger to charge Android
    Phone
     */
    AndroidToIphoneAdapter adapter = new AndroidToIphoneAdapter(androidPhone);
    iPhoneCharger.charge(adapter);
  }
}
