package com.rajat.filemanager;

import java.io.File;

/**
 * @author rajatsrivastava
 **/
public class FileManager {
    public void listContents(String directoryPath){
        File directory = new File(directoryPath);
        if (directory.exists() && directory.isDirectory()){
            File[] contents = directory.listFiles();

            if (contents != null){
                for(File file : contents){
                   if (file.isDirectory()){
                       System.out.println("[DIR]: "+file.getName());
                   }else {
                       System.out.println("[FILE]: "+file.getName());
                   }
                }
            } else {
                System.out.println("Directory "+ directory + " is empty");
            }
        } else {
            System.out.println("Invalid directory path: Path either doesn't exist or is not a directory");
        }
    }

    public void createDirectory(String directoryPath){
        File directory = new File(directoryPath);
        if (directory.mkdir()){
            System.out.println("Directory created.");
        }else {
            System.out.println("Failed to create directory.");
        }

    }
    public void deleteFileOrDirectory(String directoryPath){
        File directory = new File(directoryPath);
        if (directory.delete()){
            System.out.println("Directory deleted.");
        }else {
            System.out.println("Failed to delete directory");
        }
    }
}
