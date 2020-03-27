
package program;

import entidades.Comment;
import entidades.Posts;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    
    public static void main(String[] args) throws ParseException {
     Locale.setDefault(Locale.US);
     Scanner read = new Scanner (System.in);
     SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
     
     Comment com1 = new Comment("Muito BOM");
     Comment com2 = new Comment("Execelente");
     
     Posts pt1 = new Posts(sdf.parse("15/05/2015 14:55:02")
             ,"Novos Cursos",
             "Alunos terão cursos gratuitos após quarentena",13);
     pt1.addComment(com1);
     pt1.addComment(com2);
     
        System.out.println(pt1.ToString());
     read.close();
    }
    
}
