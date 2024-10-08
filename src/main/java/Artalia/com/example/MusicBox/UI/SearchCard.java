package Artalia.com.example.MusicBox.UI;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.BoxLayout;
import Artalia.com.example.MusicBox.STATS.constant;

public class SearchCard extends CustomizePanel {
    private SearchPanel searchPanel;
    private DisplayPanel displayPanel;

    public SearchCard(){
        BoxLayout box = new BoxLayout(this, BoxLayout.Y_AXIS);
        searchPanel = new SearchPanel();
        displayPanel = new DisplayPanel();
        setLayout(box);
    }

    public void addComponent(){
        add(searchPanel);
        add(Box.createRigidArea(new Dimension(0, 10)));
        add(displayPanel);
        setBackground(Color.decode(constant.firstColor));

        searchPanel.setMaximumSize(new Dimension(5000, constant.searchPanelHeight));
        searchPanel.addComponent();
        searchPanel.setRoundness(30);
        searchPanel.setBackground(Color.decode(constant.secondColor));
        
        displayPanel.setBackground(Color.decode(constant.secondColor));
        displayPanel.setRoundness(30);
        
        displayPanel.addCard(new SongChip(constant.chipWidth, constant.chipHeight, 30));
        displayPanel.addCard(new SongChip(constant.chipWidth, constant.chipHeight, 30));
        displayPanel.addCard(new SongChip(constant.chipWidth, constant.chipHeight, 30));
        displayPanel.addCard(new SongChip(constant.chipWidth, constant.chipHeight, 30));
        displayPanel.addCard(new SongChip(constant.chipWidth, constant.chipHeight, 30));
        displayPanel.addCard(new SongChip(constant.chipWidth, constant.chipHeight, 30));
        displayPanel.addCard(new SongChip(constant.chipWidth, constant.chipHeight, 30));
        displayPanel.addCard(new SongChip(constant.chipWidth, constant.chipHeight, 30));
        displayPanel.addCard(new SongChip(constant.chipWidth, constant.chipHeight, 30));
    }
}
