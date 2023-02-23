package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.Input;
public class Player {
    private int hp;
    private int posX;
    private int posY;
    private int speed;
    private int score;
    private Texture texture;

    //getter and setters
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getPosX() {
        return posX;
    }
    public void setPosX(int posX) {
        this.posX = posX;
    }
    public int getPosY() {
        return posY;
    }
    public void setPosY(int posY) {
        this.posY = posY;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public Texture getTexture() {
        return texture;
    }
    public void setTexture(Texture texture) {
        this.texture = texture;
    }

    //constructors
    public Player(Texture tx){
        this.hp = 10;
        this.speed = 2;
        this.score = 0;

        this.posX = 100;
        this.posY = 100;
        this.texture = tx;
    }

    public void move(int deltaX, int deltaY) {
        this.posX = this.posX + deltaX * this.speed;
        this.posY = this.posY + deltaY * this.speed;
    }
}
