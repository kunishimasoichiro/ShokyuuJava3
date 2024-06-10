
public class DisplayCarsTrains extends MyFrame {
	public void run() {
		Vehicle[] Venicles=new Vehicle[3];
		Venicles[0]=new Car(10,30,3,0);
		Venicles[1]=new Car(10,100,5,0);
		Venicles[2]=new Train(10,150,7,0);
		for(int i=0; i<30; i++) {
			clear();
			for(int j=0; j<Venicles.length; j++) {
				Venicles[j].draw(this);
				Venicles[j].move();
			}
			sleep(0.1);
		}
	}

}
