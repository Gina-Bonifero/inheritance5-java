package entities;

public class ImportedProduct extends Product {
	
	private Double customsFee;
	
	public ImportedProduct() {
	}
	
	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public Double getCustomsFee() {
		return customsFee;
	}
	
	public void totalPrice() {
		price += customsFee;
	}
	
	@Override
	public String toString() {
		return name
				+ " $ "
				+ String.format("%.2f", price)
				+ " (Customs fee: $ "
				+ String.format("%.2f", customsFee)
				+ ")";
	}
}
