package composite;

public class Developer extends Employee {

  public Developer(String name, Integer empID, Long salary) {
    super(name, empID, salary);
  }

  public String toString() {

    StringBuilder builder = new StringBuilder("Developer: ");
    builder.append(name);
    builder.append(",");
    builder.append(empID);

    return builder.toString();
  }
}
