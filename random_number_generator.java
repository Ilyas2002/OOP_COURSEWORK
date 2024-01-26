package hello_world;
import java.util.Random;

public class random_number_generator {

	public static void main(String[] args) {
        Random random = new Random();

        // Generate a random number in the range 120 to 180
        int randomNumber = random.nextInt(181 - 120 + 1) + 120;

        System.out.println("Random number: " + randomNumber);
	}

}
