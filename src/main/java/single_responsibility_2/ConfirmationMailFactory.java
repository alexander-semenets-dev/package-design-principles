package single_responsibility_2;

import single_responsibility_2.model.Message;
import single_responsibility_2.model.User;

import java.util.Map;

public class ConfirmationMailFactory {

    private final TemplateEngine templateEngine;
    private final Translator translator;

    public ConfirmationMailFactory(
            TemplateEngine templateEngine,
            Translator translator
    ) {
        this.templateEngine = templateEngine;
        this.translator = translator;
    }

    public Message createConfirmationMessageForUser(User user) {
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
