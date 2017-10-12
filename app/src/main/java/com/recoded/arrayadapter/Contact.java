package com.recoded.arrayadapter;

/**
 * Created by paytekht on 09-10-2017.
 */

public class Contact  {


    private  String name;
    private  String phone ;
    private String email;
    private int image;

    public Contact(String name, String phone, String email ,int image) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.image = image;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
