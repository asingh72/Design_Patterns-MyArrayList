package myArrayList.driver;

import java.io.BufferedReader;
import java.io.FileReader;
import myArrayList.MyArrayList;
import myArrayList.test.MyArrayListTest;
import myArrayList.util.FileProcessor;
import myArrayList.util.Results;
public class Driver {
    
    public static void main(String args[])throws Exception{
        
        	String input = null;
		String output = null;
		if(args.length != 2) {
			throw new RuntimeException("Expected 2 args");
		}
		else{
			input = args[0];
			output = args[1];
		}
    
        MyArrayList arrayList=new MyArrayList();
       
    try
    {
    
    
        BufferedReader r=new BufferedReader(new FileReader(input));
        FileProcessor fp=new FileProcessor(r,input);

        for(int i=0;i<fp.countLines;i++)
        {
            int num=Integer.parseInt(fp.readLine());
            if(num>=0&&num<=10000)
            {
                arrayList.insertSorted(num);
            }
            else
            {
                System.out.println("Number be between 0 and 10000");
                break;
            }
    
        }


    }
    catch(Exception ex)
    {
    
    }
     
    int sum=arrayList.sum();
    String sumString=String.valueOf(sum);
    Results r=new Results(output);
    MyArrayListTest test = new MyArrayListTest();
    test.testMe(arrayList, r);
    r.writeToFile(sumString);
    r.writeToStdout();
    
    
    
    
    
    
    }
   
    
    
}
