package facade;

/**
 * Created by bornshrewd on 04/02/18
 */
public class FacadeExample {

    public static void main(String[] args) {

        // Cleaner Client Code
        PhoneFacade phoneFacade = new PhoneFacade();

        // We are creating phone using facade without going through complex logic
        System.out.println(phoneFacade.buildAndroidPhone());
        System.out.println(phoneFacade.buildApplePhone());
    }
}
