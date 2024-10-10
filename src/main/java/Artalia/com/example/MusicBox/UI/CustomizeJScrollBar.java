package Artalia.com.example.MusicBox.UI;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JScrollBar;

public class CustomizeJScrollBar extends JScrollBar{
    public CustomizeJScrollBar(){
        setUI(new CustomizeJScrollBarUI());
        setPreferredSize(new Dimension(8,8));
        setForeground(new Color(48,144,216));
        setBackground(Color.WHITE);
    }
}
