package electro;

public class Main {
	
	protected static  Gui_main gui;
	public static void main(String[] args) {
		String name = "Калькулятор стоимости производства. Мебель для хранения.";
		String label = "Введите данные необходимые для расчета";
		gui = new Gui_main(name,label);
		
	}

}
