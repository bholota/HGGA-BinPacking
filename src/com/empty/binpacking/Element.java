package com.empty.binpacking;

import java.util.ArrayList;
import java.util.List;

public class Element implements Comparable<Element>{

	private int id;
	private int value;
	
	public Element(int id, int value){
		this.id = id;
		this.value = value;
	}
	
	public int getValue(){
		return value;
	}
	
	public int getId(){
		return id;
	}

	public static List<Element> intArrToList(int[] arr) {
		List<Element> elements = new ArrayList<Element>();
		
		for(int i = 0; i < arr.length; i++){
			Element elem = new Element(i, arr[i]);
			elements.add(elem);
		}
		
		return elements;
	}
	
	public String toString(){
		return Integer.toString(value) + "(" + Integer.toString(id) + ")";
	}

	@Override
	public int compareTo(Element o) {
		Integer size = this.value;
		Integer osize = o.getValue();
		return size.compareTo(osize);
	}
}
