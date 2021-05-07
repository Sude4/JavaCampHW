package Entities;

public class Game {
private int id;
private String gameName;
private Double salePrice;

public Game(int id,String gameName,int i) {
	this.id =id;
	this.gameName = gameName;
	this.salePrice = (double) i;
	
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getGameName() {
	return gameName;
}

public void setGameName(String gameName) {
	this.gameName = gameName;
}

public Double getSalePrice() {
	return salePrice;
}

public void setSalePrice(Double salePrice) {
	this.salePrice = salePrice;
}
}
