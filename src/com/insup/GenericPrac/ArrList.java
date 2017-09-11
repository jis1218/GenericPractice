package com.insup.GenericPrac;

public class ArrList<T> {
	
	public T anyType;
	
	private T[] storageArray = (T[]) new Object [10];
	
	int index = 0;
	
	public void add(T anyType){
		
		storageArray[index] = anyType;
		
		index++;
		
		if(storageArray[storageArray.length*2/3]!=null){
		storageArray = increaseArraySize(storageArray);
		}
	}
	
	public T get(int index){	
		return storageArray[index];		
	}
	
	public int size(){
		
		for(int i=storageArray.length-1; i>=0; i--){
			if(storageArray[i]!=null){
				return i+1;
			}
		}
		
		return 0;
	}
	
	public void remove(int index){
		for(int i=index; i<size(); i++)
		storageArray[i] = storageArray[i+1];
		
		if(storageArray.length>15 && storageArray[storageArray.length*1/4]==null){
			storageArray = decreaseArraySize(storageArray);
		}
	}
	
	public T[] increaseArraySize(Object[] oldArray){	
					
			T[] newArray = (T[]) new Object [oldArray.length+20];
			replaceArrayForIncrease(oldArray, newArray);
			
			return newArray;
	}
	
	public void replaceArrayForIncrease(Object[] oldArray, Object[] newArray){
		for(int i=0; i<oldArray.length; i++){
			newArray[i]=oldArray[i];
		}
	}
	
	public void replaceArrayForDecrease(Object[] oldArray, Object[] newArray){
		for(int i=0; i<newArray.length; i++){
			newArray[i]=oldArray[i];
		}
	}
	
	public T[] decreaseArraySize(Object[] oldArray){
		
		T[] newArray = (T[]) new Object [oldArray.length-20];
		replaceArrayForDecrease(oldArray, newArray);
		
		return newArray;
	}
}
