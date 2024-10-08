package Artalia.com.example.MusicBox.UI;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import Artalia.com.example.MusicBox.STATS.constant;

public class MainFrame {
    private BorderLayout borderLayout;
    private JFrame frame;
    private LeftTool leftTool;
    private CentralScreen centralScreen;
    private SearchCard searchFrame;
    
    public MainFrame(){
        frame = new JFrame();
        leftTool = new LeftTool();
        centralScreen = new CentralScreen();
        searchFrame = new SearchCard();
        borderLayout = new BorderLayout();
        borderLayout.setHgap(10);
        borderLayout.setVgap(10);
        
        frame.setTitle("Music box");
        frame.setSize(constant.initializeWidth, constant.initializeHeight);
        frame.setResizable(true);
        frame.setVisible(true);
        frame.setLayout(borderLayout);
        frame.getRootPane().setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.decode(constant.firstColor)));
        frame.getContentPane().setBackground(Color.decode(constant.firstColor));
        frame.setMinimumSize(new Dimension(constant.initializeWidth, constant.initializeHeight));

        searchFrame.addComponent();

        centralScreen.addCard("searchFrame", searchFrame);
        leftTool.setRoundness(30);
        leftTool.addComponent();
        leftTool.setMouseAdapter();
        frame.add(leftTool, BorderLayout.WEST);
        frame.add(centralScreen, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
