
package com;


public class Order extends productbean1{
    private int orderid;
    //private int uid;
    private String name;//
    private String email;//
    private String contact_no;//
    private String address;//
    private int quantity;
    private String date;
    private double price; 
  
    
    
    public Order(){}

    public Order(int orderid, String name, String email, String contact_no, String address, int quantity, String date, double price) {
        this.orderid = orderid;
        this.name = name;
        this.email = email;
        this.contact_no = contact_no;
        this.address = address;
        this.quantity = quantity;
        this.date = date;
        this.price = price;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

   
  
    
}
