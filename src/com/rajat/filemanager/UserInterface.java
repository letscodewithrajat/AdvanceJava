package com.rajat.filemanager;

/**
 * @author rajatsrivastava
 **/
public interface UserInterface {
    public void start();
    public void subscriber(UIEventHandler handler);
    public void display(String message);

}
