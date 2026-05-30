package com.m1nkaa.todoappcompose

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class TaskViewModel : ViewModel() {

    private val _tasks = MutableStateFlow<List<Task>>(emptyList())
    val tasks: StateFlow<List<Task>> = _tasks.asStateFlow()

    fun addTask(title: String) {
        val newTask = Task(id = _tasks.value.size + 1, title = title)
        _tasks.value = _tasks.value + newTask
    }

    fun deleteTask(task: Task) {
        _tasks.value = _tasks.value.filter { it.id != task.id }
    }

    fun toggleTask(task: Task) {
        _tasks.value = _tasks.value.map {
            if (it.id == task.id) it.copy(isDone = !it.isDone) else it
        }
    }
}