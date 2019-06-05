import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Process_example {

   public static void main(String[] args) throws Exception {
	   try{
	   String command="C:\\Users\\HP\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe";
	   
      Runtime r = Runtime.getRuntime();
      Process p = r.exec(command);
     System.out.println(p.getClass()); 
      p.waitFor(10, TimeUnit.SECONDS);
      p.destroy();
      
   }
	   catch(IOException e) {System.out.println("exception"+e);}
}}