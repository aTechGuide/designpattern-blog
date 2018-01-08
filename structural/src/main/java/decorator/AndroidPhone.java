package decorator;

/*
Decorator Implementation
 */
public class AndroidPhone extends SmartPhone {

  public AndroidPhone(Phone phone) {
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
    return " + Android OS v8.0";
  }
}
