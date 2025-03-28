package com.rajat.filemanager;

import java.io.File;

/**
 * @author rajatsrivastava
 **/
public class FileApp implements UIEventHandler{
    FileManager fileManager;

    public FileApp() {
        fileManager = new FileManager();
    }

    public static void main(String[] args) {
        UserInterface ui = new TextBasedInterface();
        ui.subscriber(new FileApp());
        ui.start();
    }

    @Override
    public void onList(String path) {
    this.fileManager.listContents(path);
    }

    @Override
    public void onCreate(String path) {
        this.fileManager.createDirectory(path);
    }

    @Override
    public void onDelete(String path) {
        this.fileManager.deleteFileOrDirectory(path);
    }
}
