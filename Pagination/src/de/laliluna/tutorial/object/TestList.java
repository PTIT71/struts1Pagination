package de.laliluna.tutorial.object;

import java.util.ArrayList;
import java.util.Collection;

public class TestList {

	//properties
	ArrayList list;
	int offset;
	int length;

	//constructors
	public TestList(int offset, int length){
		this.offset = offset;
		this.length = length;
		fillList();
	}

	//fill the list with dummy data
	public void fillList(){
		list = new ArrayList();
		list.add(new Customer(1, "Marie", "New York", "061/123456"));
		list.add(new Customer(2, "Klaus", "Bouston", "071/654321"));
		list.add(new Customer(3, "Peter", "Detroit", "091/3432432"));
		list.add(new Customer(4, "Alex", "New York", "061/1324234"));
		list.add(new Customer(5, "Eve", "Houston", "051/885656"));
		list.add(new Customer(6, "Sebastian", "Seattle", "0811/8234240"));
		list.add(new Customer(7, "Marie", "Ohio", "0771/23235"));
		list.add(new Customer(8, "Gabriel", "Oklahoma", "011/9945461"));
		list.add(new Customer(9, "John", "California", "0871/8230013"));
		list.add(new Customer(10, "Dave", "Iowa", "0981/2320026"));
	}

	//get list by offset and length
	// returns a subset of the list, from offset to offset + length
	public ArrayList getListByOffsetAndLength(){

		ArrayList arrayList = new ArrayList();

		//calc the to value
		int to = this.offset + this.length;
		//if offset or lenght exceed set them to list.size
		if(this.offset > list.size()) this.offset = list.size();
		if(to > list.size()) to = list.size();
		//add the list items to the return collection 
		for(int i=this.offset;i<to;i++){
			arrayList.add(list.get(i));
		}
		//return the collection
		return arrayList;
	}

	//get list site
	public int getListSize(){
		return list.size();
	}

	//get pages returns a list of Integer values, representing the pages
	public Collection getPages(){

		Collection collection = new ArrayList(); 
		//calc how many pages are there
		int pages = list.size() / this.length;
		if(list.size() % this.length != 0)
			pages = pages + 1;

		//fill an collection with all pages
		for(int i=1;i<=pages;i++){
			collection.add(new Integer(i));
		}

		return collection;
	}

	// getter and setter methods
	public ArrayList getList() {
		return list;
	}
	public void setList(ArrayList list) {
		this.list = list;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
}
