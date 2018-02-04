package facade;

/**
 * Created by bornshrewd on 04/02/18
 * This class abstracts out Phone creation of a particular type.
 * Imagine if phone creation involved complex logic and data builders and other mappers
 * This class would have abstracted out that logic
 * Client can directly use this class which abstracts out all CLUMSY Logic
 */
public class PhoneFacade {

    private IPhone iPhone;
    private OnePlus onePlus;

    public PhoneFacade() {
        iPhone = new IPhone();
        onePlus = new OnePlus();
    }

    public String buildApplePhone() {
        // Imagine complex logic involved here to build an Apple Phone
        return iPhone.build();
    }

    public String buildAndroidPhone() {
        return onePlus.build();
    }
}
