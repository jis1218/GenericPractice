package com.insup.GenericPrac;

//����� ����
public class ArrListVthree<T> {
	
	private T list[];
	int i=10;

	public ArrListVthree(){ //���� ���� ���� ���¿��� ������ ���� üũ�� �� �� ����, ����Ҹ� �ʱ�ȭ ���ִ� �۾��� �ʿ��ϴ�.
		
		// if(Type instanceOf target) 
		list = (T[]) new Object[i];
	}
	
	public void add(T item){
		//�迭�� ũ�⸦ �ӽ÷� �÷��� ���
		Object tempList[] = new Object[size()+1];
		tempList[list.length] = item;
		for(int i=0; i<list.length; i++){
			tempList[i] = list[i];
		}
		list = (T[]) tempList;
	}
	
	public void remove(int position){
		
		Object tempList[] = new Object[size()-1];
		
		for(int i=0; i<position-1; i++){
			tempList[i] = list[i];
		}
		
		for(int i=position+1; i<list.length; i++){
			tempList[i-1] = list[i];
		}
		
		list = (T[]) tempList;		
	}
	
	public int size(){
		return list.length-1;
	}

}
