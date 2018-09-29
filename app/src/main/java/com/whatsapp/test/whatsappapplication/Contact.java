package com.whatsapp.test.whatsappapplication;

public class Contact {

    private String id;
    private String name;
    private String Number;

    public Contact() {
    }

    public Contact(String id, String name, String number) {
        this.id = id;
        this.name = name;
        Number = number;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }
}
