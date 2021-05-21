package Concrete;

import Entities.Campaing;

public class CampaingManager {
	
	public void add(Campaing campaing) {
		System.out.println(campaing.getCampaingName()+" Kampanya baþarýyle eklendi.");
	}
	
	public void delete(Campaing campaing) {
		System.out.println(campaing.getCampaingName()+" Kampanya baþarýyle silindi.");
	}
	
	public void update(Campaing campaing) {
		System.out.println(campaing.getCampaingName()+" Kampanya baþarýyle güncellendi.");
	}

}
