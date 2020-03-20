package ru.skillbranch.dev_intensive.models

class UserView(
    val id: String,
    val fulName: String,
    val nickname: String,
    var avatar: String? = null,
    var status: String? = "offline",
    val initials: String?
) {
    fun printMe(){
        println("""
            id: $id
            fulName: $fulName
            nickname: $nickname
            avatar: $avatar
            status: $status
            initials: $initials
        """.trimIndent())
    }
}