package com.example.approj;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    public ImageView exit_button;
    public void closeGame(){this_stage.close();}

    @FXML
    public TextField p1_input;
    @FXML
    public TextField p2_input;

    @FXML
    public ImageView play_button;
    @FXML
    public ImageView play_back;
    @FXML
    public AnchorPane choose_menu;

    @FXML
    public ImageView back;
    @FXML
    public AnchorPane main_pane;
    @FXML
    public AnchorPane menu_pane;
    @FXML
    public ImageView menu_button;
    @FXML
    private AnchorPane background_pane;

    Board b=new Board();
    Random r=new Random();

    @FXML
    public Text p1_name;
    @FXML
    public Text p2_name;
    public Players[] p1p2=new Players[2];
    public int curr_chance;
    @FXML
    public Button hide_anchor;
    @FXML
    public void setHide_anchor(){
        menu_pane.setDisable(true);
        menu_pane.setVisible(false);
        choose_menu.setVisible(true);
        choose_menu.setDisable(false);}
    public void back_button2(){
        background_pane.setDisable(true);
        background_pane.setVisible(false);
        pause_pane.setVisible(true);
        pause_pane.setDisable(false);
    }
    @FXML
    public void play_press(){
        if(p1p2[0]!=null) resetGame();
        choose_menu.setDisable(true);
        choose_menu.setVisible(false);
        value=1;
        temp_paneswitch=1;
        after_choose(p1_input.getCharacters().toString(),p2_input.getCharacters().toString());}

    @FXML
    private ImageView dice;

    @FXML
    private ImageView chance_pane;
    public Stage this_stage;
    @FXML
    public void stage_assign(Stage s){this_stage=s;}

    @FXML
    protected int setDieFace(ImageView i){
        int x=(r. nextInt(6)+1);
        Image image = new Image("C:\\Users\\Dhruv\\IdeaProjects\\APproj\\src\\main\\resources\\com\\example\\approj\\faces2\\"+x+".png");
        i.setImage(image);
        return x;}
    private volatile int value=1;
    private int temp_paneswitch=1;
    @FXML
    void chance() throws InterruptedException {
        if(curr_chance==1){
            curr_chance--;
            p1_name.setOpacity(1);
            p2_name.setOpacity(0.1);}
        else{
            curr_chance++;
            p1_name.setOpacity(0.1);
            p2_name.setOpacity(1);}
        rollDie(p1p2[curr_chance]);}
    private int flagg=-1;
   void rollDie(Players p) throws InterruptedException {
        if(temp_paneswitch==1) {temp_paneswitch++;}
        else{temp_paneswitch--;}
        Image image = new Image("C:\\Users\\Dhruv\\IdeaProjects\\APproj\\src\\main\\resources\\com\\example\\approj\\pieces\\p"+temp_paneswitch+"_chance.png");
        chance_pane.setImage(image);
        Thread t=new Thread(){
            public void run() {
                arrow.setVisible(false);
                dice.setDisable(true);
            if(true) {
                for (int i = 0; i < 15; i++) {
                    double val2=value+0.5;
                    Image image = new Image("C:\\Users\\Dhruv\\IdeaProjects\\APproj\\src\\main\\resources\\com\\example\\approj\\faces2\\"+val2+".png");
                    dice.setImage(image);
                    try {
                        Thread.sleep(24);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    value = setDieFace(dice);// NUMBER OF MOVES IT WILL MAKE STARTING FROM 1
                    try {
                        Thread.sleep(22);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int xx = value;
                if(p.unlocked){
                if (xx + p.getCoord() <= 100) {
                    for (int i = 0; i < xx; i++) {
                        supportMove(-6,p.getPlayer());
                        try {
                            Thread.sleep(30);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        move(p);
                        try {
                            Thread.sleep(300);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        supportMove(6,p.getPlayer());
                        try {
                            Thread.sleep(30);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    int sid=-1;            //insert wait of 2 seconds here if sid==-1;  (currently wait in followSnake in board()
                    ArrayList<Integer> temp11=b.getSnakes_int();
                    for(int i=0;i<temp11.size();i++){
                        if(p.getCoord()==temp11.get(i)){
                            sid=i;
                            b.followSnake(b.getSnakes().get(i),p.getPlayer(),dice);
                            break;}}

                    Ladder ladder = b.climb(p.getCoord(), p.getPlayer());
                    if (ladder != null || sid!=-1) {
                        if(ladder!=null) {
                            if ((int) (ladder.getEnd_y() + 1 / 43) % 2 == 1) {
                                p.setFlag(-p.getFlag());}
                            p.setCoord(ladder.getEnd());}
                        else{
                            p.setCoord(b.getSnakes().get(sid).getEnd());
                            if(((p.getCoord()-1)/10)%2==1){
                                p.setFlag(-1);}
                            else{
                                p.setFlag(1);}}}}}
                else{
                    if(xx==1){
                        supportMove(-40,p.getPlayer());
                        p.unlocked=true;}}}
                dice.setDisable(false);
                if(p.getCoord()==100){
                    if(p==p1p2[0]) {
                        player_win(p.getName(), p1p2[1].getName());
                    }
                    else{
                        player_win(p.getName(), p1p2[0].getName());
                    }
                }
                else{
                    arrow.setVisible(true);
                }}};
        t.start();
    }
    @FXML
    private AnchorPane winpane;
    @FXML
    private Text winner;
    @FXML
    private Text loser;
    @FXML
    public void player_win(String name,String losername){
        winpane.setVisible(true);
        winpane.setDisable(false);
        background_pane.setDisable(true);
        background_pane.setVisible(false);
        winner.setText(name);
        loser.setText(losername);
        resetGame();
    }
    @FXML
    public void replay_func(){
        winpane.setVisible(false);
        winpane.setDisable(true);
        if(p1p2[0]!=null) resetGame();
        play_press();
    }
    @FXML
    public ImageView arrow;
    public void arrow_animation(){
        TranslateTransition translate = new TranslateTransition();
        translate.setNode(arrow);
        translate.setDuration(Duration.millis(300));
        translate.setCycleCount(TranslateTransition.INDEFINITE);
        translate.setByY(20);
        translate.setAutoReverse(true);
        translate.play();}

    public void move(Players p){
        if(p.getCoord()<=100) {
            if (p.getCoord() % 10 != 0) {
                TranslateTransition translate = new TranslateTransition();
                translate.setNode(p.getPlayer());
                translate.setDuration(Duration.millis(300));
                translate.setByX(30 * p.getFlag());
                p.setCoord(p.getCoord()+1);
                translate.play();
            } else {
                TranslateTransition translate = new TranslateTransition();
                translate.setNode(p.getPlayer());
                translate.setDuration(Duration.millis(300));
                translate.setByY(-43);
                p.setCoord(p.getCoord()+1);
                p.setFlag(-p.getFlag());
                translate.play();}}}

    public void supportMove(int y,ImageView p){
        TranslateTransition translate = new TranslateTransition();
        translate.setNode(p);
        translate.setDuration(Duration.millis(20));
        translate.setByY(y);
        translate.play();}

    @FXML
    public ImageView ripple;

    @FXML
    public void ripples(MouseEvent event){
        Thread tt=new Thread() {
            public void run () {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();}
                if(true){
                background_pane.setDisable(true);
                double x=event.getSceneX();
                double y=event.getSceneY();
                ripple.setY(y-271);
                ripple.setX(x+216);
                ripple.setVisible(true);

        for(int i = 0; i< 19;i++) {
            Image image = new Image("C:\\Users\\Dhruv\\IdeaProjects\\APproj\\src\\main\\java\\com\\example\\approj\\ripple\\frame-"+(i+1)+".png");
            ripple.setImage(image);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();}}

        ripple.setVisible(false);
                background_pane.setDisable(false);}}};
        tt.start();
        }

    public void after_choose(String p1,String p2){
        background_pane.setVisible(true);
        background_pane.setDisable(false);
        Players blue = new Players(p1,"C:\\Users\\Dhruv\\IdeaProjects\\APproj\\src\\main\\resources\\com\\example\\approj\\pieces\\bluepiece.png");
        Players green = new Players(p2,"C:\\Users\\Dhruv\\IdeaProjects\\APproj\\src\\main\\resources\\com\\example\\approj\\pieces\\greenpiece.png");
        background_pane.getChildren().add(blue.getPlayer());
        background_pane.getChildren().add(green.getPlayer());
        p1p2[0]=blue;
        p1p2[1]=green;
        curr_chance=0;
        p1_name.setText(blue.getName());
        p2_name.setText(green.getName());
        p1_name.setOpacity(1);
        p2_name.setOpacity(0.1);}

    public void resetGame(){
        background_pane.getChildren().remove(p1p2[0].getPlayer());
        background_pane.getChildren().remove(p1p2[1].getPlayer());
        value=1;
        temp_paneswitch=1;
    }
    @FXML
    public void endGame(){
        resetGame();
        back_button();
    }
    @FXML
    public AnchorPane pause_pane;
    @FXML
    public void nullBack(){
        pause_pane.setVisible(false);
        pause_pane.setDisable(true);
        background_pane.setDisable(false);
        background_pane.setVisible(true);
    }
    @FXML
    public void back_button(){
        background_pane.setDisable(true);
        background_pane.setVisible(false);
        winpane.setDisable(true);
        winpane.setVisible(false);
        pause_pane.setDisable(true);
        pause_pane.setVisible(false);
        menu_pane.setVisible(true);
        menu_pane.setDisable(false);}

    @FXML
    public void menushow(){
        choose_menu.setVisible(false);
        choose_menu.setDisable(true);
        background_pane.setDisable(true);
        background_pane.setVisible(false);
        menu_pane.setVisible(true);
        menu_pane.setDisable(false);}

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        pause_pane.setDisable(true);
        pause_pane.setVisible(false);
        winpane.setVisible(false);
        winpane.setDisable(true);
        choose_menu.setVisible(false);
        choose_menu.setDisable(true);
        background_pane.setDisable(true);
        background_pane.setVisible(false);
        menu_pane.setVisible(true);
        menu_pane.setDisable(false);
    }
}