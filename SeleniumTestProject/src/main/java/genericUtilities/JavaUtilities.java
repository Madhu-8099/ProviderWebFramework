package genericUtilities;

import java.util.Random;

public class JavaUtilities
{
	public int getRandomNumber()
    {
 	   Random ran = new Random();
 	   int random = ran.nextInt(5000);
 	   return random;
    }
}
