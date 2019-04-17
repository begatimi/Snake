import java.util.ArrayList;
import java.awt.Color;

public class dizajni {

	
	//array qe mbushet me ngjyra
	ArrayList<Color> C =new ArrayList<Color>();
	int color; //2: snake , 1: food, 0:empty 
	paneli vendosja;
	public dizajni(int col){
		
		//caktimi i ngjyrave te elementeve
		C.add(Color.green);//0
		C.add(Color.red);    //1
		C.add(Color.black);   //2
		color=col;
		vendosja = new paneli(C.get(color));
	}
	public void lightMeUp(int c){
		vendosja.ChangeColor(C.get(c));
	}
}
