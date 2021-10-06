package com.bvsahasrabuddhe;

class Calculate {
    int multiply(int a, int b){
        return a * b;
    }
    double multiply(double a , double b){
        return a * b;
    }

    public static void main(String[] args) {
        Calculate obj   = new Calculate();
        int c = obj.multiply(5,4);
        double c1 = obj.multiply(5.1, 4.2);
        System.out.println(c);
        System.out.println(c1);

    }

}
