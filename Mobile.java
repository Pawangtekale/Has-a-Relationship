class Mobile 
{
	String brand;
	String name;
	double price;
	int ram;
	int rom;
	String processor;
	
	Battery b1=new Battery("Exide",1500.0,5000,"Li-ion");
	Mobile(){}
	
	Mobile(String brand,String name,double price,int ram,int rom,String processor){
		this.brand=brand;
		this.name=name;
		this.price=price;
		this.ram=ram;
		this.rom=rom;
		this.processor=processor;
	}
	public void displayMobile(){
		System.out.println("Brand:"+brand);
		System.out.println("Price:"+price);
		System.out.println("Name:"+name);
		System.out.println("Ram:"+ram);
		System.out.println("Rom:"+rom);
		System.out.println("Processsor:"+processor);
		System.out.println("Mobile Created..!");
	}
	
	
}
	
