package com.example.approj;

import javafx.scene.shape.Polyline;

public class Snake {
    private int start;
    private int end;
    private double end_x,end_y;
    private Polyline s;
    Snake(int start,int end,Polyline s){
        this.start=start;
        this.end=end;
        this.s=s;
    }
    public Polyline getS(){
        return this.s;
    }
    public int getEnd(){
        return this.end;
    }
}
