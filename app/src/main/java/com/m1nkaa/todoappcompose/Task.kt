package com.m1nkaa.todoappcompose

data class Task(
    val id: Int,
    val title: String,
    val isDone: Boolean = false
)