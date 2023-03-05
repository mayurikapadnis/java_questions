public class constructor1 
{
    int h,w,l;
    constructor1()
    {
        h=w=l=2;
    }   
    constructor1(int h, int w)
    {
        this.h=h;
        this.w=w;
    }
    constructor1(int h, int w, int l)
    {
        this.h=h;
        this.w=w;
        this.l=l;
    }
    void volume()
    {
        System.out.println("volume= "+(h*w*l));
    }
    public static void main(String[] args)
    {
        constructor1 c;
        c= new constructor1();
        System.out.println("first:");
        c.volume();
        c= new constructor1(10,20);
        System.out.println("Second:");
        c.volume();
        c= new constructor1(100, 200, 300);
        System.out.println("Third:");
        c.volume();
    }
}
