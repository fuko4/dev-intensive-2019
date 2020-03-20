package ru.skillbranch.dev_intensive.extentions

import ru.skillbranch.dev_intensive.models.User
import ru.skillbranch.dev_intensive.models.UserView
import ru.skillbranch.dev_intensive.utils.Utils
import java.util.*

/**
 *Extention функция которая будет из превращать экземпляр Data класса User в объект UserView
 * и возвращать его
 * Фунция .toUserView - функция расширения для класса User
 **/

fun User.toUserView(): UserView {

    val nickName = "nickName функция еще не реализована"/*Utils.transliteration("$firstName $lastName", " ")*/
    val initials ="initials функция инициалов еще не реализована" /*Utils.toInitials(firstName, lastName)*/
    val status = if (lastVisit == null) "Еще ни разу не был!"
    else if (isOnline) "Online"
    else "Последний раз был ..."
    //else "Последний раз был ${lastVisit.humanizeDiff()}"

    return UserView(
        id,
        fulName = "$firstName $lastName",
        avatar = avatar,
        nickname = nickName,
        status = status,
        initials = initials
    )
}