import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

 public class tastet_tastjeres extends KeyAdapter{
 	
 		public void keyPressed(KeyEvent e){
 		    switch(e.getKeyCode()){
		    	case 39:	// -> Djathtas
		    				//if it's not the opposite direction
		    				if(kontrollerat.directionSnake!=2) 
		    					kontrollerat.directionSnake=1;
		    			  	break;
		    	case 38:	// -> Larte
							if(kontrollerat.directionSnake!=4) 
								kontrollerat.directionSnake=3;
		    				break;
		    				
		    	case 37: 	// -> Majtas
							if(kontrollerat.directionSnake!=1)
								kontrollerat.directionSnake=2;
		    				break;
		    				
		    	case 40:	// -> Poshte
							if(kontrollerat.directionSnake!=3)
								kontrollerat.directionSnake=4;
		    				break;
		    	
		    	default: 	break;
 		    }
 		}
 	
 }
