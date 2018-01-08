package decorator;

public class WindowsPhone extends SmartPhone {

  public WindowsPhone(Phone phone) {
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
    return " + Windows OS 10";
  }
}
