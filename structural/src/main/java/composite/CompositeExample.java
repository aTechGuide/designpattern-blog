package composite;

public class CompositeExample {
/*
Component: Employee
Composite: Lead, Manager
Leaf: Developer
 */

  public static void main(String[] args) {
    Employee developer1 = new Developer("Kamran", 1, 100L);
    Employee developer2 = new Developer("Palash", 2, 100L);
    Employee developer3 = new Developer("Tilak", 3, 100L);
    Employee developer4 = new Developer("Ali", 4, 100L);

    Employee lead1 = new Lead("Mayank", 5, 1000L);
    Employee lead2 = new Lead("Prakhar", 6, 1500L);

    Employee manager = new Manager("Will", 7, 4000L);

    lead1.add(developer1);
    lead1.add(developer2);
    lead2.add(developer3);

    manager.add(lead1);
    manager.add(lead2);
    manager.add(developer4);

    System.out.println(lead1.toString());
    // Lead: Mayank, 5, Emloyees:  -> Developer: Kamran,1 -> Developer: Palash,2
    System.out.println(lead2.toString());
    // Lead: Prakhar, 6, Emloyees:  -> Developer: Tilak,3
    System.out.println(manager.toString());
    // Manager: Will,7, Emloyees:  -> Lead: Mayank, 5, Emloyees:  -> Developer: Kamran,1 -> Developer: Palash,2
    // -> Lead: Prakhar, 6, Emloyees:  -> Developer: Tilak,3 -> Developer: Ali,4

  }
}
