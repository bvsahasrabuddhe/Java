package com.bvsahasrabuddhe;

class Method_AddNum {
    int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Method_AddNum obj   = new Method_AddNum();
        int c = obj.sum(9,9);
        System.out.println(c);
    }
}