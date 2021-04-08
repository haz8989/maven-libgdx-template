package me.hazedev.game

import com.badlogic.gdx.Game
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.InputMultiplexer
import me.hazedev.game.input.InputToggleFullscreen
import me.hazedev.game.screen.ScreenMainMenu

class GameTemplate : Game() {

    val inputMultiplexer = InputMultiplexer()

    override fun create() {
        Gdx.graphics.setTitle("Game Template")
        inputMultiplexer.addProcessor(InputToggleFullscreen())
        Gdx.input.inputProcessor = inputMultiplexer
        screen = ScreenMainMenu(this)
    }

}

