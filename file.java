import java.io.FileReader;
import java.io.FileWriter;

public class file {
 public static void main(String[] args) {
   try
   {
      FileReader fr = new FileReader("input.txt");
      FileWriter fw = new FileWriter("code.txt");

      int i;
      String str="";

      while((i = fr.read()) != -1)
      {
         str += (char)i;
      }
      fw.write(str);
      fr.close();
      fw.close();
   }
   catch (Exception e) {
      // TODO: handle exception
      System.out.println("Exception");
   }
    

 }   
}
