
package com;

public class productbean 
{
  private int pid;
  private String name;
  private String id;  //id=category
  private String quantity;
  private int price;
  
  public productbean(){}
   public productbean(String name,String id,String quantity,int price)
   {
       this.name=name;
       this.id=id; //category
       this.quantity=quantity;
       this.price=price;
   }
   public void setpid(int pid){this.pid=pid;}
   public void setname(String name){this.name=name;}
   public void setid(String id){this.id=id;}
   public void setquantity(String quantity){this.quantity=quantity;}
   public void setprice(int price){this.price=price;}
   
   public int getpid(){return pid;}
   public String getname(){return name;}
   public String getid(){return id;}
   public String getquantity(){return quantity;}
   public int getprice(){return price;}
    
}
