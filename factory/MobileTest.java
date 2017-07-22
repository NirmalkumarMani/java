class MobileTest
{
    public static void main(String args[])
    {
Mobile mob=MobileFactory.createMobile(Mobile.SAMSUNG);
//mob.Samsung();
System.out.println(mob);
Mobile mob1=MobileFactory.createMobile(Mobile.SONY);
//mob.Samsung();
System.out.println(mob1);
    }
}