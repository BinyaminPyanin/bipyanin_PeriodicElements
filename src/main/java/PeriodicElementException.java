package main.java;

public class PeriodicElementException extends Throwable {

	private String msg;
	public PeriodicElementException(String msg){
		this.msg=msg;
	}
}
