import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;

public class program {
   public static void main(String[] args) throws IOException {
      try {
         Scanner scn = new Scanner(System.in);
         System.out.print("Введите число: ");
         Byte res = scn.nextByte();
         String resStr = Byte.toString(res);
         try (FileWriter fw = new FileWriter("result.txt", true)) {
            fw.write(resStr + "\n");
            fw.flush();
            scn.close();
         } catch (IOException ex) {
            System.out.println(ex.getMessage());
         }
      } catch (Exception ex) {
         sLog(ex.toString());
      }
   }

   public static void sLog(String text) throws IOException {
      Logger logs = Logger.getLogger(program.class.getName());
      FileHandler fh = new FileHandler("logs.xml", true);
      logs.addHandler(fh);
      XMLFormatter xml = new XMLFormatter();
      fh.setFormatter(xml);
      logs.log(Level.INFO, (text));
      fh.close();
   }
}
