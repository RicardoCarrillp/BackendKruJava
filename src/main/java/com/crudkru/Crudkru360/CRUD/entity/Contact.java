package com.crudkru.Crudkru360.CRUD.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "contacts")
public class Contact {
    private String name;
    private String lastName;
    private String email;
    private String phone;
    private String birthday;
    private String address;
    private String typeContact;
    private String origin;


    public Contact() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTypeContact() {
        return typeContact;
    }

    public void setTypeContact(String typeContact) {
        this.typeContact = typeContact;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Contact( String name, String lastName, String email, String phone, String birthday, String address, String typeContact, String origin) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.birthday = birthday;
        this.address = address;
        this.typeContact = typeContact;
        this.origin = origin;
    }
}
