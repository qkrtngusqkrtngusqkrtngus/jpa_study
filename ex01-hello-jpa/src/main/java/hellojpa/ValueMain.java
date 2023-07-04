package hellojpa;

import java.util.Arrays;

public class ValueMain {

    public static void main(String[] args) {

//        int a = 10; // 기본타입은 절대 공유 X
//        int b = a;

        Integer a = new Integer(10);
        Integer b = a;

//        a.setValue(20); //이렇게 해버리면 a,b공유되기때문에 전부 20으로 찍힘.

        a = 20;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
