// Bluej project: lesson6/billionaire1
// TODO: Change the program so that it will calculate the number of years
// to reach 1 billion dollars instead of 1 million.
public class WhatDoesThisLoopPrint
{
    public static void main(String[] args)
    {
        int n = 2;
        
        while(n < 1000) {
            n = 10 * n;
            System.out.println(n);
        }
    }
}
