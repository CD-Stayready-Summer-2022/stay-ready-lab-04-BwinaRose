package com.codedifferently;

import java.io.OutputStream;

public class WuBuzz {
    /**
     * Write a short program that prints each number from 1 to n on a new line.
     *
     * For each multiple of 3, print "Wu" instead of the number.
     *
     * For each multiple of 5, print "Tang" instead of the number.
     *
     * For numbers which are multiples of both 3 and 5, print "WuTang Forever" instead of the number.
     * Example :
     * 1
     * 2
     * Wu
     * 4
     * Tang
     * Wu
     * 7
     * 8
     * Wu
     * Tang
     * 11
     * Wu
     * 13
     * 14
     * WuTangForever
     */

    public String wuTangClan(int n){
        String output = "";
        for (int i = 1; i<=n;i++){
            if (i % (5*3) == 0) {
                output += "WuTang Forever\n";
            }
            else if (i % 5 == 0){
                output += "Tang\n";
            }
            else if (i % 3 == 0){
                output += "Wu\n";
            } else {
                output += i + "\n";
            }
        }
        return output;
    }
}
