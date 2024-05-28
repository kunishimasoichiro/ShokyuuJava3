
public class DisplayFaceObject extends MyFrame {
	public void run() {
		Face face1=new Face(25,50);
		face1.x=25;
		face1.y=50;
		face1.draw(this);
		
		Face face2=new Face(200,50);
		face2.x=200;
		face2.y=50;
		face2.draw(this);
		
		Face face3=new Face(100,150);
		face3.x=100;
		face3.y=150;
		face3.draw(this);
	}

}
