package model;

import java.util.ArrayList;
import java.util.List;

public class ListUser {
  private static ListUser instance = new ListUser();
  private List<User> listOfAllUsers;

  public static ListUser getInstance() {
    return instance;
  }

  public ListUser() {
    listOfAllUsers = new ArrayList<>();
  }

  public void add (User user) {
    int count = 0;

    for (int i = 0; i < listOfAllUsers.size(); i++) {
      if (user.getSurName().equalsIgnoreCase(listOfAllUsers.get(i).getSurName())) {
        count++;
      }
    }

    if (count != 0) {
      throw new NullPointerException();
    } else {
      listOfAllUsers.add(user);
    }
  }

  public void delete(String surName) {
    for (int i = 0; i < listOfAllUsers.size(); i++) {
      if (surName.equals(listOfAllUsers.get(i).getSurName())){
        listOfAllUsers.remove(i);
        break;
      }
    }
  }

  public void update(User user, String oldSurname) {
    int index = 0;
    int count = 0;
    for (int i = 0; i < listOfAllUsers.size(); i++) {
      if (oldSurname.equals(listOfAllUsers.get(i).getSurName())) {
        index = i;
      }
    }

    for (User listOfAllUser : listOfAllUsers) {
      if (user.getSurName().equalsIgnoreCase(listOfAllUser.getSurName())) {
        count++;
      }
    }

    if (count !=0 && !(user.getSurName().equals(listOfAllUsers.get(index).getSurName()))) {
      throw new NullPointerException();
    } else {
      listOfAllUsers.set(index, user);
    }

   /* for (int i = 0; i < listOfAllUsers.size(); i++) {
      if (user.getSurName().equals(listOfAllUsers.get(i).getSurName())){
        throw new NullPointerException();
      } else if (oldSurname.equals(listOfAllUsers.get(i).getSurName())) {
        listOfAllUsers.set(i, user);
        break;
      }
    }*/
  }

  public List<User> list() {
    return listOfAllUsers;
  }


}
