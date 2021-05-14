package nLayerdDemo.core.abstracts;

import nLayerdDemo.entities.concretes.User;

public interface MailService {

    void sendVerifyEmail(User user);
    void clickToVerify(User user);
}
