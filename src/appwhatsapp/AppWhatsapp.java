package appwhatsapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AppWhatsapp implements Serializable{

    public static void main(String[] args) {
        // TODO code application logic here
        JFrameWhatsapp wpp = new JFrameWhatsapp();
        wpp.setIconImage(new ImageIcon("wpp.png").getImage());
        wpp.setLocationRelativeTo(null);
        wpp.setResizable(false);
        wpp.setVisible(true);

    }
    
}
