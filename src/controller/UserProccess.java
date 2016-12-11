package controller;

import factroy.Welcome;
import model.UserDetails;

/**
 * Created by hossam on 12/9/16.
 */
public class UserProccess implements Welcome {

    UserDetails userdetails = new UserDetails();


    @Override
    public void userWelcome() {

    }

    @Override
    public void userName(String name) {

        userdetails.setName(name);
    }

    @Override
    public void userAge(String age) {

        userdetails.setAge(age);

    }

    @Override
    public UserDetails DETAILS() {

        return this.userdetails;
    }
}
