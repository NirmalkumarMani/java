class Exceptiontest
{
     public static void main(String[] args) {
        
            try{
                int a=10/0;
                System.out.println("Exception not occured");

            }
        catch (Exception e) {
            System.out.println("Exception"+e);
        }
        
        System.out.println("other statement");
     
     

    }
}