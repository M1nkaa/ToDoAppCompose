# 📝 Todo App — Jetpack Compose

A clean, modern Android app for managing daily tasks, built entirely with Jetpack Compose.

## 📸 Screenshots

| Task List | Add Task |
|---|---|
| <img src="screenshots/screen_list.png" width="200"/> | <img src="screenshots/screen_add.png" width="200"/> |

## ✨ Features

- View list of tasks in a scrollable card-based UI
- Add a new task via the **+** button
- Mark tasks as done — completed tasks appear with strikethrough
- Delete tasks with a single tap
- Empty state hint when no tasks exist
- Navigate between screens with back button support

## 🛠 Tech Stack

- **Kotlin**
- **Jetpack Compose** — declarative UI
- **Material 3** — design system
- **ViewModel + StateFlow** — state management
- **Navigation Compose** — screen navigation

## 📁 Project Structure

```
app/src/main/
└── java/com/m1nkaa/todoappcompose/
    ├── MainActivity.kt         # Entry point, NavHost setup
    ├── Task.kt                 # Data model
    ├── TaskViewModel.kt        # Business logic with StateFlow
    └── ui/
        ├── TaskListScreen.kt   # Task list UI
        └── AddTaskScreen.kt    # Add task UI
```

## ▶️ Getting Started

1. Clone the repository
```bash
git clone https://github.com/M1nkaa/TodoAppCompose.git
```
2. Open in **Android Studio**
3. Run on an emulator or real device (API 24+)

## 📚 What I Learned

- Building UI with **Jetpack Compose** composable functions
- Managing state with `ViewModel` + `StateFlow` + `collectAsState()`
- Screen navigation using **Navigation Compose**
- **Material 3** components: `Scaffold`, `TopAppBar`, `Card`, `FAB`
- State hoisting and reactive UI updates
- Git flow: branches, commits, tags, rebase
