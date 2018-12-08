
public interface Shadow {
	public short A(short A);
	public short V(short V);
	public String Mark(String Mark);
	public String Country(String Country);
	public long StartTime(long ST);
	public long Time(long T);
	public int external(int E, boolean c);
	public boolean TurnMode(short A, short V, boolean button);
	long Timer(long StartTime, long Time);
	boolean ISUsed(boolean action);
	public short Voltage(short A, long Time, int Power);
	public short Amperage(short V, long Time, int Power);
	int PowerUsed(short A, short V, long Time);
}
