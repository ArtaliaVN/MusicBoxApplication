package Artalia.com.example.MusicBox;

import javax.swing.SwingUtilities;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import Artalia.com.example.MusicBox.UI.MainFrame;

@SpringBootApplication
public class MusicBoxApplication implements CommandLineRunner {
	
	public static void main(String[] args) { 
		new SpringApplicationBuilder(MusicBoxApplication.class).headless(false).run(args);		
	}

	@Override
	public void run(String[] args){
		SwingUtilities.invokeLater(new Runnable() {
			public void run(){
				new MainFrame();
			}
		});
	}
}
