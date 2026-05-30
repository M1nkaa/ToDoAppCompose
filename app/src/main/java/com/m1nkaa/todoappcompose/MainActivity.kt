package com.m1nkaa.todoappcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.m1nkaa.todoappcompose.ui.AddTaskScreen
import com.m1nkaa.todoappcompose.ui.TaskListScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MaterialTheme {
                Surface {
                    val navController = rememberNavController()
                    val viewModel: TaskViewModel = viewModel()

                    NavHost(
                        navController = navController,
                        startDestination = "task_list"
                    ) {
                        composable("task_list") {
                            TaskListScreen(
                                onNavigateToAdd = {
                                    navController.navigate("add_task")
                                },
                                viewModel = viewModel
                            )
                        }
                        composable("add_task") {
                            AddTaskScreen(
                                onNavigateBack = {
                                    navController.popBackStack()
                                },
                                viewModel = viewModel
                            )
                        }
                    }
                }
            }
        }
    }
}