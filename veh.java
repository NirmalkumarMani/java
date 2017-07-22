interface Moveable 
{
 //int AVGSPEED = 40;
 void move();
}

class veh implements Moveable 
{

 public void move()
 {
  System.out.println("Average speed is"+AVGSPEED);
 }
 
 public static void main (String[] arg)
 {
  veh vc = new veh();
 
  vc.move();
 } 
}