package application;

import entities.SmartTv;

public class Program {
	public static void main(String[] args) {
		
		SmartTv smartTv = new SmartTv();
		
		System.out.println("A TV está ligada? " + smartTv.getOnOff());
		System.out.println("Canal atual: " + smartTv.canal);
		System.out.println("Volume atual: " + smartTv.volume);
		
		smartTv.on();
		smartTv.canal = 7;
		smartTv.volume = 25;
		
		System.out.println("A TV está ligada? " + smartTv.getOnOff());
		System.out.println("Canal atual: " + smartTv.canal);
		System.out.println("Volume atual: " + smartTv.volume);
		
	}
}
