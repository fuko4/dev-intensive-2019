package ru.skillbranch.dev_intensive.models

import ru.skillbranch.dev_intensive.utils.Utils
import java.util.*

data class User(
    val id: String,
    var firstName: String?,
    var lastName: String?,
    var avatar: String?,
    var rating: Int = 0,
    var respect: Int = 0,
    val lastVisit: Date? = null,
    val isOnline: Boolean = false

) {
    var introBit: String

    constructor(id: String, firstName: String?, lastName: String?) : this(
        id = id,
        firstName = firstName,
        lastName = lastName,
        avatar = null
    )

    constructor(id: String) : this(id, "John", "Doe")

    init {
        introBit = getIntro()

        println("I'm ilive!!!\n" +
                "${if (lastName === "Doe") "His name is $firstName $lastName" else "And his name is $firstName $lastName"}\n" +
                "${getIntro()}"
        )
    }

    private fun getIntro() ="""
        tu tu tu tu tu tu
        -----------------
    """.trimIndent()

    /**
     * Метод
     */
    fun printMe() = println(
        """
            id: $id
            firstName: $firstName
            lastName: $lastName
            avatar: $avatar
            rating:  $rating 
            respect:  $respect
            lastVisit: $lastVisit
            isOnline:  $isOnline
        """.trimIndent()
    )

    /***
     * Companion object обладает статическими функиями которые доступны из любой части кода.
     * Фабрика Factory удобна при создании экземпляры объектов, так же позволяет выполнять определенные преобразования перед созданием объекта.
     */

    companion object Factory{
        private var lastId = -1
        fun makeUser(fullName: String?): User{
            lastId ++

            val (firstName, lastName) = Utils.parseFullName(fullName)//функцию makUser дестркутуризировали вынесли вичесление объект Утилит

            return User(id = "$lastId", firstName = firstName, lastName = lastName)
        }
    }

}