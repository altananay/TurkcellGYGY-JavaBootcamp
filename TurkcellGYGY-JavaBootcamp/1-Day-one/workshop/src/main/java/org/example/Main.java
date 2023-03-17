package org.example;

public class Main {
    public static void main(String[] args) {
        int toplam = 0;

        for (int i = 2; i < 1000; i++)
        {
            toplam = 0;
            for (int j = 1; j < i; j++)
            {
                if (i % j == 0)
                {
                    toplam += j;
                }
            }
            if (toplam == i)
            {
                System.out.println(i + " Mükemmel sayıdır.");
            }
        }



    }
}