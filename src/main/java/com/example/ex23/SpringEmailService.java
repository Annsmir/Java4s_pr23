package com.example.ex23;

public interface SpringEmailService  {
    public void sendMail(String subj, String msg);
    public void sendMail(String subj, String msg, String rcpt);
}
