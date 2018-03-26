
package myArrayList.test;

import myArrayList.MyArrayList;
import myArrayList.util.Results;

public class MyArrayListTest {
    
    
    public void testMe(MyArrayList myArrayList, Results results){
    
       
        emptyArray(myArrayList, results);
        resizingArray(myArrayList, results);
        sumOfEmytyArray(myArrayList, results);
        addRemoveValue(myArrayList, results);
        checkElement(myArrayList, results);
        removeElement(myArrayList, results);
        negativeValue(myArrayList, results);
        addZero(myArrayList, results);
        indexOF(myArrayList, results);
        adding10001(myArrayList, results);
     
        
    }
    private void emptyArray(MyArrayList myArrayList,Results results){
        
        int sum=0;
        sum=myArrayList.sum();
        
        
        if(sum==0){
            results.storeNewResult("\n1) Empty Array: Passed");
        }
        else{
             results.storeNewResult("\n1) Empty Array: Failed");
        }
    
    
    }
    private void resizingArray(MyArrayList myArrayList,Results results){
        
        int initalSize=myArrayList.size();
        
        for(int i=0;i<initalSize+2;i++){
            
            myArrayList.insertSorted(22);
           
            
        }
        int finalSize=myArrayList.size();
        
        if(initalSize<=finalSize){
            results.storeNewResult("\n2) Resizing Array: Passed");
        }
        else{
             results.storeNewResult("\n2) Resizing Array: Failed");
        }
    
    
    }
    private void sumOfEmytyArray(MyArrayList myArrayList,Results results){
        
        int sum=0;
        sum=myArrayList.sum();
        if(sum==0){
            results.storeNewResult("\n3) Sum of empty array is 0 : Passed");
        }
        else{
             results.storeNewResult("\n3) Sum of empty array is 0 : Failed");
        }
    }
    private void addRemoveValue(MyArrayList myArrayList,Results results){
        
        myArrayList.insertSorted(100);
        int size1=myArrayList.size();
        myArrayList.removeValue(100); 
        int size2=myArrayList.size();
        
        if(size1!=size2){
            results.storeNewResult("\n4) Element Added and Removed : Passed");
        }
        else{
             results.storeNewResult("\n4) Element Added and Removed : Failed");
        }
        
        
    }
    private void checkElement(MyArrayList myArrayList,Results results){
    
      
        int c=0;
        int value=myArrayList.indexOf(50);
        if(value==-1){
            results.storeNewResult("\n5) Element Found: Failed");
        
        }else{
            results.storeNewResult("\n5) Element Found: Passed");
        }
        
        
    }
    private void removeElement(MyArrayList myArrayList,Results results){
    
      int size1=myArrayList.size();
        myArrayList.removeValue(5676); 
        int size2=myArrayList.size();
        
        if(size1==size2){
            results.storeNewResult("\n6) Element Removed : Failed");
        }
        else{
             results.storeNewResult("\n6) Element Removed : Failed");
        }
        
        
    }
   
    private void negativeValue(MyArrayList myArrayList,Results results){
        
        int initalValue=myArrayList.size();
        myArrayList.insertSorted(-1);
        myArrayList.insertSorted(-2);
        myArrayList.insertSorted(-3);
        int finalValue=myArrayList.size();
        if(initalValue==finalValue){
            results.storeNewResult("\n7) Negative value : Passed");
        }else{
            results.storeNewResult("\n7) Negative value : Failed");
        
            
        }
        
        
        
    }
    private void addZero(MyArrayList myArrayList,Results results){
    
        int initalValue=myArrayList.size();
        myArrayList.insertSorted(0);
        int finalValue=myArrayList.size();
        initalValue++;
        if(initalValue==finalValue){
            results.storeNewResult("\n8) Added Zero : Passed");
        }else{
            results.storeNewResult("\n8) Added Zero : Failed");
        
            
        }
        
    }
    private void indexOF(MyArrayList myArrayList,Results results){
    
        myArrayList.insertSorted(0);
        int indexOfZero=myArrayList.indexOf(0);
        if(indexOfZero!=-1){
            results.storeNewResult("\n9) Index of Zero : Passed");
        }else{
            results.storeNewResult("\n9) Index of Zero : Failed");
        
            
        }
      
    
    }
    
    private void adding10001(MyArrayList myArrayList,Results results){
        
        int initalValue=myArrayList.size();
        myArrayList.insertSorted(10001);
        int finalValue=myArrayList.size();
        
        if(initalValue==finalValue){
            results.storeNewResult("\n10) Adding 10001 : Failed");
        }else{
            results.storeNewResult("\n10) Adding 10001: Passed");
        
            
        }
        
        
    }
    
    
    
    
}
