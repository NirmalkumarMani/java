import java.util.*;
class platform
{
String category;
List<game_details> platform_games;
platform(String category,List<game_details> platform_games)
{
this.category=category;
this.platform_games=platform_games;
}
List<game_details> get_game()
{
    return platform_games;
}
String get_plat()
{
return category;
}
public String toString()
{
    return category+"    "+platform_games+" ";
}
public static void main(String args[])
{
gaming_world g=new gaming_world(01);
System.out.println(g.serial_no()+" "+g.gname());
}
}