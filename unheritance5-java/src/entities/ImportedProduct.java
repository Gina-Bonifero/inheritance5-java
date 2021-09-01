package entities;

public class ImportedProduct extends Product {
	
	private Double customsFee;
	
	public ImportedProduct() {
	}
	
	public ImportedProduct(String name, Double price, Double customsFee) {
		super();
		this.customsFee = customsFee;
	}
	
	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public Double getCustomsFee() {
		return customsFee;
	}
	
	public void totalPrice(double price, double customsFee) {
		price += customsFee;
	}
	
	@Override
	public String toString() {
		return name
				+ " $ "
				+ String.format("%2.f%", price)
				+ " (Customs fee: $ "
				+ String.format("%2.f%", customsFee)
				+ ")";
	}
}
