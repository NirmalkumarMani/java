class hellooo
{
    public void eat()
    {
        System.out.println("animal");

    }
    class dog extends hellooo{
        public void eat()
        {
            System.out.println("dog");
        }
    }
    public static void main(String args[])
    {
        hellooo s=new hellooo();
        s.eat();

    }
}