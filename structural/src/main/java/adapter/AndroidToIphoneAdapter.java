package adapter;

/*
Charge Android phone with IPhone charger.
We are passing Android phone into it but it can be charged using an iphone charger.
 */
public class AndroidToIphoneAdapter implements IPhone{

  private AndroidPhone androidPhone;

  public AndroidToIphoneAdapter(AndroidPhone androidPhone) {
    this.androidPhone = androidPhone;
  }

  public void charge() {
    androidPhone.charge();
  }
}
