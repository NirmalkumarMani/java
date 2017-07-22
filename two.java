public class two
{
        public String my_member_variable = "somedata";

        public static void main (String args[])
        {
                two demo = new two();

		
                System.out.println ("This WON'T generate an error" +
                        demo.my_member_variable );
        }
}

