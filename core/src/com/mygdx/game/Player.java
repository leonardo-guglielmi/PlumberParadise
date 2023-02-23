package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.InputProcessor;

public class Player implements InputProcessor{
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

    // specific methods for player class
    public void move(int deltaX, int deltaY) {
        this.posX = this.posX + deltaX * this.speed;
        this.posY = this.posY + deltaY * this.speed;
    }

    // overrided methods from com.badlogic.gdx.InputProcessor interface
    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        switch(character){
            case 'w':
                move(0,50);
                return true;
            case 's':
                move(0,-50);
                return true;
            case 'a':
                move(-50,0);
                return true;
            case 'd':
                move(50, 0);
                return true;
            default:
                return false;
        }

    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(float amountX, float amountY) {
        return false;
    }
}
