import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Test
{
  public static void main(String args[])
  {
    int[] solutionArray = { 1, 2, 3, 4, 5, 6 };

    shuffleArray(solutionArray);
  }
    static void display(int[] ar)
    {
        for (int i = 0; i < ar.length; i++)
    {
      System.out.print(ar[i] + " ");
    }
    System.out.println();
  }
  static void shuffleArray(int[] ar)
  {
    Random rnd = ThreadLocalRandom.current();
    for (int i = ar.length - 1; i > 0; i--)
    {
      int index = rnd.nextInt(i + 1);
      // Simple swap
      int a = ar[index];
      ar[index] = ar[i];
      ar[i] = a;
    }
    display(ar) ;
  }
}