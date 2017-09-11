package com.insup.GenericPrac;

//강사님 버젼
public class ArrListVthree<T> {
	
	private T list[];
	int i=10;

	public ArrListVthree(){ //값을 넣지 않은 상태에서 사이즈 등의 체크를 할 수 있음, 저장소를 초기화 해주는 작업이 필요하다.
		
		// if(Type instanceOf target) 
		list = (T[]) new Object[i];
	}
	
	public void add(T item){
		//배열의 크기를 임시로 늘려서 사용
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
