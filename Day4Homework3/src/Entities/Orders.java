package Entities;

public class Orders {
private int id;
private int customerId;
private int campaignId;
private int gameId;


public Orders () {
	
}


public Orders(int id, int customerId, int campaignId, int gameId) {
	super();
	this.id = id;
	this.customerId = customerId;
	this.campaignId = campaignId;
	this.gameId = gameId;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public int getCustomerId() {
	return customerId;
}


public void setCustomerId(int customerId) {
	this.customerId = customerId;
}


public int getCampaignId() {
	return campaignId;
}


public void setCampaignId(int campaignId) {
	this.campaignId = campaignId;
}


public int getGameId() {
	return gameId;
}


public void setGameId(int gameId) {
	this.gameId = gameId;
}

}
