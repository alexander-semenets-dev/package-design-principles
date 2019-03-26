package single_responsibility_1;

import single_responsibility_1.model.Message;
import single_responsibility_1.model.User;

import java.util.Map;

class ConfirmationMailMailer {

    private final TemplateEngine templateEngine;
    private final Translator translator;
    private final Mailer mailer;

    public ConfirmationMailMailer(
            TemplateEngine templateEngine,
            Translator translator,
            Mailer mailer
    ) {
        this.templateEngine = templateEngine;
        this.translator = translator;
        this.mailer = mailer;
    }

    public void sendConfirmationMailToUser(User user) {
        final Message message = createConfirmationMessageForUser(user);

        mailer.send(message);
    }

    private Message createConfirmationMessageForUser(User user) {
        final String subject = translator.translate("Confirm your mail address");

        final String body = templateEngine.render(
                "confirmation-mail.template",
                Map.of("confirmationCode", user.getConfirmationCode())
        );

        return new Message(
                subject,
                body,
                user.getEmailAddress()
        );
    }

}