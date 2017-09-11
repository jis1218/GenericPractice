package com.insup.GenericPrac;

import java.lang.reflect.Array;

//���ֿ� �л� �ڵ�
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
			//Array.set(Ÿ��, �ε���, ��)
			//Ÿ���� �ε����� ���� �Է�
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
			// ������ �ͼ��� ó��
			throw new IndexOutOfBoundsException("�������");
		}
		for(int i = index; i<count; i++){
			array[i] = array[i+1];
		}
		array[count] = null;
	}


}
