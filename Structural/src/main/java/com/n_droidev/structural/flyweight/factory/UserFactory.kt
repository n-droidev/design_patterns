package com.n_droidev.structural.flyweight.factory

import com.n_droidev.structural.flyweight.model.User
import com.n_droidev.structural.flyweight.model.UserType

object UserFactory {

    private var userTypes = arrayListOf<UserType>()

    fun createUser(name: String, height: Double, age: Int, gender: String, hairColor: String, eyeColor: String): User {
        val user = User(name, height, age)
        user.userType = findUserType(gender, hairColor, eyeColor) ?: UserType(gender, hairColor, eyeColor).also { userTypes.add(it) }
        println("Creating new User.. UserType List size: ${userTypes.size}")
        return user
    }


    private fun findUserType(gender: String, hairColor: String, eyeColor: String): UserType? {
        for (type in userTypes) {
            if (type.gender == gender && type.hairColor == hairColor && type.eyeColor == eyeColor) {
                println("User Type Founded: ${type.gender}  ${type.eyeColor}  ${type.hairColor}")
                return type
            }
        }
        println("User Type Not Exist. Creating New...")
        return null
    }

}