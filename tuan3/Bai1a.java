package tuan3;

import java.util.Scanner;

public class Bai1a {
    public static void main(String[] args){
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        Bai1a ucln = new Bai1a();
        System.out.println(ucln.timUCLN(a, b));
    }

    public int timUCLN(int x, int y){
        int a = Math.abs(x);
        int b = Math.abs(y);

        while (a != b){
            if(a < b)
                b = b - a;
            else
                a = a - b;
        }
        return a;
    }
}

