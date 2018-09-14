package softwareDesign;

/**
 * 
 * @author tejaswini
 *
 */
public class Fordtruck extends truck {

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

	public Fordtruck(int i, int j) {
		this.axel = i;
		this.weight = j;
	}

	private int axel;
	private int weight;

}
