package singleton;

public class Singleton {

  // Lazy loading
  // Volatile is necessary to avoid threads to see half initialized instance of Singleton
  private static volatile Singleton instance = null;

  private Singleton(){

  }

  /* Synchronizing at method level will synchronize every call to getInstance
   */
  /*public static synchronized Singleton getInstance(){

    if(instance == null){
      instance = new Singleton();
    }
    return instance;
  }*/

  /* We want to synchronize only when we are creating the object to avoid race condition
  Returning the created object should not be blocked
   */
  public static Singleton getInstance(){

    if(instance == null){
      synchronized (Singleton.class){
        // Double checking to make sure thread already inside first null check
        // doesn't create Race Condition
        if(instance == null){
          instance = new Singleton();
        }
      }

    }
    return instance;
  }
}
