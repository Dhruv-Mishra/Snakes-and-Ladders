package com.example.approj;

import javafx.animation.PathTransition;
import javafx.animation.TranslateTransition;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polyline;
import javafx.util.Duration;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class Board {
    private ArrayList<Ladder> ladders=new ArrayList<Ladder>();
    private ArrayList<Integer> ladder_int=new ArrayList<>();
    private ArrayList<Snake> snakes=new ArrayList<Snake>();
    private ArrayList<Integer> snakes_int=new ArrayList<>();
    Board(){
        addLadder(4,25);
        addLadder(8,31);
        addLadder(21,60);
        addLadder(28,46);
        addLadder(32,48);
        addLadder(42,80);
        addLadder(52,68);
        addLadder(58,77);
        addLadder(69,93);
        addLadder(84,98);
        Polyline s1=new Polyline();
        s1.getPoints().addAll(new Double[]{313.6,387.2, 305.6,390.4, 296.8,393.6, 291.2,398.4, 287.2,403.2, 284.0,409.6, 284.0,415.2, 289.6,418.4, 294.4,422.4, 299.2,424.8, 305.6,429.6, 308.0,435.2, 300.0,440.8, 291.2,440.8, 283.2,436.8, 277.6,435.2, 278.4,428.8,});
        addSnakes(11,9,s1);
        Polyline s2=new Polyline();
        s2.getPoints().addAll(new Double[]{164.8,300.8, 170.4,304.8, 180.0,308.0, 191.2,313.6, 199.2,317.6, 202.4,326.4, 195.2,333.6, 181.6,341.6, 173.6,344.0, 167.2,352.0, 171.2,358.4, 181.6,362.4, 190.4,364.0, 202.4,364.0, 212.0,368.0, 217.6,372.0, 212.0,376.8, 204.8,380.8, 206.4,384.8, 211.2,386.4, 218.4,388.0,});
        addSnakes(36,14,s2);
        Polyline s3=new Polyline();
        s3.getPoints().addAll(new Double[]{102.4,258.4, 90.4,264.0, 78.4,268.8, 73.6,276.0, 73.6,284.8, 73.6,293.6, 77.6,300.8, 84.0,306.4, 88.8,312.0, 94.4,317.6, 96.0,326.4, 87.2,332.8, 79.2,333.6, 72.0,337.6, 68.8,344.8,});
        addSnakes(43,22,s3);
        Polyline s4=new Polyline();
        s4.getPoints().addAll(new Double[]{158.4,216.0, 150.4,222.4, 142.4,224.8, 134.4,229.6, 128.8,234.4, 124.8,239.2, 122.4,244.8, 121.6,254.4, 121.6,262.4, 127.2,264.8, 130.4,272.0, 135.2,276.8, 140.8,282.4, 148.0,287.2, 152.0,292.0, 154.4,300.0, 154.4,308.0, 148.0,310.4, 141.6,314.4, 133.6,318.4, 122.4,318.4, 114.4,322.4, 108.8,326.4, 106.4,335.2, 110.4,340.8, 116.0,343.2, 124.0,343.2, 130.4,344.0, 138.4,344.8, 142.4,350.4, 143.2,356.0, 140.8,360.0, 136.0,364.8, 126.4,368.8, 120.8,372.8, 110.4,376.0, 101.6,380.8, 98.4,387.2,});
        addSnakes(56,18,s4);
        Polyline s5=new Polyline();
        s5.getPoints().addAll(new Double[]{190.4,131.2, 194.4,136.8, 201.6,138.39999999999998, 208.8,143.2, 213.6,148.8, 217.6,155.2, 217.6,164.8, 215.2,171.2, 208.0,177.6, 203.2,184.8, 197.6,189.6, 193.6,196.8, 197.6,204.8, 204.8,207.2, 212.0,209.6, 217.6,211.2, 220.8,219.2,});
        addSnakes(75,54,s5);
        Polyline s6=new Polyline();
        s6.getPoints().addAll(new Double[]{
                39.2,91.19999999999999,
                46.4,96.0,
                54.4,98.39999999999998,
                61.6,100.80000000000001,
                69.6,107.19999999999999,
                72.8,114.39999999999998,
                66.4,120.80000000000001,
                59.2,126.39999999999998,
                49.6,131.2,
                41.6,134.39999999999998,
                36.8,142.39999999999998,
                41.6,146.39999999999998,
                49.6,148.8,
                57.6,151.2,
                65.6,152.8,
                73.6,154.39999999999998,
                81.6,155.2,
                86.4,158.39999999999998,
                88.8,162.39999999999998,
                81.6,167.2,
                74.4,168.8,
                76.8,172.0,
                81.6,176.0,
                89.6,176.8,
                104.0,176.0,
        });
        addSnakes(81,63,s6);
        Polyline s7=new Polyline();
        s7.getPoints().addAll(new Double[]{
                310.4,90.39999999999998,
                308.0,96.80000000000001,
                308.0,104.0,
                312.0,107.19999999999999,
                314.4,112.0,
                315.2,118.39999999999998,
                315.2,124.80000000000001,
                312.8,131.2,
                308.8,132.8,
                304.0,140.0,
                301.6,146.39999999999998,
                302.4,152.0,
                306.4,156.0,
                310.4,163.2,
                312.0,168.8,
                309.6,176.8,
                305.6,184.0,
                305.6,188.8,
                305.6,199.2,
                308.8,203.2,
                314.4,208.8,
                316.0,214.4,
                312.8,224.0,
                308.8,231.2,
                305.6,236.8,
                302.4,242.4,
                302.4,248.0,
                307.2,255.2,
                310.4,260.8,
        });
        addSnakes(90,50,s7);
        Polyline s8=new Polyline();
        s8.getPoints().addAll(new Double[]{
                220.8,48.80000000000001,
                227.2,51.19999999999999,
                232.8,55.19999999999999,
                240.0,58.39999999999998,
                244.0,64.80000000000001,
                246.4,71.19999999999999,
                247.2,78.39999999999998,
                247.2,85.60000000000002,
                241.6,87.19999999999999,
                238.4,90.39999999999998,
                236.8,94.39999999999998,
                229.6,99.19999999999999,
                226.4,105.60000000000002,
                224.0,110.39999999999998,
                222.4,118.39999999999998,
                224.0,125.60000000000002,
                228.0,129.60000000000002,
                234.4,131.2,
                238.4,135.2,
                244.0,139.2,
                247.2,145.60000000000002,
                250.4,152.8,
                250.4,160.8,
                244.8,164.8,
                236.8,168.8,
                232.0,173.60000000000002,
                224.8,176.8,
                220.8,182.4,
                220.8,190.4,
                223.2,197.6,
                231.2,203.2,
                240.8,208.8,
                248.8,213.6,
                252.0,218.4,
        });
        addSnakes(94,53,s8);
        Polyline s9=new Polyline();
        s9.getPoints().addAll(new Double[]{
                158.4,47.19999999999999,
                160.8,52.80000000000001,
                162.4,57.60000000000002,
                160.8,60.80000000000001,
                156.0,65.60000000000002,
                154.4,69.60000000000002,
                154.4,73.60000000000002,
                153.6,79.19999999999999,
                156.0,84.80000000000001,
                160.0,91.19999999999999,
                164.8,95.19999999999999,
                164.8,102.39999999999998,
                166.4,109.60000000000002,
                164.0,115.19999999999999,
                160.0,119.19999999999999,
                158.4,124.80000000000001,
                157.6,129.60000000000002,
                160.0,136.8,
                164.0,143.2,
                164.0,148.8,
                161.6,154.39999999999998,
                158.4,158.39999999999998,
                156.0,162.39999999999998,
                154.4,166.39999999999998,
                156.8,171.2,
                160.8,172.0,
        });
        addSnakes(96,65,s9);
        Polyline s10=new Polyline();
        s10.getPoints().addAll(new Double[]{
                72.0,48.0,
                76.8,51.19999999999999,
                84.0,54.39999999999998,
                92.0,56.0,
                96.8,60.0,
                100.8,66.39999999999998,
                103.2,75.19999999999999,
                103.2,81.60000000000002,
                100.0,89.60000000000002,
                94.4,93.60000000000002,
                89.6,98.39999999999998,
                84.0,103.19999999999999,
                80.8,108.0,
                80.8,116.0,
                84.8,120.0,
                92.8,121.60000000000002,
                99.2,124.0,
                104.0,128.0,
                104.8,132.0,
        });
        addSnakes(99,78,s10);

    }

    public ArrayList<Ladder> getLadders(){
        return this.ladders;
    }
    public void addLadder(int start,int end){
        double endy = ((int)(end-1)/10)-((int)(start-1)/10);
        double endx=(end%10)-(start%10);
        if(end%10!=0) {
            if (endy % 2 == 0) {
                if ((int) (start / 10) % 2 == 1) {
                    endx = -endx;}
            } else {
                endx = 11 - (end % 10) - (start % 10);
                if ((int) (start / 10) % 2 == 1) {
                    endx = -endx;}}}
        else{
            if(endy%2==1){
                endx=start%10-1;}
            else{
                endx=start%10-10;}
            if((int)(start/10)%2==0){
                endx=-endx;}}
        Ladder l=new Ladder(start,end,30*endx,43*endy);
        ladders.add(l);
        ladder_int.add(start);}

    public Ladder climb(int start,ImageView c){
        int x=isLadder(start);
        if(x!=-1){
            Ladder l=ladders.get(x);
            mid_climb(l,c);
            return l;}
        return null;}

    public void mid_climb(Ladder l, ImageView c){
        TranslateTransition translate = new TranslateTransition();
        translate.setNode(c);
        translate.setDuration(Duration.millis(300));
        translate.setByX(l.getEnd_x());
        translate.setByY(-l.getEnd_y());
        translate.play();}

    public int isLadder(int start){
        for(int i=0;i<ladder_int.size();i++){
            if(start==ladder_int.get(i)){
                return i;}}
        return -1;}

    public void followSnake(Snake s, ImageView c, ImageView dice){
        Thread t=new Thread() {
            public void run() {
                dice.setDisable(true);
                PathTransition t = new PathTransition();
                t.setNode(c);
                t.setDuration(Duration.seconds(2));
                t.setPath(s.getS());
                t.play();
                try {
                    Thread.sleep(2000);}
                catch(InterruptedException e){
                    e.printStackTrace();}
                dice.setDisable(false);}};
        t.start();
    }

    public void addSnakes(int start,int end,Polyline p){
        Snake S=new Snake(start,end,p);
        snakes.add(S);
        snakes_int.add(start);}
    public ArrayList<Integer> getSnakes_int(){return this.snakes_int;}
    public ArrayList<Snake> getSnakes(){return this.snakes;}
}
