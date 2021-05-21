package Abstract;
import Entities.Game;
import Entities.Campaing;
import Entities.User;

public interface SalesService {
    public void add(Game game, User user, Campaing campaing);
    public void delete(Game game, User user, Campaing campaing);
    public void update(Game game, User user, Campaing campaing);
}
