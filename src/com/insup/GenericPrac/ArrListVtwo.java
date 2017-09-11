package com.insup.GenericPrac;

import java.lang.reflect.Array;

//이주원 학생 코드
public class ArrListVtwo<T> {
	
	public T array[];
	int count = 0;
	
	public ArrListVtwo(){
		int capacity = 16;
		array = (T[]) new Object[capacity];
	}
	
	public ArrListVtwo(int index){
		array = (T[]) new Object[index];
	}
	
	public T[] capacityAdd(){
		T newArray[] = (T[]) new Object[array.length+16];
		for(int i=0; i<array.length; i++){
			newArray[i] = array[i];
		}
		return newArray;
	}
	
	public void add(T object){
		try{
			//Array.set(타겟, 인덱스, 값)
			//타겟의 인덱스의 값을 입력
			Array.set(array, count, object);
			count++;
		}catch(Exception e){
			Array.set(capacityAdd(), count, object);
			count++;
		}
	}
	
	public int size(){
		return count;
	}
	
	public T get(int i){
		T result = array[i];
		
		return result;
	}
	
	public void remove(int index){
		if(index > count){
			// 강제로 익셉션 처리
			throw new IndexOutOfBoundsException("범위벗어남");
		}
		for(int i = index; i<count; i++){
			array[i] = array[i+1];
		}
		array[count] = null;
	}


}
