 abstract class Base
{
    String name;
    String dept;
    abstract String calls();
    
   Base(String name,String dept)
    {
        this.name=name;
        this.dept=dept;
    }
    public void Setname(String name)
    {
        this.name=name;
    }
    public String getname()
    {
        return this.name;
    }
    public void Setdept(String dept)
    {
        this.dept=dept;
    }
   public  String getdept()
    {
        return this.dept;
    }
}
