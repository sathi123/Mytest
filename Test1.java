import java.io.File;
import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {

     int txtCount=0,exeCount=0, shCount=0, javaCount=0;
     Scanner sc=new Scanner(System.in);  
     String extension = "";
     System.out.println("Enter the Path for Directory/Folder Name");  
     String Directory=sc.nextLine(); 
     System.out.println("Your Directory/folder is :"+Directory);

     File f = new File(Directory);

     int countFiles = 0;
     int countDirectory=0;
     for (File file : f.listFiles()) {
             if (file.isFile()) {
                     countFiles++;
               String name = file.getName();
             
               String as=name.substring(name.lastIndexOf('.') +1);   

             switch(as) {
         case "txt" :
            txtCount++;
            break;  
         case "java" :
            javaCount++;
            break;
         case "exe" :
            exeCount++;
            break;
         case "sh" :
            shCount++;
            break;
         default :
            System.out.println("");
      }

     }

     

    }

 System.out.println("Extension   "+txtCount);
      System.out.println("Extension   "+javaCount);
      System.out.println("Extension   "+exeCount);
      System.out.println("Extension   "+shCount);
     
    

}
}
