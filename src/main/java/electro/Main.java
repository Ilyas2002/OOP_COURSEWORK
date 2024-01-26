package electro;

public class Main {
	
	protected static  Gui_main gui;
	public static void main(String[] args) {
		String name = "Калькулятор электроэнергии";
		String label = "Введите данные необходимые для расчета";
		gui = new Gui_main(name,label);
		
	}

}
