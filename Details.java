import java.util.ArrayList;
public class Details
{
    public static void main(String [] args)
    {
       
        ArrayList<Integer> arraylist1=new ArrayList<Integer>();
        arraylist1.add(12);
        arraylist1.add(13);
        arraylist1.add(14);

        ArrayList<Integer> arraylist2=new ArrayList<Integer>();
        arraylist2.add(23);
        arraylist2.add(22);
        arraylist2.add(21);
        
        ArrayList<Integer> arraylist3=new ArrayList<Integer>();
        arraylist3.add(1);
        arraylist3.add(2);
        arraylist3.add(3);

        
        ArrayList<Integer> al= new ArrayList<InteghjklklvdFvrgb  `hgjger>();
        al.addAll(arraylist1);
        al.addAll(arraylist2);
        al.addAll(arraylist3);
        for(Integer temp: al){
            System.out.println(temp);
        }
    }
}