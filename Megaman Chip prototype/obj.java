
import java.io.*;
import java.text.SimpleDateFormat; 
import java.util.*;

import java.nio.file.Files;


public class obj {
  public static Hashtable <Integer,Chips> hash = new Hashtable<Integer,Chips>();
  public static String arr[];
  private static byte[] data = new byte[4000];
  public obj(int num){
      
  }
  public static void main(String [] args){

    if(hash.size()>=30){
      System.out.println("sorry your folder has exceeded the maximum amount of chips");
    }
    
    Scanner sc = new Scanner (System.in);
    
    System.out.println("what is the Chips name");
    String name = sc.nextLine();
    
    System.out.println("What is the Chips damage");
    int damage = sc.nextInt();
    
    System.out.println("What is the Chips letter");
    String letter = sc.nextLine();
    
    System.out.println("What is the element of the chip");
    String element = sc.nextLine();
    
    System.out.println("What is the type of the chip");
    String type = sc.nextLine();
    Chips chip = new Chips(name,damage,element,type);
    //System.out.println(chip.toString());
    try {
      FileInputStream is = new FileInputStream("Customer.dat");
      ObjectInputStream ois = new ObjectInputStream(is);
      Customer emp = (Customer) ois.readObject();
      ois.close();
      is.close();
      System.out.println(emp.toString());
    } catch (ClassNotFoundException | IOException e) {
      e.printStackTrace();
    }




    //BufferedReader br = new BufferedReader(new FileReader("chips.dat"));

    

    try{
      BufferedReader br = new BufferedReader(new FileReader("chips.dat"));
      String line =null;
      int i =0;
      //System.out.println(lines);
      while((line= br.readLine()) != null){
        System.out.println(Chips.chipName);
        //System.out.println(line);
        //hash.put(i,line);
        i++;
      }
        
    }catch (IOException e){
    }
    //for(int i=0; i<3;i++){
    //obj objIO = new obj(i);
   // objIO.writetofile(chip);
    //read from the file
    //Chips ch = (Chips) ReadObjectFromFile("chips.dat");
   // }
    
    //System.out.println(ch);
    
    

  }
  
  public void writetofile(Object chip) {
    try{
      FileWriter fstream = new FileWriter("chips.dat",true);
      BufferedWriter out = new BufferedWriter(fstream);
      FileOutputStream f_out = new FileOutputStream("chips.dat",true);
      ObjectOutputStream objectOut = new ObjectOutputStream(f_out);
      //BufferedWriter out = new BufferedWriter(new OutputStreamWriter (f_out));
    
      objectOut.writeObject(chip);
      //System.out.println(hash);
      objectOut.writeUTF("\n");

      objectOut.close();
    }catch(Exception ex){
      ex.printStackTrace();
    }
    
  }
  public static Object ReadObjectFromFile(String filepath){
    try {
      FileInputStream fileIn = new FileInputStream(filepath);
      ObjectInputStream objectIn = new ObjectInputStream(fileIn);
      Object obj = objectIn.readObject();
      System.out.println(fileIn.available());
      System.out.println(obj);
      System.out.println("The Object has been read from the file");
      objectIn.close();
      return obj;
 
    } catch (Exception ex) {
      ex.printStackTrace();
      return null;
    }
      
    }
  public static void searchfile()throws IOException{
      //load();
     
    BufferedReader br = new BufferedReader(new FileReader("chips.txt"));
    Scanner sc = new Scanner (System.in);
    System.out.println("Type in the Chip you would like to search for ");
    String name = sc.nextLine();
    String [] stat = null;
    String n = null;
    String line = null;
    int i = 0; 
    if( hash.get(0) == null){
      System.out.println("There are no Chips in the database");
    }
    if(hash.containsKey(29)){
      System.out.println(line);
    }
     } 
}