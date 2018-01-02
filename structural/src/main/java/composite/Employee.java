package composite;

public abstract class Employee {

  protected String name;
  protected Integer empID;
  protected Long salary;

  public Employee(String name, Integer empID, Long salary) {
    this.name = name;
    this.empID = empID;
    this.salary = salary;
  }

  public void add(Employee employee){
    throw new UnsupportedOperationException("Can't add reportee");
  }

  public void remove(Employee employee){
    throw new UnsupportedOperationException("Can't remove reportee");
  }

  public abstract String toString();
}
