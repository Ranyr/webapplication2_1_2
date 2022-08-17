
package com;


public class User 
{
    private int uid;
    private String name;
    private String email;
    private String password;
 private String contact_no;//
    private String address;//
    
    public User(){}

    public User(int uid, String name, String email, String password, String contact_no, String address) {
        this.uid = uid;
        this.name = name;
        this.email = email;
        this.password = password;
        this.contact_no = contact_no;
        this.address = address;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContact_no() {
        return contact_no;
    }

    public void setContact_no(String contact_no) {
        this.contact_no = contact_no;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

       
    
    
    
}
