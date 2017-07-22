import java.util.*;
class Test
{
	interface Yes
	{
		void show();
	}
    interface No extends Yes{
        void show();
    }
}

class Testing implements Test.Yes
{
	public void show()
	{
		System.out.println("show method of interface");
	}
}
class Declare implements Test.No
{
	public void show()
	{
		System.out.println("show method of interface11");
	}
}

class Air
{
	public static void main(String[] args)
	{
		Test.Yes obj;
        Test.No obj1;
		Testing t = new Testing();
        Declare d=new Declare();
		obj=t;
		obj.show();
        obj1=d;
        obj1.show();
	}
}