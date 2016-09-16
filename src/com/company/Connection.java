package com.company;

/**
 * Created by azolotukhin on 14.09.2016.
 */
public class Connection {

    private String connection = "";

    Connection (int i) {
        System.out.println("Connection attempt #" + i);
    }

    private void ConnectA() {
        System.out.println("Connection established");
    }

    private void ConnectA(String servname) {
        System.out.println("Connection to server " + servname + " established");
    }
}
