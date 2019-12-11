package tuan4;

import java.util.Random;
import java.util.Scanner;

public class Rand {
    public static void main(String[] args) {
        Random rd = new Random();
        int randomNum = rd.nextInt(100);
        int guess;
        Scanner sc = new Scanner(System.in);
        int count = 0;

        do{
            guess = sc.nextInt();
            if(guess < randomNum)
                System.out.println("So can tim lon hon");
            else
                System.out.println("So can tim nho hon");
            count++;
        }while (count <= 10 && guess != randomNum);

        if(count > 10)
            System.out.println("Ban da thua cuoc");
        else {
            System.out.println("Ban da doan dung! So can tim la: " +randomNum);
        }
    }

}
