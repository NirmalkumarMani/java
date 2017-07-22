class methodacess
{   
    public void m()
    {
        System.out.println("m method");
    }
    public void n()
    {
        System.out.println("n method");
        m();
    }
    public static void main(String args[])
    {
        methodacess a=new methodacess();
        a.n();
    }
}