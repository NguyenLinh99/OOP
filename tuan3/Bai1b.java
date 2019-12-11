package tuan3;

import java.util.Scanner;

public class Bai1b {
    public static void main(String[] args) {
        Bai1b fb = new Bai1b();
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(fb.fibonaxi(n));
    }

    public int fibonaxi(int n){
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else
            return fibonaxi(n-1)+fibonaxi(n-2);
    }

}
