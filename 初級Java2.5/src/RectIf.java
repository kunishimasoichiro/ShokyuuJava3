
public class RectIf extends MyFrame {
	public void run() {
		int x=30;
<<<<<<< Updated upstream
		setColor(0,128,0);
		int i;  // 繰り返しに使う変数iを宣言
		for(i=0 ; i<9 ; i++) { // i=0から、i<9の間繰り返す。繰り返すたびにiを1増やす
			if(i>=4 && i<=7) {
				fillRect(x,100,10,100);
			}else {
				fillRect(x,80,10,100);
			}
			x+=20;
=======
		int y=20;
		setColor(0,128,0);
		int i;  // 繰り返しに使う変数iを宣言
		for(i=0 ; i<9 ; i++) {
			fillRect(x,x,y,y);
			x+=y;
			y+=10;
>>>>>>> Stashed changes
		}
	}

}
