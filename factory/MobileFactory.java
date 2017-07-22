class MobileFactory
{
    public static Mobile createMobile(String type)
    {
        if(type.equals(Mobile.SAMSUNG))
        {
            return new Samsung ("raj","xsss");
        }
        else if(type.equals(Mobile.SONY))
        {
            return new Sony ("xperia","ct100");
        
        }
        else if(type.equals(Mobile.IPHONE))
        {
            return new Iphone("fiveS");
        }
        else
        {
            return null;
        }
    } 
}