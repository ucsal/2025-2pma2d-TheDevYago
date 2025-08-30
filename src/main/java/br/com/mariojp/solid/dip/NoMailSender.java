package br.com.mariojp.solid.dip;

public class NoMailSender implements MailSender {
    @Override
    public void send(String to, String subject, String body){
        System.out.println("DRY_RUN: Email para " + to + " não foi enviado.");
    }
}
