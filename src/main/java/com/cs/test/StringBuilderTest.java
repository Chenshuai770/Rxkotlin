package com.cs.test;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 10; i++) {

            stringBuilder.append(i+",");

        }

        String substring = stringBuilder.substring(0,stringBuilder.length()-1);
        System.out.println(substring);
    }
}
