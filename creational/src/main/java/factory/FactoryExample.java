package factory;

public class FactoryExample {

  public static void main(String[] args) {
    Phone androidPhone = PhoneFactory.getPhone(PhoneType.ANDOID);
    Phone iPhone = PhoneFactory.getPhone(PhoneType.IPHONE);

    System.out.println(androidPhone);
    System.out.println(iPhone);
  }
}
