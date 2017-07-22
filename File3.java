 import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;  
 class File3
 {
 public static void main(String[] args)
   {
       try
       {
           File fac = new File("D:\\testout.txt");
           if (!fac.exists())
           {
               fac.createNewFile();
           }
           System.out.println("The file has been created.");
           int r = 1;
           FileWriter write = new FileWriter(fac);
           write.write("");
           for (int i = 1; i<=100; i++)
           {
               r = r * i;
               write.append(r + "\n");
           }

           write.flush();
            write.close();
       }
       catch (IOException e)
       {
           e.printStackTrace();
       }
   }
 }