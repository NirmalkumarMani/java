class hellos{
 static int num=100;
   static String mystr;
   //First Static block
   static{
      System.out.println("Static Block 1");
    num = 68;
      mystr = "Block1";
  } 
  //Second static block
  static{
      System.out.println("Static Block 2");
     num = 98;
      mystr = "Block2";
  }
   static{
      System.out.println("Static Block 3");
      num = 555;
      mystr = "Block3";
  }
   public static void main(String args[])
  {
      System.out.println("Value of num="+num);
      System.out.println("Value of mystr="+mystr);
   }
}