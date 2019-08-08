package Ark;
public class AnimalT implements Animal{
	private String name;
	private int year;


	public AnimalT(){};
	public AnimalT (String name,int year){
		this.name = name;
		this.year = year;
	}
	public String getName(){
		return name;
	}
	public void setName(String newname){
		this.name = newname;
	}

	@Override
	public void food(int e){
		this.year = year + e;
	}

	@Override
	public void move(int m){
		this.year = year - m;
	}

	public String atts(){
		String ats = "name: " +this.name +"year: " this.year;
		return ats;
	}

	
	// public String breath(){
	// 	return "gills";
	// }

	// @Override
	// public String reproduce(){
	// 	return "eggs";
	// }
}