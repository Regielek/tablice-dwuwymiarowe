package com.company;

public class Main
{
    public static void main(String[] args)
    {
        int[][] multTable = new int[100][100];

        int j = multTable.length;

        for (int a = 1; a <= j; a++)
        {
            int y = multTable[a - 1].length;

            for (int b = 1; b <= y; b++)
            {
                multTable[a - 1][b - 1] = a * b;
            }
        }

        for (int c = 1; c <= j; c++)
        {
            int y = multTable[c - 1].length;
            System.out.println();
            for (int d = 1; d <= y; d++)
            {
                System.out.format("%6s", multTable[c - 1][d - 1]);
            }
        }

    }
}
