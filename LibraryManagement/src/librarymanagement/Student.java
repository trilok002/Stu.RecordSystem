/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagement;

import java.awt.Image;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import javax.swing.ImageIcon;


public class Student implements Serializable {
    String enroll;
    String name;
    String branch;
    int sem;
   
    String mobile;
    String college;
   LinkedList<String>books=new LinkedList<String>();
   HashMap<String,String>dofret=new HashMap<String,String>();
   HashMap<String,String>dofisu=new HashMap<String,String>();
    
    ImageIcon img;
    
    void setInfo(String en,String na,String br,int se,String mo,String col,ImageIcon i)
    {
        enroll=en;name=na;branch=br;sem=se;mobile=mo;img=i;college=col;img=i;
    }
    void addBook(String bname,String dissue,String dret)
    {
       books.add(bname);dofret.put(bname,dret);dofisu.put(bname,dissue);
    }
    void removeBook(String bname,String di,String dr)
    {
        books.remove(bname);dofret.remove(bname,dr);dofisu.remove(bname,di);
    }
   String[]  showBook()
    {int x=1;
        ArrayList<String>a=new ArrayList<String>(); 
        for(int i=0;i<books.size();i++)
        {a.add(books.get(i));
            }
        String s[]=new String[books.size()];
        for(int i=0;i<books.size();i++)
        {s[i]=books.get(i)+","+dofisu.get(books.get(i))+","+dofret.get(books.get(i));
            }
        return s;
    }
   
     
            
            
      
      
    
 
 
    
}
