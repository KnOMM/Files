package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("C:\\Users\\38098\\OneDrive\\Materials\\Java\\2022.07.03_Files\\src\\com\\company\\FilePrinter.java");
             FileOutputStream fos = new FileOutputStream("C:\\Users\\38098\\OneDrive\\Materials\\Java\\2022.07.03_Files\\src\\com\\company\\resources\\copy.txt")) {
            int i;
            while ((i = fin.read()) != -1){
                fos.write(i);
            }
            System.out.println("FINISHED!!!");
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
