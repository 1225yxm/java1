package 封装_homework5;

import java.util.Scanner;

import javax.sound.midi.MidiDevice.Info;

public class Gardener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入你想创建的类：");
		Scanner scanner=new Scanner(System.in);
		String inof=scanner.next();
		
//		Apple apple1=new Apple();
		if(inof.equals("苹果")) {
			System.out.println(inof);
			Apple apple=new Apple();
			
		}else if(inof.equals("梨")) {
			Pear pear=new Pear();
		}else if(inof.equals("橙子")) {
			Oranges oranges=new Oranges();
		}else {
			System.out.println("没有您输入的类");
		}

	}

}
