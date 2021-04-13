package com.company;

public class pizzaorder {
    private pizza p1;
    private pizza p2;
    private pizza p3;
    public pizza getp1()
    {
        return p1;
    }
    public pizza getp2()
    {
        return p2;
    }
    public pizza getp3()
    {
        return p3;
    }

    public void setPizza1(pizza pizza1)
    {
        p1=pizza1;
    }
    public void setPizza2(pizza pizza2)
    {
        p2=pizza2;
    }
    public void setPizza3(pizza pizza3)
    {
        p3=pizza3;
    }

    public double calcTotal()
    {
        double total=0.0;
        if(p1!=null)
            total=total+p1.calcCost();
        if(p2!=null)
            total=total+p2.calcCost();
        if(p3!=null)
            total=total+p3.calcCost();
        return total;
    }
}


