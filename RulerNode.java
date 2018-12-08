import java.io.IOException;
import java.util.Scanner;

public class RulerNode {
public static String Obj;
public static String Rule;
	public RulerNode() {
		Obj = "Micto";
		Rule = "Info";
	}


	public static void main (String args[ ]) throws IOException
	{
		Electronic CurrentObject = new Electronic();
		Electronic Defmicro = new MicroWave();
		Fridge Deffridge = new Fridge();
		Coffee Defcoffee = new Coffee();
		Hood Defhood = new Hood();
		Toast Deftoast = new Toast();
		TeaKettle Deftea = new TeaKettle();
		Scanner input = new Scanner(System.in);
	for(;;) {
		System.out.println(CurrentObject.Mark());
		System.out.println(Defmicro.Mark());
		System.out.println(Deffridge.Mark());
		System.out.println(Defcoffee.Mark());
		System.out.println(Defhood.Mark());
		System.out.println(Deftoast.Mark());
		System.out.println(Deftea.Mark());
	 try {
		 try {
			 System.out.println ("Specify House object");
			  Obj =  input.next();	//Get Object
		 	} 
		 catch (NullPointerException e) {
			 System.out.println("Incorrect Oject specification");	//Warning
			 input.close();
			 return;
		 	}
		 System.out.println(Obj + " received.");
		 try {
			 System.out.println ("Specify action for object");
			  Rule = input.next();	//Get Action
		 	}
		 catch (NullPointerException e) {
			 System.out.println ("Incorrect action specification»"); //Warning
			 input.close();
			 return;
		 	}
		 System.out.println(Rule + " received.");
	 	}
	 
	 catch (ArrayIndexOutOfBoundsException e) {
		 System.out.println ("Incorrect command sentence");
		 input.close();
		 return;								//Warning message
	 	}
	
	switch(Obj) {
			case "Micro": CurrentObject.Tracer(Defmicro); break;
			case "Fridge": CurrentObject.Tracer(Deffridge); break;
			case "Coffee": CurrentObject.Tracer(Defcoffee); break;
			case "Hood": CurrentObject.Tracer(Defhood); break;
			case "Toast": CurrentObject.Tracer(Deftoast); break;
			case "Kettle": CurrentObject.Tracer(Deftea); break;
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
				switch(Obj) {
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
	switch(Obj) {
	case "Micro": Defmicro.Tracer(CurrentObject); break;
	case "Fridge": Deffridge.Tracer(CurrentObject); break;
	case "Coffee": Defcoffee.Tracer(CurrentObject); break;
	case "Hood":  Defhood.Tracer(CurrentObject); break;
	case "Toast": Deftoast.Tracer(CurrentObject); break;
	case "Kettle": Deftea.Tracer(CurrentObject); break;
		}
	}}
}
