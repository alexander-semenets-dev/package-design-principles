package single_responsibility_principle_2;

import single_responsibility_principle_2.model.Message;

public interface MailSender {

    void send(Message message);

}
