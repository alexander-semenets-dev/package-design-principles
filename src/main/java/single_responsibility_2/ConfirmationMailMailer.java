package single_responsibility_2;

import single_responsibility_2.model.Message;
import single_responsibility_2.model.User;

class ConfirmationMailMailer {

    private final ConfirmationMailFactory confirmationMailFactory;
    private final Mailer mailer;

    public ConfirmationMailMailer(
            ConfirmationMailFactory confirmationMailFactory,
            Mailer mailer
    ) {
        this.confirmationMailFactory = confirmationMailFactory;
        this.mailer = mailer;
    }

    public void sendConfirmationMailToUser(User user) {
        final Message message = confirmationMailFactory.createConfirmationMessageForUser(user);

        mailer.send(message);
    }

}