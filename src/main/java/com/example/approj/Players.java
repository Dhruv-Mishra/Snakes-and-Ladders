package com.example.approj;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Players {
    boolean unlocked;
    private ImageView player;
    private String name;
    private int coord;
    private int flag;
    Players(String name,String directory){
        Image i=new Image(directory);
        this.player=new ImageView();
        player.setImage(i);
        player.setX(-22);
        player.setY(400);
        player.setScaleX(0.24);
        player.setScaleY(0.24);
        this.coord=1;
        this.flag=1;
        this.name=name;
        this.unlocked=false;
    }
    public String getName(){
        return this.name;
    }
    public ImageView getPlayer(){
        return this.player;
    }
    public int getCoord(){
        return this.coord;
    }
    public int getFlag(){
        return this.flag;
    }
    public void setCoord(int coord){
        this.coord=coord;
    }
    public void setFlag(int flag){
        this.flag=flag;
    }
}
