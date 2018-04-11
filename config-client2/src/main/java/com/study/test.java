package com.study;

/**
 * Created by jj-ly on 2017/11/14.
 */

class helloA {
    public void helloA() {
        System.out.println("helloA");
    }

    {
        System.out.println("i am class A");
    }

    static {
        System.out.println("static a");
    }
}

public class test extends helloA {
    public void helloB() {
        System.out.println("helloB");
    }

    {
        System.out.println("i am class B");
    }

    static {
        System.out.println("static B");
    }

    public static void main(String[] args) {
        System.out.println("-------main start-------");
        new test();
        new test();
        System.out.println("-------main end-------");
        System.out.println();
        System.out.print();

    }
}
