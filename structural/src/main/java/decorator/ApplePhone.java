package decorator;

/*
Decorator Implementation
 */
public class ApplePhone extends SmartPhone {

  public ApplePhone(Phone phone) {
    super(phone);
  }

  /*
  Adding new functionality to existing implementation
   */
  @Override
  public String build(){
    return super.build() + addOS();
  }

  private String addOS() {
    return " + IOS v1.0";
  }
}
