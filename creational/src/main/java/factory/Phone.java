package factory;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public abstract class Phone {

  protected List<Specification> specifications = new ArrayList<Specification>();

  public Phone(){
    createPhone();
  }

  protected abstract void createPhone();

  @Override
  public String toString() {
    return "Phone{" +
        "specifications=" + specifications +
        '}';
  }
}
