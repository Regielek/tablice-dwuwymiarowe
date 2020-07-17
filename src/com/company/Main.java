package com.company;

public class Main
{
    public static void main(String[] args)
    {
        int[][] multTable = new int[12][12];

        for (int a = 1; a <= 10; a++)
        {
            for (int b = 1; b <= 10; b++)
            {
                int Length = multTable.length[a - 1][b - 1] = a * b;
            }
        }

        for (int c = 1; c <= 10; c++)
        {
            System.out.println();
            for (int d = 1; d <= 10; d++)
            {
                int Length2 = multTable.length[c - 1][d - 1];
                System.out.format("%4s", Length2);
            }
        }

    }
}
