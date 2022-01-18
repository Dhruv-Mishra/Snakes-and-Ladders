package com.example.approj;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Random;

public class Dice extends Thread{
    Random r=new Random();
    private int value;
    private ImageView dice;
    private Dice d=new Dice();
    protected int val(){
        int x=(r. nextInt(6)+1);
        Image image = new Image("C:\\Users\\Dhruv\\IdeaProjects\\APproj\\src\\main\\resources\\com\\example\\approj\\faces\\"+x+".png");
        dice.setImage(image);
        return x;
    }
    public void run(){
        if(true) {
            for (int i = 0; i < 15; i++) {
                value = val();
                try {
                    Thread.sleep(40);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public void roll(){
        d.start();
    }
    public int getValue(){
        return this.value;
    }
}
