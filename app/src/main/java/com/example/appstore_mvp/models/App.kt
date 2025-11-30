package com.example.appstore_mvp.models

import androidx.compose.ui.graphics.Color

data class App(
    val id: Int,
    val name: String,
    val description: String,
    val rating: Float,
    val category: String,
    val iconColor: Color,
    val isInstalled: Boolean = false
)