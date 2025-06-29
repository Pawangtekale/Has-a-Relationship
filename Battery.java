class  Battery
{
	String name;
	double price;
	int mah;
	String type;
	
	public Battery(){}
	Battery(String name,double price,int mah,String type){
		this.name=name;
		this.price=price;
		this.mah=mah;
		this.type=type;
		System.out.println("Battery Created...!");	
	}
	public void displayBattery(){
		System.out.println("Name:"+name);
		System.out.println("Price:"+price);
		System.out.println("Mah:"+mah);
		System.out.println("Type:"+type);
	}
	
}
