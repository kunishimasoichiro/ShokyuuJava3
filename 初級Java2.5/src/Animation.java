
public class Animation extends MyFrame {
	public void run() {
		int x=30;
		while(x<=170) {
			clear();
			setColor(0,128,0);
			fillOval(x,100,100,100);
			x+=20;
			sleep(1);
		}
	}

}
