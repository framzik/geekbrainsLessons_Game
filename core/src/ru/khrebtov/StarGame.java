package ru.khrebtov;

import com.badlogic.gdx.Game;

import ru.khrebtov.screen.MenuScreen;

public class StarGame extends Game {

    @Override
    public void create() {
        setScreen(new MenuScreen(this));
    }
}
