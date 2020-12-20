package com.company;

public class test {
    int a,b;

    public test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public boolean equals(test o){
        if (o.a == a && o.b == b){
            return true;
        }
        else {
            return false;
        }
    }
}
