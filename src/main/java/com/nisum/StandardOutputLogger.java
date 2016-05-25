package com.nisum;


public class StandardOutputLogger {


    private String message;

    public void sayGoodMorning() {
        System.out.println(message);
    }


    public void setMessage(String message) {
        this.message = message;
    }
}
