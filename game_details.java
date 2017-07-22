import java.util.*;
class game_details
{
String g_Name;
float g_Price;
String platforms;
game_details(String g_Name,float g_Price,String platforms)
{
this.g_Name=g_Name;
this.g_Price=g_Price;
this.platforms=platforms;
}
String game_Name()
{

    return g_Name;
}
float game_Price()
{

    return g_Price;
}
public String toString()
{
    return g_Name+" "+g_Price+" "+platforms+"";
}
public static void main(String args[])
{



}
}
