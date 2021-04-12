/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fajlbeolvasas;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Fajlbeolvasas {

   
    public static ArrayList<Diakok> osztaly=new ArrayList<>();

    
    public static void beolvas(){
        try{
           RandomAccessFile raf = new RandomAccessFile("113C.txt","r");
            while(raf.getFilePointer()<raf.length()){
               
                osztaly.add(new Diakok(raf.readLine()));
            }
            System.out.println("\nBeolvasva "+osztaly.size()+" rekord!\n");
            raf.close();
        }   
        catch(IOException e){
            System.out.println(e);

        }
}
    public static void main(String[] args) {
            beolvas();
    }
}
 

class Diakok{
        public String vezNev;
        public String kerNev;
        public String kerNev2;
        
        
        public Diakok(String sor){
        
        System.out.println(sor);
        String[] adatok=sor.split(" "); 
       
            this.vezNev=adatok[0];
            this.kerNev=adatok[1];
           
        }
}