package ru.skillbranch.dev_intensive.models

class Chat(
    val id: String,
    val user: MutableList<User> = mutableListOf(),
    val messages: MutableList<BaseMessage> = mutableListOf()
) {
}