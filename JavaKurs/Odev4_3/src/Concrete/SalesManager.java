package Concrete;

import Abstract.SalesService;
import Entities.Campaing;
import Entities.Game;
import Entities.User;

public class SalesManager implements SalesService {
	
	public void add(Game game, Campaing campaing, User user) {
		System.out.println(game.getGameName() + " oyunu" + user.getName() + " kullanıcısının hesabına eklendi" );
		System.out.println(campaing.getCampaingName() + " kampanya uygulandı");
	}
	
	public void gift(Game game, Campaing campaing, User user) {
		System.out.println(game.getGameName() + " oyunu" + user.getName() + " kullanıcısının hesabına gönderildi" );
		System.out.println(campaing.getCampaingName() + " kampanya uygulandı");
	}
	
	public void refund(Game game, Campaing campaing, User user) {
		System.out.println(game.getGameName() + " oyunu" + user.getName() + " kullanıcısının hesabına eklendi" );
		System.out.println(game.getPrice() + " tutarında ödeme" + user.getName() + " oyuncunun hesabına iade edildi");
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
