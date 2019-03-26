package single_responsibility_principle_1.model;

public class User {

    private final String emailAddress;
    private final String confirmationCode;
    private final String nativeLanguage;

    public User(
            String emailAddress,
            String confirmationCode,
            String nativeLanguage
    ) {
        this.emailAddress = emailAddress;
        this.confirmationCode = confirmationCode;
        this.nativeLanguage = nativeLanguage;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getConfirmationCode() {
        return confirmationCode;
    }

    public String getNativeLanguage() {
        return nativeLanguage;
    }
}
