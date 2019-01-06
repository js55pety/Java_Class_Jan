import java.io.*;

class MyFile {

  public static void main(String[] args) {
      PrintWriter pw = new PrintWriter(args[0]);
      pw.println("Datei erfolgreich angelegt");
      System.out.println("Habe soeben in die Datei geschrieben");
      pw.close();
  }

}
