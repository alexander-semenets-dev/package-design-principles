package single_responsibility_principle_1;

import single_responsibility_principle_1.model.Message;

public interface MailSender {

    void send(Message message);

}
