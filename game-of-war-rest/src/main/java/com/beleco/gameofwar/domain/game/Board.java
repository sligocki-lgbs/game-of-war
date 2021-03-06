package com.beleco.gameofwar.domain.game;

/**
 * Created by Everdark on 13.06.2017.
 */
public class Board {

    private Dot[][] state;
    private int size;
    private Long ownerId;

    public Dot[][] getState() {
        return state;
    }

    public void setState(Dot[][] state) {
        this.state = state;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }
}
