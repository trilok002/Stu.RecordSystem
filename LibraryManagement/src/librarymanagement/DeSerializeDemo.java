/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagement;


 

    
import java.io.*;
class Student1 implements Serializable
 { int sno , marks ;
   String sname;
   String branch;
   public Student1(int a , int b , String c , String d) 
          {
          sno = a ; marks = b ; sname = c ; branch = d ;
          }
   public void show()
         {
         System.out.println(""+sno+"  "+sname+"   "+branch+"  "+marks);
         } 
 }
/*
public class SerializeDemo
{public static void main(String [] args)
   { Student1 s1 = new Student1(101,275,"RajVeer", "E&C");
     Student1 s2 = new Student1(205,260,"Amit", "Civil");
    Student1 s3 = new Student1(301,250,"Manav", "Mech");
     try
      {  FileOutputStream fos = new FileOutputStream("stud.txt",true); // "stud.txt" created in current working directory
         ObjectOutputStream out = new ObjectOutputStream(fos);
         out.writeObject(s1); // serialization done in "stud.txt" file
         out.writeObject(s2); // serialization done in "stud.txt" file
         out.writeObject(s3); // serialization done in "stud.txt" file
         out.close();
         fos.close();
         System.out.printf("Serialized data is saved in stud.txt  file");
      }catch(IOException i)
      {
          i.printStackTrace();
      }
   }
 }*/



public class DeSerializeDemo
{  public static void main(String [] args)throws IOException , Exception
    { Student1 temp=null;
       FileInputStream fis = new FileInputStream("stud.txt");
         ObjectInputStream in = new ObjectInputStream(fis);
      try
       {
         while(true)
              {
              if(fis.available()>0 )
                 {
                 temp = (Student1)in.readObject();
                 temp.show();
                 }
              else
                     break;
               }
       
      }
       catch(IOException i)
       { i.printStackTrace();
         return;
       }catch(ClassNotFoundException c)
         {
         System.out.println("Student class not found");
         c.printStackTrace();
         return;
      }
       in.close();
       fis.close();
  
    }
}




