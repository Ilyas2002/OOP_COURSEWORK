/*
 * 
 */
package electro;

// TODO: Auto-generated Javadoc
/**
 * The Class Calc.
 */
public abstract class Calc {
	
	/** The base tarif. */
	private double baseTarif=3.5;
	
	/**
	 * Mul.
	 *
	 * @param indications the indications
	 * @param sum the sum
	 * @return the double
	 */
	public double mul(double indications, double sum) {
		sum+=baseTarif*indications;
		return sum;
	}
	
	/**
	 * Gets the base tarif.
	 *
	 * @return the base tarif
	 */
	public double getBaseTarif() {
		return baseTarif;	
	}
	
	/**
	 * Sets the base tarif.
	 *
	 * @param tarif the new base tarif
	 */
	public void setBaseTarif(double tarif) {
		this.baseTarif=tarif;
	}
	
	/**
	 * Gets the multi all.
	 *
	 * @return the multi all
	 */
	public void getMultiAll() {

	}


}
