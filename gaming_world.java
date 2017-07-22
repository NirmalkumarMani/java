import java.util.*;
class gaming_world
{
    String game_methods="ARCADE";
    int no;
List<gaming_world> type;
List<platform> platforms;
String types;
gaming_world(String types,List<platform> platforms)
{
this.types=types;
this.platforms=platforms;
}
String get_category()
{

    return types;
}
List<platform> display()
{
    return platforms;
}
gaming_world(int no)
{
this.no=no;
}
int serial_no()
{
    return no;
}
String gname()
{
    return game_methods;
}
public String toString()
{
    return no+"   "+types;
}
public static void main(String args[])
{


}

}