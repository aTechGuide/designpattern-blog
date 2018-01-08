package decorator;

/*
To decorate Phone we need to create an Abstract implementation
Which acts as decorator
 */
public abstract class SmartPhone implements Phone {

  private Phone phone;

  public SmartPhone(Phone phone) {
    this.phone = phone;
  }

  @Override
  public String build(){
    return phone.build();
  }
}
