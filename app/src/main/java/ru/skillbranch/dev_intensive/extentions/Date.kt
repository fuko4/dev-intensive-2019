package ru.skillbranch.dev_intensive.extentions

import ru.skillbranch.dev_intensive.models.User
import java.lang.IllegalStateException
import java.util.*

const val SECOND = 1000L
const val MINUTE = 60 * SECOND
const val HOUR = 60 * MINUTE
const val DAY = 24 * HOUR

/***
 * Extention функиця генерирует статическую функцию которую можно применить к экзеампляру определенного класса
 */
fun Date.format(pattern: String = "HH:mm:ss dd.MM.yy"): String {
    val dateFormate = java.text.SimpleDateFormat(pattern, Locale("ru"))
    return dateFormate.format(this)
}

/**
 * Функция изменяет время относительно заданного шаблона Date.add(value: -2, units: "second") - уменьшает текущее время на 2 секунды(2 секунды назад)
 */
var diffValue = 0
var difUnits: TimeUnits = TimeUnits.SECOND

fun Date.add(value: Int, units: TimeUnits = TimeUnits.SECOND): Date {
    var time = this.time

    time += when (units) {
        TimeUnits.SECOND -> value * SECOND
        TimeUnits.MINUTE -> value * MINUTE
        TimeUnits.HOUR -> value * HOUR
        TimeUnits.DAY -> value * DAY
    }
    this.time = time

    diffValue = value
    difUnits = units

    return this
}
fun Date.humanizeDiff(date: Date = Date()):Date{
    return  date
}

/**
 * Класс перечисления
 */
enum class TimeUnits {
    SECOND,
    MINUTE,
    HOUR,
    DAY
}
