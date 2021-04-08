package me.hazedev.game

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration

fun main() {
    val displayMode = Lwjgl3ApplicationConfiguration.getDisplayMode()
    val config = Lwjgl3ApplicationConfiguration()
    config.setFullscreenMode(displayMode)
    Lwjgl3Application(GameTemplate(), config)
}
