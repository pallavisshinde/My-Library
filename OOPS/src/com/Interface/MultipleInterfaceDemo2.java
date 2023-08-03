package com.Interface;

class phone{
	void call() {
		System.out.println("making call using this method");
	}
	void msg() {
		System.out.println("making msg using msg method");
	}
}

interface camera{
	void click();
	void recordVideo();
}
interface player{
	void play();
	void pause();
	void stop();
}
 
class Smartphone extends phone implements camera,player{
	
	@Override
	public void play() {
		System.out.println("play music");
	}
	
	@Override
	public void pause() {
		System.out.println("pause music");
	}
	
	@Override
	public void stop() {
		System.out.println("stop music");
	}
	
	@Override
	public void click() {
		System.out.println("click photos");
	}
	
	@Override
	public void recordVideo() {
		System.out.println("record videos");
	}
}
public interface MultipleInterfaceDemo2 {

	public static void main(String[]args) {
		
		Smartphone sobj=new Smartphone();
		sobj.call();
		sobj.msg();
		sobj.click();
		sobj.recordVideo();
		sobj.play();
		sobj.pause();
		sobj.stop();
	}
}
