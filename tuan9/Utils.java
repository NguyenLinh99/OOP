package tuan9;

import java.io.*;
import java.util.Scanner;

public class Utils {
    public static File f = new File("");
    public static String readContentFromFile(String path) {
        f = new File(path);
        String data;
        try {
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                data = sc.nextLine();
                System.out.println(data);
            }
            return "true";
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("error");
            return "false";
        }
    }

    public static void writeContentToFile(String path){
        try {
            f = new File("path");
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("hello");
            bw.close();
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("false");
        }

    }

    public static void writeContentToFile1(String path){
        try {
            f = new File("path");
            FileWriter fw = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("hello");
            bw.close();
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("false");
        }

    }

    public static File findFileByName(String folderPath, String fileName){
        f = new File(folderPath);
        File file = null;
        String[] nameFile = f.list();
        for(int i=0; i<nameFile.length; i++){
            if(nameFile[i].contains(fileName)){
                file = new File(folderPath+":\\"+nameFile[i]);
            }
        }
        return file;

    }

    public static void main(String[] args) {
        readContentFromFile("file.txt");
        writeContentToFile("file.txt");
        readContentFromFile("file.txt");
        writeContentToFile1("file.txt");
        if(findFileByName("D:\\java", "hello")!=null)
            System.out.println("found");
        else
            System.out.println("not found");
    }



}
