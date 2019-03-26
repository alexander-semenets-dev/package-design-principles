package single_responsibility_1.model;

public class Message {

    private final String subject;
    private final String body;
    private final String recipientEmailAddress;

    public Message(String subject, String body, String recipientEmailAddress) {
        this.subject = subject;
        this.body = body;
        this.recipientEmailAddress = recipientEmailAddress;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public String getRecipientEmailAddress() {
        return recipientEmailAddress;
    }
}
