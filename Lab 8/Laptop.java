
public class Laptop extends Computer{
    int length;
    int width;
    int height;
    int weight;
    
        public  Laptop()
        {
           super(); 
        }
        public Laptop(int w,int m,int st,int sp,int l,int wid,int hei,int weigh)
        {
            super(w,m,st,sp);
            length=l;
            width=wid;
            height=hei;
            weight=weigh;
            
        }
    @Override
        public void display()
        {
            super.display();
            System.out.println(length+" "+width+" "+height+" "+weight+" ");
        }
    
}
