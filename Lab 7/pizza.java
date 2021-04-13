package com.company;

public class pizza {
    String size;
    int nocheesetoppings;
    int nopepperonitoppings;
    int nohamtoppings;
    pizza()
    {
        size="small";
        nocheesetoppings=1;
        nopepperonitoppings=1;
        nohamtoppings=1;
    }
    pizza(String size,int nocheesetoppings,int nopepperonitoppings,int nohamtoppings){
        this.size=size;
        this.nocheesetoppings=nocheesetoppings;
        this.nopepperonitoppings=nopepperonitoppings;
        this.nohamtoppings=nohamtoppings;
    }
    public String getsize()
    {
        return size;
    }
    public void setsize(String size)
    {
        this.size=size;
    }
    public int getnocheesetoppings()
    {
        return nocheesetoppings;
    }
    public void setnocheesetoppings(int nocheesetoppings)
    {
        this.nocheesetoppings=nocheesetoppings;
    }

    public int getnopepperonitoppings()
    {
        return nopepperonitoppings;
    }
    public void setnopepperonitoppings(int nopepperonitoppings)
    {
        this.nopepperonitoppings=nopepperonitoppings;
    }

    public int getnohamtoppings()
    {
        return nohamtoppings;
    }
    public void setnohamtoppings(int nohamtoppings)
    {
        this.nohamtoppings=nohamtoppings;
    }
    public double calcCost(){
        double cal=0.0;
        if(size.equals("small"))
            cal=10+(2*nocheesetoppings)+(2*nopepperonitoppings)+(2*nohamtoppings);
        else if(size.equals("medium"))
            cal=12+(2*nocheesetoppings)+(2*nopepperonitoppings)+(2*nohamtoppings);
        else if(size.equals("large"))
            cal=14+(2*nocheesetoppings)+(2*nopepperonitoppings)+(2*nohamtoppings);
        return cal;
    }
    public String getDescription()
    {
        System.out.println("The size of pizza is: "+size+"\nThe number of cheese toppings is: "+nocheesetoppings);
        System.out.println("The number of pepperoni toppings is: "+nopepperonitoppings+"\nThe number of ham toppings is: "+nohamtoppings);

        return null;
    }
}


}
