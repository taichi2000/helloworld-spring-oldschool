package com.nisum;


public class HelloFormatter {

    private String preffix;

    public String addPreffix(String message){
        return preffix + message;
    }


    public String getPreffix() {
        return preffix;
    }


    public void setPreffix(String preffix) {
        this.preffix = preffix;
    }
}
