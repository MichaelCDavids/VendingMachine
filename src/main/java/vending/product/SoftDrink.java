package vending.product;

public class SoftDrink extends Product {

    private int stockLevel = 0;

    @Override
    public String description(){
        return "This is a SoftDrink";
    }

    public int getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel( int stockLevel ) {
        this.stockLevel = stockLevel;
    }
}