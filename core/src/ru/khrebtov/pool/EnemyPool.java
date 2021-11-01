package ru.khrebtov.pool;

import com.badlogic.gdx.audio.Sound;

import ru.khrebtov.base.SpritesPool;
import ru.khrebtov.math.Rect;
import ru.khrebtov.sprite.EnemyShip;


public class EnemyPool extends SpritesPool<EnemyShip> {

    private final BulletPool bulletPool;
    private final ExplosionPool explosionPool;
    private final Rect worldBounds;
    private final Sound bulletSound;

    public EnemyPool(BulletPool bulletPool, ExplosionPool explosionPool, Rect worldBounds, Sound bulletSound) {
        this.bulletPool = bulletPool;
        this.explosionPool = explosionPool;
        this.worldBounds = worldBounds;
        this.bulletSound = bulletSound;
    }

    @Override
    protected EnemyShip newObject() {
        return new EnemyShip(bulletPool, explosionPool, worldBounds, bulletSound);
    }
}
