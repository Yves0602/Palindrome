package com.xiedaimala.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print("请输入："+"\n");
        Scanner reader = new Scanner(System.in);
        String s = reader.nextLine();
        System.out.print(solution(s));
    }
    public static boolean solution(String s){
        char[] a = s.toCharArray();
        int i = 0;
        int j = a.length-1;
        while (i<j){
            if(a[i] != a[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
