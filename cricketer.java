class cricketer 
{
 String name;
 String team;
 int age;
 cricketer ()   //default constructor.
 {
  name ="";
  team ="";
  age = 0;
 }
 cricketer(String n, String t, int a)   //constructor overloaded
 {
  name = n;
  team = t;
  age = a;
 }
 cricketer (cricketer ckt)     //constructor similar to copy constructor of c++ 
 {
  name = ckt.name;
  team = ckt.team;
  age = ckt.age;
 }
 public String toString() 
 {
  return "this is " + name + " of "+team;
 }


Class test extends cricketer

{
 public static void main (String[] args)
 {
  cricketer c1 = new cricketer();
  cricketer c2 = new cricketer("sachin", "India", 32);
  cricketer c3 = new cricketer(c2 );
  System.out.println(c2);
  System.out.println(c3);
  c1.name = "Virat";
  c1.team= "India";
  c1.age = 32;
  System .out. print in (c1);
 }
}}