package ru.skillbranch.dev_intensive.models

import ru.skillbranch.dev_intensive.extentions.format
import java.util.*

class ImageMessage(
    id: String,
    from:User?,
    chat: Chat,
    isIncoming: Boolean = false,
    date: Date = Date(),
    var image: String?
):BaseMessage(id, from, chat, isIncoming, date) {
    override fun formateMessage(): String =
                "id: $id " +
                "${from?.firstName} " +
                "${if (isIncoming) "получил" else "отправил"} " +
                "изображение \"$image\" " +
                "date: ${date.format()}"


}