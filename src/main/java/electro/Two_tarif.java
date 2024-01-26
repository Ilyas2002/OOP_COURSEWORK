package electro;

public final class Two_tarif extends Calc {

	private double indication1, indication2,sum=0;
	
	protected Two_tarif(double indication1,double indication2) {
		this.indication1=indication1;
		this.indication2=indication2;
	}
	
	@Override
	public void getMultiAll() {
		setBaseTarif(2.5);
		sum=mul(indication1,sum);
		setBaseTarif(3.0);
		sum=mul(indication2,sum);
	}
	
	public double getSum() {
		return sum;
	}
	
	public String toString() {
		
		return String.valueOf(getSum())+ " руб.";
	}
	
}
