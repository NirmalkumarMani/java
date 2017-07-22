class employee
{
    int eid;
    String name;
 static String company_name ="StudyTonight";
    public void show()
    {
        System.out.println(eid+" "+name+" "+company_name);
    }
    public static void main( String[] args )
    {
     employee se1 = new employee();
     se1.eid = 104;
     se1.name = "Abhijit";
    //se1.company_name="kgisl";
     se1.show();
     employee se2 = new employee();
     se2.eid = 108;
     se2.name = "ankit";
     se2.company_name="kgfsl";
     se2.show();
      employee se3 = new employee();
     se3.eid = 108;
     se3.name = "ankit";
     //se3.company_name="hcl";
     se3.show();
    }

}