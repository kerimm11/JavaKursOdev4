package Concrete;

import Entities.Campaing;

public class CampaingManager {
	
	public void add(Campaing campaing) {
		System.out.println(campaing.getCampaingName()+" Kampanya ba�ar�yle eklendi.");
	}
	
	public void delete(Campaing campaing) {
		System.out.println(campaing.getCampaingName()+" Kampanya ba�ar�yle silindi.");
	}
	
	public void update(Campaing campaing) {
		System.out.println(campaing.getCampaingName()+" Kampanya ba�ar�yle g�ncellendi.");
	}

}
