import java.util.*;
class exams
{
    public static void main(String arg[])
    {
        ArrayList<String> list=new ArrayList<String>();
        list.add("1");
        list.add("guru");
        list.add("2");
        list.add("3");
        //Iterator it=list.iterator();
        //while(it.hasNext())
       // {
         //   System.out.println(it.next());
       // }
        //list.remove(Integer.valueOf(4));
        //list.add(2,"guru");
       //list.set(1,"hhh");

        //Collections.sort(list);
        //System.out.println(list);
        //list.clear();
       // System.out.println(list);
        //System.out.println(list.contains("guru"));    
        ArrayList<String> copy = (ArrayList<String>) list.clone();
          System.out.println("Cloned ArrayList:"+copy);

       // System.out.println(list);

    }
}