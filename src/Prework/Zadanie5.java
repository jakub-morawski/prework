package Prework;

public class Zadanie5
{
    public static void main(String[] args)
    {
        int resultsFor = 0;
        for (int i = 1; i <= 10; i++)
        {
            resultsFor += i;
            System.out.println(resultsFor);
        }
        int i = 1;
        int resultsWhile = 0;
        while (i <= 10)
        {
            resultsWhile += i;
            i++;
        }
        {
            System.out.println(resultsWhile);
            resultsWhile++;
        }
    }
}
