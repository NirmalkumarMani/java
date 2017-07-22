class bike
{
    int speed=50;
}
class vehicle extends bike{
    int speed=100;

void display()
{
    System.out.println(super.speed);

}
public static void main(String args[])
{
    vehicle b=new vehicle();
    b.display();
}
}