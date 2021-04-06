package com.company;
public class Calculator {
    public  int sum(int a, int b)
    {
        return (a+b);
    }
    public  int multiply(int a, int b)
    {
        return (a*b);
    }
    public  int divide(int a, int b)
    {
        if (b == 0)
        {
            System.out.println("error!division by zero.");
            return 0;
        }
        else
        {
            return a / b;
        }
    }
    public int modulo(int a, int b)
    {
        if (b == 0)
        {
            System.out.println("error!division by zero.");
            return 0;
        }
        else
        {
            return a % b;
        }
    }

    public  double sine(double a)
    {
        return (Math.sin(a));
    }
    public  double cos(double a)
    {
        return (Math.cos(a));
    }
    public  double tan(double a)
    {
        return (Math.tan(a));
    }
}
