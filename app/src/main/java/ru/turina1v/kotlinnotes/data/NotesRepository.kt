package ru.turina1v.kotlinnotes.data

import ru.turina1v.kotlinnotes.data.entity.Note

object NotesRepository {
    private val notes: List<Note> = listOf(
        Note("Первая заметка", "Текст первой заметки", 0xff9575cd.toInt()),
        Note("Вторая заметка", "Текст второй заметки", 0xff9575cd.toInt()),
        Note("Третья заметка", "Текст третей заметки", 0xff9575cd.toInt()),
        Note("Четвертая заметка", "Текст четвертой заметки", 0xff9575cd.toInt()),
        Note("Пятая заметка", "Текст пятой заметки", 0xff9575cd.toInt())
    )

    fun getNotes(): List<Note> {
        return notes;
    }
}