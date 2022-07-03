package com.company;

import java.io.File;

public class DirectoryFilesPrinter {
    public static void main(String[] args) {
        File files = new File("C:\\Users\\38098\\OneDrive\\Materials\\Java\\2022.07.03_Files");
        printNames(files);
    }

    public static void printNames(File file){
        File[] files = file.listFiles();
        if (files.length == 0) System.out.println("The file doesn't exist or is empty");
        else {
            for (File f:files) {
                if (f.isDirectory()) {
                    System.out.println("Directory name - "+f.getName()+", path - "+f.getPath()+" --> ");
                    printNames(f);
                    //System.out.println();
                }
                else System.out.println("File name - "+f.getName()+", path - "+f.getPath());
                System.out.print("<-- ");
            }
        }
    }
}
