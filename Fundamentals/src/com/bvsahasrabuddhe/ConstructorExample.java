package com.bvsahasrabuddhe;

class Customer{
    int cid;
    String cname;
    long cnumber;
    public Customer(){
        cname ="Rohit";
    }
    public Customer(int cid){
        this();
        this.cid= cid;
    }
    public Customer(int cid, String cname, long cnumber){
        this(cid);
    }
    public int getCid(){
        return cid;
    }
    public String getCname(){
        return cname;
    }

    public long getCnumber() {
        return cnumber;
    }
}

public class ConstructorExample {

    public static void main(String[] args) {
        Customer c1 = new Customer(102, "Vishal", 985712222L);
        System.out.println(c1.getCid());
        System.out.println(c1.getCname());
        System.out.println(c1.getCnumber());
    }
}
