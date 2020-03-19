package testtitanic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * File: Titanic.java
 * Author: Brock A. Allton
 * Date: 21 July 2016
 * Purpose: Construct a Titanic object to read in and pass on information from
 *          a text file
 */

class Titanic {
    String[][]titanic;
    
        public Titanic(String[] args){
        try{
            File text = new File(args[0]);
            String content = new Scanner(text).useDelimiter("\\Z").next();
            String[] rows = content.split("\n");
            this.titanic = new String[rows.length][];
            for (int i = 0; i <rows.length; i++){
                this.titanic[i] = rows[i].split("\\t");
            }
            
        }
        catch(FileNotFoundException e){
            System.out.println("Error" + e.getMessage());
        }
    }
    public void getPassNum(){
        int num = titanic.length;
        System.out.println("There were " +num +" passengers on Titanic.\n");
    }
    
    public float getPerishedPrcnt(){
        int perished = 0;
        int count = 0;
        for(String[] rows:titanic){
            if (rows[1]!= null && rows[1].equals("0")){
             perished++;
         }
            count++;
        }
        return (float) perished / (float) titanic.length * 100.0f;
      
    }
    
    public float getPrcntSurvived(){
        int survived = 0;
        int count = 0;
        for(String[] rows:titanic){
            if(rows[1] != null && rows[1].equals("1")){
                ++survived;
            }
            count++;
        }
        return (float) survived / (float) titanic.length *100.0f;
    }
    
    public float getFirstClassPassDied(){
        int perished = 0;
        int count = 0;
        for (String[] rows : titanic){
            if (rows[0] != null && rows[0].equals("1") && rows[1].equals("0")){
                perished++;
            }
            count++;
        }
        return (float) perished / (float) titanic.length * 100.0f;
    }
    
    public float getSecondClassPassDied(){
        int perished = 0;
        int count = 0;
        for (String[] rows : titanic){
            if (rows[0] != null && rows[0].equals("2") && rows[1].equals("0")){
                perished++;
            }
            count++;
        }
        return (float) perished / (float) titanic.length * 100.0f;
    }
    
    public float getThirdClassPassWhoDied(){
        int perished = 0;
        int count = 0;
        for (String[] rows : titanic){
            if (rows[0] != null && rows[0].equals("3") && rows[1].equals("0")){
                perished++;
            }
            count++;
        }
        return (float) perished / (float) titanic.length *100.0f;
    }
    
     public float getAgeDied(){
         int perished = 0;
         int count = 0;
         for (String[] rows: titanic){
             if (rows[4] != null && rows[4].equals("10") && rows[1].equals("0")){
                 perished++;
             }
             count++;
         }
         return (float) perished / (float) titanic.length * 100.0f;
     }
    
     public void getLastName(){        
        int count = 0;
        int name = 0;
        for (String[] cols:titanic){  
             char pChar = cols[2].charAt(0);
             if (pChar != 'A' ){
                 continue;
            }
            else if(pChar == 'A'){
             name++;
             } 
            System.out.println("A: " + name);  
        }
             
     } 
     public float getFemaleSurvived(){
         int count = 0;
         int fem = 0;
         for (String[]cols : titanic){
             if (cols[3] != null && cols[3].equals("female") && cols[1].equals("1")){
                 fem++;
             }
             count++;
         }
         return (float) fem / (float) titanic.length *100.0f;
     }
    
}