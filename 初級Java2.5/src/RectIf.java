
public class RectIf extends MyFrame {
	public void run() {
		int x=30;
		setColor(0,128,0);
		int i;  // 繰り返しに使う変数iを宣言
		for(i=0 ; i<9 ; i++) {
			fillRect(x,x,10,100);
			x+=20;
		}
	}

}
