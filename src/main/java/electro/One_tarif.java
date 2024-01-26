package electro;

public final class One_tarif extends Calc {

	private double sum=0;
	
	protected One_tarif(double indication1) {
		sum=mul(indication1,sum);
	}
	
	public double getSum() {
		return sum;
	}
	
	public String toString() {
		
		return String.valueOf(getSum())+ " руб.";
	}
	

}
