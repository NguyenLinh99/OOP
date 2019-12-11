package tuan4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileText {
    public static void main(String[] args) {
        File f = new File("file.txt");
        String data;
        try {
            Scanner sc = new Scanner(f);
            while (sc.hasNext()){
                data = sc.next();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("error");
        }

    }
}

