package main.java;
import java.io.Serializable;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PeriodicElementList implements Serializable{
	
	private ArrayList<PeriodicElement> list;

	@XmlElement
	public ArrayList<PeriodicElement> getList() {
		return list;
	}

	public void setList(ArrayList<PeriodicElement> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "PeriodicElementList [list=" + list + "]";
	}


	
	
}
