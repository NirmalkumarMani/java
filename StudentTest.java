class StudentTest
{
String name;
int rollno;
int Age;

public String getName() {
        return name;
    }
public int getrollno() {
        return rollno;
    }
    public int getAge() {
        return Age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setrollno(int rollno) {
        this.rollno =rollno;
    }
    public void setAge(int Age) {
        this.Age =Age;
    }

//public void displayName(){
//System.out.println(getName());
//if(x) System.out.println("go on");
//}

public String toString() {
    return "StudentTest [name=" + name + ", rollno=" + rollno + ", Age=" + Age + "]";
}




public static void main(String args[]){
StudentTest std=new StudentTest();
std.setName("kane");
std.setrollno(12);
std.setAge(1);
//std.displayName();
System.out.println(std.getName());
System.out.println("rollno is="+std.getrollno());
System.out.println("age is="+ std.getAge());
StudentTest std1=new StudentTest();
std1.setName("undertaker");
std1.setrollno(12);
std1.setAge(5);
//std1.displayName();
System.out.println(std1.getName());
System.out.println(std1.getrollno());
System.out.println(std1.getAge());

}}