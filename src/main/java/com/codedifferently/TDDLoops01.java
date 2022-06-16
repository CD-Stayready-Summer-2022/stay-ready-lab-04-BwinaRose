package com.codedifferently;


public class TDDLoops01 {
    public String oneToTen(){
        String output ="oneToTen()\n"
                +"*** Output ***";
        for(int x=1; x<=10; x++){
            output += "\n"+x;
        }
        return output;
    }

    public String oddNumbers(){
        String output = "oddNumbers()\n"
                +"*** Output ***";
        for(int x =1; x < 20 ; x+=2){
            output += "\n"+x;
        }

        return output;
    }

    //output numbers 1-25 squared
    public String squares(){
        String output = "squares()\n"
                +"*** Output ***";
        for(int x = 1; x < 26 ; x++){
            output += "\n"+(x*x);
        }

        return output;
    }

    //check if n is even, return string
    public String even(int n){
        String output = "even()\n"
                +"*** Output ***";
        if (n % 2 == 0){
            output += "\n Even!";
        } else {
            output += "\n Not Even!";
        }

        return output;
    }

    //1-100, output # to the power of n
    public String powers(int n){
        String output = "powers()\n"
                +"*** Output ***";
        for(int x = 1; x <= 100 ; x++){
            output += "\n"+(int)(Math.pow(x,n));
        }

        return output;
    }

    public static void main(String[] args) {
        TDDLoops01 loops = new TDDLoops01();
        String output3 = loops.squares();
        System.out.println(output3);
    }
}