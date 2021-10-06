package com.bvsahasrabuddhe;

class Method_AddNum {
//    int sum(int a, int b) {
//        return a + b;
//    }
static void Multiplication(int n) {
    for (int i = 1; i <= 10; i++) {
        System.out.format("%d x %d = %d\n", n, i, n * i);
    }

}
    public static void main(String[] args) {
//        Method_AddNum obj   = new Method_AddNum();
//        int c = obj.sum(9,9);
//        System.out.println(c);
        Multiplication(5);
    }
}