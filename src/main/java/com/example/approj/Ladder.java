package com.example.approj;
import javafx.scene.paint.Color;

public class Ladder {
    private double start_x, start_y;
    private double end_x,end_y;
    private int start,end;
    Ladder(int start,int end,double end_x,double end_y){
       this.start=start;
       this.end=end;
       this.end_x=end_x;
       this.end_y=end_y;
    }
    public double getStart_x(){
        return this.start_x;
    }
    public double getStart_y(){
        return  this.start_y;
    }
    public double getEnd_x(){
        return this.end_x;
    }
    public double getEnd_y(){
        return this.end_y;
    }
    public int getStart(){
        return this.start;
    }
    public int getEnd(){
        return this.end;
    }

}
