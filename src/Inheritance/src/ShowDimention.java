package Inheritance.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Dimensions{
	
	protected int l , b;
	Dimensions(){
		l = 0;
		b=0;
	}
	Dimensions(int l , int b){
		this.l = l;
		this.b = b;
		
	}
	Dimensions(int s){
		this.l = s;
		this.b = s;
		
	}
	void display(){
		System.out.println("Length is:"+l);
		System.out.println("Breath is:"+b);
		}
	
}

class Area extends Dimensions{
	protected int a;
	
	public Area(int l, int b ){
		super(l,b);
		
	}
	void calculateArea(){
		 a = l*b;
	}
	//override
	void display(){
		super.display();
		System.out.println("Area Is:"+a);
	}
	
}
class Volume extends Dimensions{
	protected int h , v;
	//constructor chaining
	
	public Volume(int l, int b, int h) {
		super(l,b);
		this.h = h;
		
	}
	void calculateVolume(){
		v = l * b* h;
	}
	
	void display(){
		super.display();
		System.out.println("Height is:"+h);
		System.out.println("The VOlume is:"+v);
	}
}

public class ShowDimention {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Dimensions d1 = new Dimensions(10, 5);
		
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter Length: ");
	    int length = Integer.parseInt(reader.readLine());
	    System.out.println("Enter Breath: ");
	    int breath = Integer.parseInt(reader.readLine());
	    System.out.println("Enter Height: ");
	    int height = Integer.parseInt(reader.readLine());
	
	    
		Area a1 = new Area(length,breath);
		a1.calculateArea();
		a1.display();
		
		Volume v1 =new Volume(length, breath, height);
		v1.calculateVolume();
		v1.display();
	}

}
