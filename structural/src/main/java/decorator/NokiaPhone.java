package decorator;

public class NokiaPhone extends SmartPhone {

  public NokiaPhone(Phone phone) {
    super(phone);
  }

  /*
  Adding new functionality to existing implementation
   */
  @Override
  public String build(){
    return super.build() + addBrading();
  }

  private String addBrading() {
    return " + Microsoft Inc.";
  }

}
