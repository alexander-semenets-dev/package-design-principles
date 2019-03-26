package single_responsibility_2;

import single_responsibility_2.model.Message;

public interface Mailer {

    void send(Message message);

}
