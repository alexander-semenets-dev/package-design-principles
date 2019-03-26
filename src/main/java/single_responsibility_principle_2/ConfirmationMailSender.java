package single_responsibility_principle_2;

import single_responsibility_principle_2.model.Message;
import single_responsibility_principle_2.model.User;

class ConfirmationMailSender {

    private final ConfirmationMailFactory confirmationMailFactory;
    private final MailSender mailSender;

    public ConfirmationMailSender(
            ConfirmationMailFactory confirmationMailFactory,
            MailSender mailSender
    ) {
        this.confirmationMailFactory = confirmationMailFactory;
        this.mailSender = mailSender;
    }

    public void sendConfirmationMailToUser(User user) {
        final Message message = confirmationMailFactory.createConfirmationMessageForUser(user);

        mailSender.send(message);
    }

}