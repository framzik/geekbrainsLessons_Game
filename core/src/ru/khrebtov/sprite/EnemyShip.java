package ru.khrebtov.sprite;

import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

import ru.khrebtov.base.Ship;
import ru.khrebtov.math.Rect;
import ru.khrebtov.pool.BulletPool;

public class EnemyShip extends Ship {
    private Vector2 startV = new Vector2(0, -0.8f);
    private Vector2 v3 = new Vector2();
    int fistBullet = 0;

    public EnemyShip(BulletPool bulletPool, Rect worldBounds, Sound bulletSound) {
        this.bulletPool = bulletPool;
        this.worldBounds = worldBounds;
        this.bulletSound = bulletSound;
        this.bulletV = new Vector2();
        this.bulletPos = new Vector2();
        this.v = new Vector2();
        this.v0 = new Vector2();
    }

    @Override
    public void update(float delta) {
        super.update(delta);
        if (getTop() <= worldBounds.getTop()) {
            v.set(v3);
            if (fistBullet==0){
                shoot();
                fistBullet++;
            }
        }

        if (getBottom() < worldBounds.getBottom()) {
            destroy();
        }
    }

    public void set(
            TextureRegion[] regions,
            Vector2 v,
            TextureRegion bulletRegion,
            float bulletHeight,
            Vector2 bulletV,
            int damage,
            int hp,
            float reloadInterval,
            float height
    ) {
        this.regions = regions;
        this.v.set(startV);
        this.v3.set(v);
        this.bulletRegion = bulletRegion;
        this.bulletHeight = bulletHeight;
        this.bulletV.set(bulletV);
        this.damage = damage;
        this.hp = hp;
        this.reloadInterval = reloadInterval;
        setHeightProportion(height);
    }
}
