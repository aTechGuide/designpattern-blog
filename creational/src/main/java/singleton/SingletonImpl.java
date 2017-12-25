package singleton;

public class SingletonImpl {

  public static void main(String[] args) {

    Singleton instance = Singleton.getInstance();
    System.out.println(instance); // singleton.Singleton@610455d6

    Singleton secondInstance = Singleton.getInstance();
    System.out.println(secondInstance); // singleton.Singleton@610455d6
  }

}
