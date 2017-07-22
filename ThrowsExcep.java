class ThrowsExcep
{
    static void fun() 
    {
        System.out.println("Inside fun(). ");
        throw new NullPointerException("demo");
    }
    public static void main(String args[])
    {
        try
        {
            fun();
        }
        catch(NullPointerException e)
        {
            System.out.println("caught in main.");
        }
    }
}
