public class Samsung implements Mobile
{
    String name,modelno;
    Samsung(String name,String modelno)
    {
        this.name=name;
        this.modelno=modelno;
    }
    public String toString()
    {
    return name+""+modelno;
}
}