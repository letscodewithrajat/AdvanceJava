package com.rajat.filemanager;

/**
 * @author rajatsrivastava
 **/
public interface UIEventHandler {
    public void onList(String path);
    public void onCreate(String path);
    public void onDelete(String path);
}
