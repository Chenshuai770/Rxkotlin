package com.cs.test;

public class Test1 {
    public static void main(String[] args) {
        String title="http://subway.qimiaowa.com/open/user/c80029d8e66000";
        String[] split = title.split("/");
        System.out.println(split[split.length - 1]);
    }
}
