package com.bvsahasrabuddhe;

import java.util.ArrayList;

public class JavaOutOfHeapExperiment {
    public static void main(String[] args) {
        ArrayList<Integer> infiniteNumbers = new ArrayList<Integer>();
        int i = 0;
        while(true) {
            infiniteNumbers.add(i++);
            System.out.println(i);
        }
        }
}
