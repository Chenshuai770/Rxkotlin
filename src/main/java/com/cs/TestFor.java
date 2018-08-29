package com.cs;

import java.util.ArrayList;
import java.util.List;

public class TestFor {
    public static void main(String[] args) {
        int nub0 = 0;
        int nub1 = 1;
        int nub2 = 2;
        int nub3 = 3;
        List<Integer> mList = new ArrayList<>();
        mList.add(nub0);
        mList.add(nub1);
        mList.add(nub2);
        mList.add(nub3);
        int count = 0;
        for (Integer item : mList) {
            System.out.println(">>>"+item);
            System.out.println(count);
            count++;
        }

    }
}
