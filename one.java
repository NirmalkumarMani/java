public class one
{
        public  String my_member_variable = "somedata";
        public static void main (String args[])
        {
	            one s=new one();
                System.out.println ("This generates a compiler error" + s.my_member_variable );
        }
}