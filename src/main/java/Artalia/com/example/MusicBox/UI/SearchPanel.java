package Artalia.com.example.MusicBox.UI;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class SearchPanel extends CustomizePanel {
    private CustomizeJTextField searchField;
    private JButton searchBtn;
    private ImageIcon searchIcon;
    
    public SearchPanel(){
        searchField = new CustomizeJTextField();
        searchBtn = new JButton();
    }

    public void addComponent(){
        searchIcon = new ImageIcon("src\\main\\java\\Artalia\\com\\example\\MusicBox\\UI\\ICONS\\searchIcon.jpg");
        searchField.setPreferredSize(new Dimension(300,25));
        searchField.setRoundness(20);
        searchBtn.setIcon(searchIcon);
        searchBtn.setPreferredSize(new Dimension(25,25));
        add(searchField);
        add(searchBtn);
    }
}
