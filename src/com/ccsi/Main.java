package com.ccsi;

public class Main {

    public static void main(String[] args) {
	    int[] digits={9,2,9,9};
        int[] res=plusOne1(digits);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
    //Given a non-negative number represented as an array of digits,plus one to the number.
    //The digits are stored such that the most significant digit is ate the head of the list.
    //1.该方法直接定义了一个大1的数组，如果最高位没有进位，该方法不完美。
    public static int[] plusOne(int[] digits){
        int c=0,len=digits.length;
        int[] res=new int[len+1];
        res[len]=(digits[digits.length-1]+1)%10;
        c=(digits[digits.length-1]+1)/10;
        int i=len-2;
        while(i>=0||c!=0){
            c+=i>=0?digits[i]:0;
            res[i+1]=c%10;
            c/=10;
            i--;
        }
        return res;
    }
    //2.A better method. 只有等于9的时候才会进位，小于就的时候，数值加一然后返回本数组即可
    public static int[] plusOne1(int[] digits){
        if(digits==null||digits.length==0)return digits;
        for (int i = digits.length-1; i >=0 ; i--) {
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] res=new int[digits.length+1];
        res[0]=1;
        return res;
    }
}
