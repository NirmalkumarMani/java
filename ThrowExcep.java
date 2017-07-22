class ThrowExcep
{
    static void fun() throws ArithmeticException
    {
        try{
            int i=0;
                int a=10/i;
                
               // throw new ArithmeticException("naveen");
               System.out.println("Exception not occured"+a);

            }
        catch (ArithmeticException e) {
            //int i=1;
            //int a=10/i;
            System.out.println("Exception");
        }
        System.out.println("hi");
    }
    public static void main(String args[])
    {
        try
        {
            fun();
        }
        catch(ArithmeticException e)
        {
            System.out.println("caught in main.");
        }
    }
}