package Concrete;

import Abstract.UserService;
import Entities.User;

public class UserManager implements UserService {
	
	public void add(User user) {
		System.out.println(user.getName() + " kiþisi baþarýyla eklendi");
	}
	
	public void delete(User user) {
		System.out.println(user.getName() + " kiþisi baþarýyla silindi");
	}
	
	public void update(User user) {
		System.out.println(user.getName() + " kiþisi baþarýyla güncellendi");
	}
	

}
