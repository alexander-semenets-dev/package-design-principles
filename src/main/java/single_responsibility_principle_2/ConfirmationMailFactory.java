package single_responsibility_principle_2;

import single_responsibility_principle_2.model.Message;
import single_responsibility_principle_2.model.User;

import java.util.Map;

@SuppressWarnings("Duplicates")
public class ConfirmationMailFactory {

    private final TemplateEngine templateEngine;
    private final LanguageTranslator languageTranslator;

    public ConfirmationMailFactory(
            TemplateEngine templateEngine,
            LanguageTranslator languageTranslator
    ) {
        this.templateEngine = templateEngine;
        this.languageTranslator = languageTranslator;
    }

    public Message createConfirmationMessageForUser(User user) {
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
