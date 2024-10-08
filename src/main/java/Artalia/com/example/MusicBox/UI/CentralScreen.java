package Artalia.com.example.MusicBox.UI;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JComponent;
import Artalia.com.example.MusicBox.STATS.constant;

public class CentralScreen extends CustomizePanel {
    
    public CentralScreen(){
        setLayout(new CardLayout());
        setBackground(Color.decode(constant.firstColor));
    }

    public void addCard(String cardName, JComponent cardPanel){
        add(cardName, cardPanel);
    }
}
