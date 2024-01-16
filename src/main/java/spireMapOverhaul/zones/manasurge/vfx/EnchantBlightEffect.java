package spireMapOverhaul.zones.manasurge.vfx;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.megacrit.cardcrawl.core.CardCrawlGame;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.vfx.AbstractGameEffect;
import spireMapOverhaul.zones.manasurge.ManaSurgeZone;

public class EnchantBlightEffect extends AbstractGameEffect {
    private final float x;
    private final float y;

    public EnchantBlightEffect(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void update() {
        CardCrawlGame.sound.play(ManaSurgeZone.ENCHANTBLIGHT_KEY);
        int i;
        for(i = 0; i < 75; ++i) {
            AbstractDungeon.topLevelEffectsQueue.add(new ManaFlameParticleEffect(this.x, this.y));
        }

        for(i = 0; i < 20; ++i) {
            AbstractDungeon.topLevelEffectsQueue.add(new ManaExhaustEmberEffect(this.x, this.y));
        }
        this.isDone = true;
    }

    public void render(SpriteBatch sb) {
    }

    public void dispose() {
    }
}
