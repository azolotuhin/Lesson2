package com.company;

/**
 * Created by azolotukhin on 14.09.2016.
 */
public class ConnectionManager {

    private static Connection[] con;
    private static int connum = 0;

    ConnectionManager(int connum){
        con = new Connection[connum];
        for (int i = 0; i < connum; i++) {
            con[i] = new Connection(i);
        }
    }

    public static Connection GetConnection(){
        connum++;
        if (connum < con.length + 1){
            return con[connum - 1];
        }
        else {
            return null;
        }
    }
}
