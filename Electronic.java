import java.util.Date;

public abstract class Electronic implements Shadow{
	static public long timeMemory;
	static public long timeCalculated;
	static public String storedMark;
	static public String storedCountry;
	static public short amp;
	static public short vlt;
	static public int ext;
	
	public short A(short A){
		amp = A;
		return A;
	}
	public short A(){
		return amp;
	}
	public short V(short V){
		vlt = V;
		return V;
	}
	public short V(){
		return vlt;
	}
	public String Mark(String Mk) {
		storedMark = Mk;
		return Mk;
	}
	public String Mark() {
		return storedMark;
	}
	public String Country(String Ct) {
		storedCountry = Ct;
		return Ct;
		}
	public String Country() {
		return storedCountry;
		}
	public long StartTime(long ST) {
		timeMemory = ST;
		return ST;
	}
	public long StartTime() {
		return timeMemory;
	}
	public long Time(long T) {
		timeCalculated = T;
		return T;
	}
	public long Time() {
		return timeCalculated;
	}
	public int external(int E) {
		ext += E;
		return E;
	}
	public int external() {
		return ext;
	}
	
	public Electronic() {
		this.A((short) 12);
		this.V ((short) 220);
		this.Mark("Samsung Cyclone");
		this.Country("Made in USA");
	}
	
	public boolean TurnMode(short Am, short Vm, boolean button) {
		if(button) { 
			this.A((short) Am);
			this.V ((short) Vm);
			StartTime(System.currentTimeMillis()/1000);
			return true;
		}
		this.A((short) 0);
		this.V ((short) 0);
		Timer(StartTime(), Time());
		return false;
	}
	public boolean TurnMode(short Am, short Vm) {
	if(Am > 0 && Vm > 0) {
		this.A((short) Am);
		this.V ((short) Vm);
		return true;
	}
	return false;
	}
	public boolean TurnMode(boolean button) {
		if(A() > 0 && V() > 0) { 
			this.A((short) 0);
			this.V ((short) 0);
			return false;
				}
		this.A((short) 12);
		this.V ((short) 220);
		return true;
		}
	public long Timer(long StartTime, long Time) {
		Time =  System.currentTimeMillis()/1000 - StartTime();
		return Time;
	}

	public boolean ISUsed(boolean action) {
		if(action) {
			this.A((short) 12);
			this.V ((short) 220);
			return true;
		}
		this.A((short) 5);
		this.V ((short) 24);
		return false;
	}

	public short Voltage(short A, long Time, int Power) {
		return (short) (Power/Time/A);
	}

	public short Amperage(short V, long Time, int Power) {
		return (short) (Power/Time/V);
	}

	public int PowerUsed(short A, short V, long Time) {
		return external((int) Time*A*V/3600);
	}

}
