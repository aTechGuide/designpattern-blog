package composite;

import java.util.ArrayList;
import java.util.List;

public class Lead extends Employee {

  private List<Employee> employees = new ArrayList<Employee>();

  public Lead(String name, Integer empID, Long salary) {
    super(name, empID, salary);
  }

  @Override
  public void add(Employee employee){
    employees.add(employee);
  }

  @Override
  public void remove(Employee employee){
    employees.remove(employee);
  }

  @Override
  public String toString() {

    final StringBuilder builder = new StringBuilder("Lead: ");
    builder.append(name);
    builder.append(",");
    builder.append(" " + empID);
    builder.append(", Emloyees: ");
    employees.forEach(employee -> builder.append(" -> " + employee.toString()));

    return builder.toString();
  }
}
