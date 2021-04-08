package me.hazedev.game.input

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.badlogic.gdx.InputAdapter

class InputToggleFullscreen : InputAdapter() {

    override fun keyDown(keycode: Int): Boolean {
        if (keycode == Input.Keys.F11) {
            if (Gdx.graphics.isFullscreen) {
                Gdx.graphics.setWindowedMode(Gdx.graphics.width / 2, Gdx.graphics.height / 2)
            } else {
                Gdx.graphics.setFullscreenMode(Gdx.graphics.displayMode)
            }
            return false;
        }
        return true;
    }

}
