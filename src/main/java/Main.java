import br.com.mariojp.solid.dip.*;

public class Main {
	public static void main(String[] args) {
		System.setProperty("DRY_RUN", "true");

		MailSender sender;
		if ("true".equalsIgnoreCase(System.getProperty("DRY_RUN"))) {
			sender = new NoMailSender();
		} else {
			sender = new SmtpClient();
		}

		EmailNotifier notifier = new EmailNotifier(sender);
		notifier.welcome(new User("Ana", "ana@example.com"));
		System.out.println("Email enviado!");
	}
}
