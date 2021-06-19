package com.fju;

import java.io.*;

public class ReadFile {
    public ReadFile print() {
        try {
            FileInputStream fi = new FileInputStream("menu.txt");
            InputStreamReader ir = new InputStreamReader(fi);
            BufferedReader br = new BufferedReader(ir);
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (
                IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}