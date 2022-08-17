/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;
public class photobean {
   /* private int pid;
    String fooditem;
    String id; //category
    int quantity;
    double price;
    String filename;
    String path; */

   /* private int id;
    String name;
    String filename;
    String path; */
    private int pid;
    private String fooditem;
    private String id;
    private int quantity;
    private double price;
    private String photo;
    public photobean(){}

    public photobean(int pid, String fooditem, String id, int quantity, double price, String photo) {
        this.pid = pid;
        this.fooditem = fooditem;
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.photo = photo;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getFooditem() {
        return fooditem;
    }

    public void setFooditem(String fooditem) {
        this.fooditem = fooditem;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    
    
    
      
    
}
