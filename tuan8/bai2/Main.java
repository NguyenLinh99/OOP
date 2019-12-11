package tuan8.bai2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static double Division(int a, int b) throws ArithmeticException{
        if(b==0) throw new  ArithmeticException();
        return a/b;
    }

    public static void Null(String s) throws NullPointerException{
        if(s==null) throw new NullPointerException();
        System.out.println(s);
    }

    public static void FileWrite(String fileName, String s)throws FileNotFoundException {
        File file = new File(fileName);
        PrintWriter out = new PrintWriter(file);

        out.print(s);
        out.close();
    }

    public static void Number(int x) throws IOException {
        System.out.println(x);
    }

    public static void Array() throws ArrayIndexOutOfBoundsException{
        int[] arr = new int[5];
        arr[10] = 0;
    }

    public static void Class() throws ClassCastException{
        Object x = 3;
        String s = (String)x;
        System.out.println(s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println(Division(2, 0));


        }catch (ArithmeticException e){
            e.printStackTrace();
        }

        try {
            Null(null);
        }catch (NullPointerException e){
            e.printStackTrace();
        }

        try {
            FileWrite("Hello.txt", "Hello!");
        }catch (Exception e){
            e.printStackTrace();
        }

        try {
            int x = sc.nextInt();
            Number(x);
        }catch (IOException e){
            e.printStackTrace();
        }

        try {
            Array();
        }catch (Exception e){
            e.printStackTrace();
        }

        try {
            Class();
        }catch (ClassCastException e){
            e.printStackTrace();
        }
    }
}
