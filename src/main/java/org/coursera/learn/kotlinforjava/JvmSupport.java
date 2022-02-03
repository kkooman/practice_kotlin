package org.coursera.learn.kotlinforjava;

public class JvmSupport {

    public static void main(String[] args) {

        JvmSupportKotlin.getCount();
        JvmSupportKotlin.INSTANCE.getSum();
        JvmSupportKotlin.setSsum(100);
        // 코드 어시스트에 안나오지만 사용이 가능하다.
        JvmSupportKotlin.INSTANCE.setSsum(100);

        JvmSupportKotlin.stickCount = 1;
        System.out.println("stickCount : " + JvmSupportKotlin.stickCount);
        JvmNotSupportKotlin.INSTANCE.getCount();
        System.out.println("종료");
    }
}
