package factroy;

import model.UserDetails;

/**
 * Created by hossam on 12/9/16.
 */
public interface Welcome {

    void userWelcome();

    void userName(String name);

    void userAge(String age);

    UserDetails DETAILS();


}
