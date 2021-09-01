package entities;


import java.util.Date;

public class UsedProduct extends Product {
	

	private Date manufactureDate;
	
	public UsedProduct() {
	}
	
	public UsedProduct(String name, Double price, Date manufactureDate) {
		super();
		this.manufactureDate = manufactureDate;
	}
	
	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String toString() {
		return name 
				+ " (used) $ " 
				+ String.format("%2.f%", price)
				+ " (Manufacture date: "
				+ manufactureDate
				+ ")";
	}
}
