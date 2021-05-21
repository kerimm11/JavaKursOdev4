package Entities;

public class Campaing {
	
	int campaingId;
	String campaingName;
	
	public Campaing () {
		
	}
	
	public Campaing(int campaingId, String campaingName) {
		super();
		this.campaingId = campaingId;
		this.campaingName = campaingName;
	}


	public int getCampaingId() {
		return campaingId;
	}


	public void setCampaingId(int campaingId) {
		this.campaingId = campaingId;
	}


	public String getCampaingName() {
		return campaingName;
	}


	public void setCampaingName(String campaingName) {
		this.campaingName = campaingName;
	}

}
