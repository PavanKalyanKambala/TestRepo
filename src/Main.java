public class Main
{
    int a=10;
    static int b = 20;
    public static void main(String[] args)
    {
        Main m = new Main();
        m.yes();
        System.out.println(m.a);
        System.out.println(b);
        System.out.println("pavan");
    }
    public void yes(int... c)
    {
        System.out.println(a);
        System.out.println(b);
    }
}
