package rmi;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        new MyFrame();
        new Thread().yield();
        Executors.newCachedThreadPool();

    }
}
