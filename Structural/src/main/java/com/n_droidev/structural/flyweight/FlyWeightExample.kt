package com.n_droidev.structural.flyweight

import com.n_droidev.structural.flyweight.factory.UserFactory
import com.n_droidev.structural.flyweight.model.User

class FlyWeightExample {
    fun createUserList(): ArrayList<User> {
        val userList = arrayListOf<User>()
        userList.add(UserFactory.createUser("Ali", 165.6, 22, "K", "Black", "Brown"))
        userList.add(UserFactory.createUser("Orxan", 164.3, 23, "K", "Black", "Black"))
        userList.add(UserFactory.createUser("Teymur", 175.1, 25, "K", "Brown", "Black"))
        userList.add(UserFactory.createUser("Senan", 174.0, 26, "K", "Yellow", "Brown"))
        userList.add(UserFactory.createUser("Vidadi", 163.2, 21, "K", "Black", "Brown"))
        userList.add(UserFactory.createUser("Amil", 170.1, 25, "K", "Black", "Blue"))
        userList.add(UserFactory.createUser("Samir", 172.0, 24, "K", "Black", "Black"))
        userList.add(UserFactory.createUser("Aysel", 167.2, 21, "Q", "Black", "Black"))
        userList.add(UserFactory.createUser("Leyla", 168.3, 32, "Q", "Brown", "Brown"))
        userList.add(UserFactory.createUser("Aynur", 159.2, 25, "Q", "Black", "Brown"))
        userList.add(UserFactory.createUser("Ayan", 161.4, 26, "Q", "Brown", "Green"))
        userList.add(UserFactory.createUser("Rena", 164.6, 27, "Q", "Yellow", "Black"))
        userList.add(UserFactory.createUser("Fidan", 162.9, 28, "Q", "Brown", "Brown"))
        return userList
    }
}