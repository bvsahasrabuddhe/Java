package com.bvsahasrabuddhe;

class Base{
    public int x;

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    static class Derived extends Base{
        public int y;

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }


}

public class Inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(3);
        System.out.println(b.getX());


        Base.Derived d = new Base.Derived() ;
        d.setY(6);
        System.out.println(d.getY());
    }
}
