
package myArrayList.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class Results implements FileDisplayInterface, StdoutDisplayInterface{
    
    private String finalResultPath;
    private  ArrayList<String> test = new ArrayList<String>(); 
    
    public Results(String fileName){
		finalResultPath = fileName;
	}
    
    public void writeToFile(String s){
        
        try{
        
            PrintWriter writer = new PrintWriter(finalResultPath);
            
            String finalStatement="The sum of all the values in the array list is: "+s;
            writer.write(finalStatement);
           
            for (String res : test) {
			writer.write(res);
		}
             writer.close();
            
            
        }catch(IOException e){
        
        }
    
        
    }
    public void storeNewResult(String testResults){
        test.add(testResults);
    }

    //@Override
    public void writeToStdout() {
        for (String s : test){
            System.out.println(s);
	}
    }

    
   

}
