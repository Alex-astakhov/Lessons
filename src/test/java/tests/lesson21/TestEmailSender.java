package tests.lesson21;

import imap.EmailSender;
import org.testng.annotations.Test;

/**
 * Created by Alex Astakhov on 16.01.2017.
 */
public class TestEmailSender {
    @Test
    public void sendEmail(){
        EmailSender emailSender = new EmailSender("alex-astakhov@ukr.net");
        emailSender.sendEmail("TestTrelloApi email", "My lovely test email");

    }
}
