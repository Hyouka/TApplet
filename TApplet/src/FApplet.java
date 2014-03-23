import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.Timer;


public class FApplet extends JApplet implements ActionListener {
	
	private Timer timer;
	private Game game;

	public void destroy() {
		System.out.println("destroy");
	}

	public void init() {
		
		game = new Game();
		
		timer = new Timer(20, this);
		
		
		setSize(500, 600);
		setLayout(new BorderLayout());
		
		add(game, BorderLayout.CENTER);
		
		System.out.println("init");
	}

	public void start() {
		System.out.println("start");
		
		timer.start();
	}

	public void stop() {
		System.out.println("stop");
		
		timer.stop();
	}

	public void actionPerformed(ActionEvent e) {
		game.update();
	}
	
}
