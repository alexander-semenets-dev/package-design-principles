package single_responsibility_principle_1;

import single_responsibility_principle_1.model.Message;
import single_responsibility_principle_1.model.User;

import java.util.Map;

class ConfirmationMailSender {

    private final TemplateEngine templateEngine;
    private final LanguageTranslator languageTranslator;
    private final MailSender mailSender;

    public ConfirmationMailSender(
            TemplateEngine templateEngine,
            LanguageTranslator languageTranslator,
            MailSender mailSender
    ) {
        this.templateEngine = templateEngine;
        this.languageTranslator = languageTranslator;
        this.mailSender = mailSender;
    }

    public void sendConfirmationMailToUser(User user) {
        final Message message = createConfirmationMessageForUser(user);

        mailSender.send(message);
    }

    private Message createConfirmationMessageForUser(User user) {
        final String subject = languageTranslator.translate(
                "Confirm your mail address",
                "EN",
                user.getNativeLanguage()
        );

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