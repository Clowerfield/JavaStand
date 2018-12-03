import java.io.IOException;
import java.util.Scanner;

public class RulerNode {
public static String Object;
public static String Rule;
	public RulerNode() {
		Object = "Micto";
		Rule = "Info";
	}
public static Electronic CurrentObject;
public static MicroWave defmicro = new MicroWave();
public static Fridge deffridge = new Fridge();
public static Coffee defcoffee = new Coffee();
public static Hood defhood = new Hood();
public static Toast deftoast = new Toast();
public static TeaKettle deftea = new TeaKettle();

	public static void main (String args[ ]) throws IOException
	{
		Scanner input = new Scanner(System.in);
	for(;;) {
	 try {
		 try {
			 System.out.println ("Specify House object");
			  Object =  input.next();	//Get Object
		 	} 
		 catch (NullPointerException e) {
			 System.out.println("Incorrect Oject specification");	//Warning
			 return;
		 	}
		 System.out.println(Object + " received.");
		 try {
			 System.out.println ("Specify action for object");
			  Rule = input.next();	//Get Action
		 	}
		 catch (NullPointerException e) {
			 System.out.println ("Incorrect action specification»"); //Warning
			 return;
		 	}
		 System.out.println(Rule + " received.");
	 	}
	 catch (ArrayIndexOutOfBoundsException e) {
		 System.out.println ("Incorrect command sentence");
		 return;								//Warning message
	 	}
	switch(Object) {
			case "Micro": CurrentObject = defmicro; break;
			case "Fridge": CurrentObject = deffridge; break;
			case "Coffee":  CurrentObject = defcoffee; break;
			case "Hood":  CurrentObject = defhood; break;
			case "Toast": CurrentObject = deftoast; break;
			case "Kettle":  CurrentObject = deftea; break;
			default : 
				{
					System.out.println("Not Enabled Object");
					 return;
				}
		}
	switch(Rule) {
			case "Info": ComList.ListInfo(CurrentObject); break;
			case "TurnOn": {
				CurrentObject.TurnMode(true);
				ComList.OutChanged(CurrentObject);
			}; break;
			case "TurnOff": {
				CurrentObject.TurnMode(false);
				ComList.OutChanged(CurrentObject);
			}; break;
			case "Sleep": {
				CurrentObject.ISUsed(false);
				ComList.OutChanged(CurrentObject);
			}; break;
			case "Force": {
				CurrentObject.ISUsed(true);
				ComList.OutChanged(CurrentObject);break;
			}
			case "New": {
				switch(Object) {
				case "Micro": CurrentObject = new MicroWave(); break;
				case "Fridge": CurrentObject = new Fridge(); break;
				case "Coffee":  CurrentObject = new Coffee(); break;
				case "Hood":  CurrentObject = new Hood(); break;
				case "Toast": CurrentObject = new Toast(); break;
				case "Kettle":  CurrentObject = new TeaKettle(); break;
				};break;
			}
			default :
			{
				System.out.println("Not Enabled Command");
				 return;
			}
		}
	switch(Object) {
	case "Micro": defmicro = (MicroWave) CurrentObject; break;
	case "Fridge": deffridge = (Fridge) CurrentObject; break;
	case "Coffee": defcoffee = (Coffee) CurrentObject; break;
	case "Hood":  defhood = (Hood) CurrentObject; break;
	case "Toast": deftoast = (Toast) CurrentObject; break;
	case "Kettle": deftea =  (TeaKettle) CurrentObject; break;
		}
	}}
}
