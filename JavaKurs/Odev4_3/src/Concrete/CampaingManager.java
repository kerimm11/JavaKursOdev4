package Concrete;

import Entities.Campaing;

public class CampaingManager {
	
	public void add(Campaing campaing) {
		System.out.println(campaing.getCampaingName()+" Kampanya başarıyle eklendi.");
	}
	
	public void delete(Campaing campaing) {
		System.out.println(campaing.getCampaingName()+" Kampanya başarıyle silindi.");
	}
	
	public void update(Campaing campaing) {
		System.out.println(campaing.getCampaingName()+" Kampanya başarıyle güncellendi.");
	}

}
