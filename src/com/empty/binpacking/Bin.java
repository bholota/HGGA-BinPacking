package com.empty.binpacking;

import java.util.ArrayList;
import java.util.List;

public class Bin {

	private int capacity = 10;
	private int filled = 0;
	private List<Element> elements = new ArrayList<Element>();
	private boolean markedForDelete = false;

	public List<Element> getAll() {
		return this.elements;
	}

	public Element getElement(int key) {
		return this.elements.get(key);
	}

	public boolean addElement(Element elem) {
		if (filled + elem.getValue() <= capacity) {
			filled += elem.getValue();
			elements.add(elem);
			return true;
		}

		return false;
	}

	public boolean replaceAll(List<Element> newElements) {
		int f = 0;
		for(int i = 0; i < newElements.size(); i++){
			f += newElements.get(i).getValue();
		}
		
		if(f <= this.capacity){
			this.filled = f;
			this.elements = newElements;
			return true;
		}
		
		return false;
	}

	public void remove(int n) {
		this.filled-=elements.get(n).getValue();
		this.elements.remove(n);
	}
	
	public void clear(){
		this.filled = 0;
		this.elements.clear();
	}

	public int getCapacity() {
		return capacity;
	}

	public int getFilled() {
		return filled;
	}

	public String toString() {

		String ret = new String();
		for (int i = 0; i < elements.size(); i++) {

			if (ret.length() > 0) {
				ret = ret + ',';
			}

			ret = ret + elements.get(i).toString();

		}

		return '[' + ret + ']';
	}

	public void markForDelete() {
		this.markedForDelete  = true;		
	}
	
	public boolean toDelete(){
		return this.markedForDelete;
	}
}
