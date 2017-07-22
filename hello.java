
class hello


{
 public void eat()
 {
  System.out.println("Generic Animal eating");
 }


class Dog extends hello
{
 public void eat()   //eat() method overriden by Dog class.
 {
  System.out.println("Dog eat meat");
 }
}
static
{
    hello s=new hello();
    s.eat();

}}