package myArrayList;

import java.util.Arrays;
public class MyArrayList {
    
    private int newArray[];
    private int last=0;
    
    public MyArrayList(){
        newArray=new int[50];
        
    }
    
    public void insertSorted(int newValue){
        
        
        if(newArray.length<=last){
            int newArray1[] = new int[newArray.length + (int)(newArray.length/2)];
            for(int i = 0; i < newArray.length; i++){
		newArray1[i] = newArray[i];
	    }
            newArray = newArray1;
            
        }
        if(newValue>=0&&newValue<=10000){
            newArray[last]=newValue;
            last++;
        }
        Arrays.sort(newArray,0,last);
        
        
    }
 
    public void removeValue(int value){
        
        int position=0;
        int count=0;
       
       for (int i=0;i<last;i++){
       
           if(value == newArray[i]){
               position=i;
               break;
             }
       }
       for (int i=0;i<last;i++){
       
           if(value == newArray[i])
               count++;
       }     
       int index=count;
       while(index>0)
       {
            for(int i=position;i<last;i++){
                newArray[i]=newArray[i+1];
            }
            index--;
       }
       last=last-count;
     
        
    }
    
    public int indexOf(int value){
    
        int index=-1;
        
        for(int i=0;i<last;i++){
            if(value == newArray[i]){
                index=i;
                break;
            }
        }
        if(index==-1)
            return -1;
        else
            return ++index;
    }
    public int size(){
    
          return last;
        
    }
    public int sum(){
        int s=0;
        for(int i=0;i<last;i++){
        
                s+=newArray[i];
        }
        return s;
    }
   



    
}
