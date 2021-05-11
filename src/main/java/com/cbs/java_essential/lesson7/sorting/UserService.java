package com.cbs.java_essential.lesson7.sorting;

import java.util.Comparator;
import java.util.List;

public class UserService {

    public List<User> getUsersById() {
        List<User> users = UserRepository.loadUsers();
        users.sort(new SortUsersById());
        return users;
    }

    public List<User> getUsersByIdV2() {
        List<User> users = UserRepository.loadUsers();
        users.sort(new Comparator<User>() {
            @Override
            public int compare(User user1, User user2) {
                return user2.getId() - user1.getId();
            }
        });
        return users;
    }


    static class SortUsersById implements Comparator<User> {
        @Override
        public int compare(User user1, User user2) {
            return user2.getId() - user1.getId();
        }
    }
}
