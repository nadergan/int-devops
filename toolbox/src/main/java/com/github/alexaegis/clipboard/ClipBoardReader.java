package com.github.alexaegis.clipboard;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;

public class ClipBoardReader {
    public static String readFromClipBoard() {
        String result = "";
        try {
            result = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}