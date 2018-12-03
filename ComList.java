
public class ComList {

	public ComList() {
	}
	public static void ListInfo(Electronic AnObject) {
		System.out.println(AnObject.Mark());
		System.out.println(AnObject.Country());
		OutChanged(AnObject);
		System.out.format("Current Power = %d\n",
				AnObject.PowerUsed(AnObject.A(), AnObject.V(),
				AnObject.Time()));
		System.out.format("Working duration = %d\n",
				AnObject.Timer(AnObject.StartTime(), AnObject.Time()));
	}
	public static void OutChanged(Electronic AnObject) {
		System.out.format("Current Voltage = %d\n", AnObject.V());
		System.out.format("Current Amperage = %d\n", AnObject.A());
	}
	

}
