
/**
 * 
 * @author tejaswini
 *
 */
package softwareDesign;
public class truck {
	/*
	 * declaration of variables
	 */
    private int axel;
	private int weight;
	private static int total;
	private static int obtainedWeight ;  //this variable is to store weights which are obtained from truck class
	private static int obtainedAxel;     //this variable is to store weights which are obtained from truck class
	private static int trucks;

	public int getAxel() {
		return axel;
	}

	public void setAxel(int axel) {
		this.axel = axel;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	/*
	 * this method is used to calculate tool using information which is obtained from trucks child classes
	 */
	public int calculateToll(truck truck) {
		int cash;
		int updatedweight;
		obtainedWeight= truck.getWeight();
		obtainedAxel= truck.getAxel();
		updatedweight = obtainedWeight / 1000;
		cash = (obtainedAxel * 5) + (updatedweight * 10);
		total = total + cash;
		trucks = trucks + 1;
		return cash;

	}
	/*
	 * This method is used to display trucks information
	 */

	public void displayData(int cash) {
		System.out.println("\nTruck arrival-Axels:" + obtainedAxel + "\t" + "total weight" + obtainedWeight + "\t" + "toll due:" + cash);
	}
	/*
	 * This method is used to display total cash collected in that booth.
	 */

	public void totaldisplay() {
		System.out.println("*** Collecting receipts  ***");
		System.out.println("Totals since the last collection - Receipts:" + total + "\t" + "Trucks:" + trucks);

	}
    /*
     * this method is used to rest totalcash collected in that booth and no of trucks passed through that booth by the time worker leaves the booth. 
     */
	public void reset() {
		total = 0;
		trucks = 0;
	}

}
