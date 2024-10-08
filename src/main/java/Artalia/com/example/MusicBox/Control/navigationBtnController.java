package Artalia.com.example.MusicBox.Control;

import javax.swing.JComponent;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.event.MouseAdapter;

public class navigationBtnController extends MouseAdapter {
    private JComponent container;
    private Color enterColor;
    private Color exitColor;
    
    public navigationBtnController (JComponent container, Color enterColor, Color exitColor){
        this.container = container;
        this.enterColor = enterColor;
        this.exitColor = exitColor;
        container.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e){

    }

    @Override 
    public void mouseEntered(MouseEvent e){
        container.setBackground(enterColor);
    }

    @Override
    public void mouseExited(MouseEvent e){
        container.setBackground(exitColor);
    }
}
