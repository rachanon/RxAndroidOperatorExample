package com.rxandroid.example;

import android.util.Log;

import com.rxandroid.example.model.ApiUser;
import com.rxandroid.example.model.User;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by amitshekhar on 27/08/16.
 */
public class Utils {

    private Utils() {
        // This class in not publicly instantiable.
    }

    public static List<User> getUserList() {

        List<User> userList = new ArrayList<>();

        User userOne = new User();
        userOne.firstname = "Rachanon";
        userOne.lastname = "Kratudngern";
        userList.add(userOne);

        User userTwo = new User();
        userTwo.firstname = "Wasit";
        userTwo.lastname = "Poonjaroen";
        userList.add(userTwo);

        User userThree = new User();
        userThree.firstname = "Kanish";
        userThree.lastname = "Verma";
        userList.add(userThree);

        return userList;
    }

    public static List<ApiUser> getApiUserList() {

        List<ApiUser> apiUserList = new ArrayList<>();

        ApiUser apiUserOne = new ApiUser();
        apiUserOne.firstname = "Rachanon";
        apiUserOne.lastname = "Kratudngern";
        apiUserList.add(apiUserOne);

        ApiUser apiUserTwo = new ApiUser();
        apiUserTwo.firstname = "Wasit";
        apiUserTwo.lastname = "Poonjaroen";
        apiUserList.add(apiUserTwo);

        ApiUser apiUserThree = new ApiUser();
        apiUserThree.firstname = "Kanish";
        apiUserThree.lastname = "Verma";
        apiUserList.add(apiUserThree);

        return apiUserList;
    }

    public static List<User> convertApiUserListToUserList(List<ApiUser> apiUserList) {

        List<User> userList = new ArrayList<>();

        for (ApiUser apiUser : apiUserList) {
            User user = new User();
            user.firstname = apiUser.firstname;
            user.lastname = apiUser.lastname;
            userList.add(user);
        }

        return userList;
    }

    public static List<User> getUserListWhoLovesB2B2C() {

        List<User> userList = new ArrayList<>();

        User userOne = new User();
        userOne.id = 1;
        userOne.firstname = "Tana";
        userOne.lastname = "Chaijamorn";
        userList.add(userOne);

        User userTwo = new User();
        userTwo.id = 2;
        userTwo.firstname = "Wasit";
        userTwo.lastname = "Poonjaroen";
        userList.add(userTwo);

        return userList;
    }


    public static List<User> getUserListWhoLovesFootball() {

        List<User> userList = new ArrayList<>();

        User userOne = new User();
        userOne.id = 1;
        userOne.firstname = "Tana";
        userOne.lastname = "Chaijamorn";
        userList.add(userOne);

        User userTwo = new User();
        userTwo.id = 3;
        userTwo.firstname = "Rachanon";
        userTwo.lastname = "Kratudngern";
        userList.add(userTwo);

        return userList;
    }


    public static List<User> filterUserWhoLovesBoth(List<User> b2b2cFans, List<User> footballFans) {
        List<User> userWhoLovesBoth = new ArrayList<User>();
        for (User b2b2cFan : b2b2cFans) {
            for (User footballFan : footballFans) {
                if (b2b2cFan.id == footballFan.id) {
                    userWhoLovesBoth.add(b2b2cFan);
                }
            }
        }
        return userWhoLovesBoth;
    }

}
