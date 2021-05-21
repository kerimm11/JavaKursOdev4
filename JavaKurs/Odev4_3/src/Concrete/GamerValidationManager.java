package Concrete;

import Abstract.GamerValidationService;
import Entities.User;

public class GamerValidationManager implements GamerValidationService {
	
	public Boolean validate(User user) {
		return false;
	}
	
	

}
