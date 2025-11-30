package com.example.appstore_mvp.utils

import androidx.compose.ui.graphics.Color
import com.example.appstore_mvp.models.App

class AppRepository {
    private var nextId = 1

    fun getApps(): List<App> = listOf(
        App(
            id = nextId++,
            name = "Telegram",
            description = "Быстрый и безопасный мессенджер с облачным хранением и сквозным шифрованием. Отправляйте сообщения, фото, видео и файлы любого типа.",
            rating = 4.7f,
            category = "Социальные сети",
            iconColor = Color(0xFF0088CC)
        ),
        App(
            id = nextId++,
            name = "YouTube",
            description = "Смотрите миллионы видео на любую тему в высоком качестве. Подписывайтесь на каналы, создавайте плейлисты и делитесь контентом.",
            rating = 4.8f,
            category = "Видео",
            iconColor = Color(0xFFFF0000)
        ),
        App(
            id = nextId++,
            name = "Spotify",
            description = "Слушайте музыку и подкасты с персональными рекомендациями. Создавайте плейлисты и слушайте оффлайн.",
            rating = 4.5f,
            category = "Музыка",
            iconColor = Color(0xFF1DB954)
        ),
        App(
            id = nextId++,
            name = "WhatsApp",
            description = "Простой и надежный мессенджер с end-to-end шифрованием. Совершайте звонки, отправляйте сообщения и медиафайлы.",
            rating = 4.6f,
            category = "Мессенджер",
            iconColor = Color(0xFF25D366)
        ),
        App(
            id = nextId++,
            name = "Google Карты",
            description = "Навигация и карты с пробками, маршрутами и поиском мест. Оффлайн-карты и голосовые подсказки.",
            rating = 4.4f,
            category = "Навигация",
            iconColor = Color(0xFF4285F4)
        ),
        App(
            id = nextId++,
            name = "Instagram",
            description = "Делайте фото и видео, применяйте фильтры и делитесь ими с друзьями. Stories, Reels и прямые трансляции.",
            rating = 4.3f,
            category = "Социальные сети",
            iconColor = Color(0xFFE4405F)
        )
    )

    fun getAppColor(appId: Int): Color {
        return when (appId % 6) {
            1 -> Color(0xFF0088CC)
            2 -> Color(0xFFFF0000)
            3 -> Color(0xFF1DB954)
            4 -> Color(0xFF25D366)
            5 -> Color(0xFF4285F4)
            else -> Color(0xFFE4405F)
        }
    }
}