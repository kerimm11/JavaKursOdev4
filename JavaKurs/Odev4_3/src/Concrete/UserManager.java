package Concrete;

import Abstract.UserService;
import Entities.User;

public class UserManager implements UserService {
	
	public void add(User user) {
		System.out.println(user.getName() + " ki�isi ba�ar�yla eklendi");
	}
	
	public void delete(User user) {
		System.out.println(user.getName() + " ki�isi ba�ar�yla silindi");
	}
	
	public void update(User user) {
		System.out.println(user.getName() + " ki�isi ba�ar�yla g�ncellendi");
	}
	

}
