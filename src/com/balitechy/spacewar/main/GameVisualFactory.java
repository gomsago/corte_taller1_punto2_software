package com.balitechy.spacewar.main;

public interface GameVisualFactory {

    PlayerView createPlayer(int x, int y, Game game);

    BulletView createBullet(int x, int y);

    BackgroundView createBackground(Game game);
}
