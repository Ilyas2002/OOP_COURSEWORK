//import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;

import java.util.Random;

public class RandomGenerate {
	
	public int RandomNext() {
		Random random = new Random();
		return random.nextInt(100);
		}

}

class RandomFill
{
	protected static RandomGenerate RandomN;
	public static void main(String[] args) {
	int[] array = new int[13];

     // Generate random numbers for the array
     for (int i = 0; i < array.length; i++) {
    	 RandomN = new RandomGenerate();
         array[i] = RandomN.RandomNext();
         System.out.println(array[i]);
     }
     
	}
}