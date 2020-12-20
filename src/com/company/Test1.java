package com.company;

public class Test1 {
    public int a;

    public Test1(int a) {
        this.a = a;
    }

    public Test1 incrByTen(){

        Test1 temp = new Test1(a + 10);
        return temp;


    }
}
