package single_responsibility_2.model;

public class User {

    private final String emailAddress;
    private final String confirmationCode;

    public User(String emailAddress, String confirmationCode) {
        this.emailAddress = emailAddress;
        this.confirmationCode = confirmationCode;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getConfirmationCode() {
        return confirmationCode;
    }
}
