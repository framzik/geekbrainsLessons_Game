package ru.khrebtov.pool;


import ru.khrebtov.base.SpritesPool;
import ru.khrebtov.sprite.Bullet;

public class BulletPool extends SpritesPool<Bullet> {
    @Override
    protected Bullet newObject() {
        return new Bullet();
    }
}