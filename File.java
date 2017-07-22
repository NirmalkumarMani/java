import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;  
public class File{  
    public static void main(String args[]){  
        //String num="A";
        //int a; 
         try{    
           FileWriter fw=new FileWriter("D:\\testout.txt");  
           //a=Integer.parseInt(num);  
           //fw.write(a);   
           
           for(int i=0;i<1000;i++)
           {
               fw.append(i + " ");    

              // System.out.println(i);
              for(int j=0;j<490;j++)
              {
              fw.write("\n ");}
              
           }
           fw.close();
          }catch(Exception e){
              System.out.println(e);
            }   
          System.out.println("Success...");    
     }    
}  