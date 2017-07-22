public class Sony implements Mobile
{
    String name,itemno;
    Sony(String name,String itemno)
    {
        this.name=name;
        this.itemno=itemno;
    }
     public String toString()
    {
    return name+""+itemno;
    }
}