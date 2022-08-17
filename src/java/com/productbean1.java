
package com;


public class productbean1 {
    
  private int pid;
  //private String name;
  private String fooditem;
  private String id;  //id=category
  private int quantity;
  private double price;
  //private String ppic;
  
  public productbean1(){}
   
  // public String getppic(){return ppic;} 

    public productbean1(int pid, String fooditem, String id, int quantity, double price) {
        this.pid = pid;
        this.fooditem = fooditem;
        this.id = id;
        this.quantity = quantity;
        this.price = price;
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
   
    
}
