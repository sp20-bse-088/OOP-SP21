
public class Computer {
    protected  int WordSize;
    protected int MemorySize;
    protected int StorageSize;
    protected int Speed;
    
        public Computer()
            {
       
            }
        public Computer(int w,int m,int st,int sp)
            {
                WordSize=w;
                 MemorySize=m;
                StorageSize=st;
                Speed=sp;
            }
    
        public void display()
            {
                System.out.println(WordSize+" "+MemorySize+" "+StorageSize+" "+Speed);
            }
    
}
