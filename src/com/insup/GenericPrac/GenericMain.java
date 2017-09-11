package com.insup.GenericPrac;

import java.util.ArrayList;

public class GenericMain {

	public static void main(String[] args) {
		
		ArrList<Integer> list = new ArrList<>();
		
		for(int i=0; i<20; i++){
			list.add(i);
			System.out.println(list.get(i));
		}
		System.out.println(list.size());

		for(int i=list.size(); i>=0; i--){
			list.remove(i);
		}
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		
		System.out.println(list.size());
	}
}

