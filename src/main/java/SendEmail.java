import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

class SendEmail {
    public static void main(String[] args) throws EmailException {
        Email email = new SimpleEmail();
        email.setHostName("poczta.interia.pl");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("USER_NAME", "PSWD"));
        email.setSSLOnConnect(true);
        email.setFrom("USER_NAME@interia.pl");
        email.setSubject("Hi");
        email.setMsg("HelloWorld!");
        email.addTo("ADRESS_EMAIL");
        System.out.println("starting");
        email.send();
        System.out.println("Done!");
    }
}