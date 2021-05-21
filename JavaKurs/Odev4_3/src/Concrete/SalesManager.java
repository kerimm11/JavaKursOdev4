package Concrete;

import Abstract.SalesService;
import Entities.Campaing;
import Entities.Game;
import Entities.User;

public class SalesManager implements SalesService {
	
	public void add(Game game, Campaing campaing, User user) {
		System.out.println(game.getGameName() + " oyunu" + user.getName() + " kullanýcýsýnýn hesabýna eklendi" );
		System.out.println(campaing.getCampaingName() + " kampanya uygulandý");
	}
	
	public void gift(Game game, Campaing campaing, User user) {
		System.out.println(game.getGameName() + " oyunu" + user.getName() + " kullanýcýsýnýn hesabýna gönderildi" );
		System.out.println(campaing.getCampaingName() + " kampanya uygulandý");
	}
	
	public void refund(Game game, Campaing campaing, User user) {
		System.out.println(game.getGameName() + " oyunu" + user.getName() + " kullanýcýsýnýn hesabýna eklendi" );
		System.out.println(game.getPrice() + " tutarýnda ödeme" + user.getName() + " oyuncunun hesabýna iade edildi");
	}

	@Override
	public void add(Game game, User user, Campaing campaing) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Game game, User user, Campaing campaing) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Game game, User user, Campaing campaing) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
