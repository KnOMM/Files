package com.company;

import java.io.*;

public class FilePrinter {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\38098\\OneDrive\\Materials\\Java\\2022.07.03_Files\\src\\com\\company\\Main.java");

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

            String line;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            System.out.println("The END!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
