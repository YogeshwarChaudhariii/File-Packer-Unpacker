    import java.io.*;  
    class Filewritebuffer
{  
     public static void main(String args[])throws Exception
{  
       FileOutputStream fout=new FileOutputStream("f1.txt");  
       BufferedOutputStream bout=new BufferedOutputStream(fout);  

       String s="Marvellous";  
       byte b[]=s.getBytes();  
       bout.write(b);  
      
       bout.flush();  
       bout.close();  
       fout.close();  
     }  
    }   