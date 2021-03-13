
package assignment3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Rectangle;


public class Assignment3 extends Application{
   public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        
      Line leftLine = new Line(400,-200,0,0);
      leftLine.setStrokeWidth(4);
      Line rightLine = new Line(400,-200,800,0);
      rightLine.setStrokeWidth(4);   
      Line bottomLine = new Line(0,0,800,0);
      bottomLine.setStrokeWidth(4);
   
      //square box
      Rectangle box = new Rectangle(0,0,800,500);
      box.setFill(Color.BROWN);
      
      //molding
      Rectangle molding = new Rectangle(0,0,800,30);
      molding.setFill(Color.WHITE);
      
      //pillars
      Rectangle pillar1 = new Rectangle(10,0,50,400);
      pillar1.setFill(Color.WHITE);
      pillar1.setStroke(Color.BLACK);
      Rectangle pillar2 = new Rectangle(250,0,50,400);
      pillar1.setStroke(Color.BLACK);
      pillar2.setFill(Color.WHITE);
      pillar2.setStroke(Color.BLACK);
      Rectangle pillar3 = new Rectangle(510,0,50,400);
      pillar3.setFill(Color.WHITE);
      pillar3.setStroke(Color.BLACK);
      Rectangle pillar4 = new Rectangle(740,0,50,400);
      pillar4.setFill(Color.WHITE);
      pillar4.setStroke(Color.BLACK);
      
      
      
      //circles
      Circle c1 = new Circle(15,45,15); 
      c1.setFill(Color.WHITE);
      c1.setStroke(Color.BLACK);
      Circle c2 = new Circle(55,45,15); 
      c2.setFill(Color.WHITE);
      c2.setStroke(Color.BLACK);
      Circle c3 = new Circle(255,45,15); 
      c3.setFill(Color.WHITE);
      c3.setStroke(Color.BLACK);
      Circle c4 = new Circle(295,45,15); 
      c4.setFill(Color.WHITE);
      c4.setStroke(Color.BLACK);
      Circle c5 = new Circle(515,45,15); 
      c5.setFill(Color.WHITE);
      c5.setStroke(Color.BLACK);
      Circle c6 = new Circle(555,45,15); 
      c6.setFill(Color.WHITE);
      c6.setStroke(Color.BLACK);
      Circle c7 = new Circle(745,45,15); 
      c7.setFill(Color.WHITE);
      c7.setStroke(Color.BLACK);
      Circle c8 = new Circle(785,45,15); 
      c8.setFill(Color.WHITE);
      c8.setStroke(Color.BLACK);
      
      //pillar base
      Rectangle base1 = new Rectangle(0,380,70,20);
      base1.setFill(Color.WHITE);
      base1.setStroke(Color.BLACK);
      Rectangle base2 = new Rectangle(230,380,85,20);
      base2.setFill(Color.WHITE);
      base2.setStroke(Color.BLACK);
      Rectangle base3 = new Rectangle(490,380,90,20);
      base3.setFill(Color.WHITE);
      base3.setStroke(Color.BLACK);
      Rectangle base4 = new Rectangle(725,380,80,20);
      base4.setFill(Color.WHITE);
      base4.setStroke(Color.BLACK);
      
      Group pillar = new Group(pillar1, pillar2, pillar3, pillar4
              ,c1,c2,c3,c4,c5,c6,c7,c8, base1,base2, base3, base4);
      
      //doors
      Rectangle door1 = new Rectangle(130,250,70,150);
      door1.setFill(Color.WHITE);
      Rectangle door2 = new Rectangle(380,200,70,200);
      door2.setFill(Color.WHITE);
      Rectangle door3 = new Rectangle(630,250,70,150);
      door3.setFill(Color.WHITE);
      

        //windows
      Rectangle window = new Rectangle(380,70,70,50);
        window.setFill(Color.LIGHTGRAY);
        window.setStroke(Color.BLACK);
      
      Group door = new Group(door1,door2,door3,window );
      
      //stairs
      Rectangle stairs1 = new Rectangle(60,400,690,20);
      stairs1.setFill(Color.GREY);
      stairs1.setStroke(Color.BLACK);
      Rectangle stairs2 = new Rectangle(40,420,730,20);
      stairs2.setFill(Color.GREY);
      stairs2.setStroke(Color.BLACK);
      Rectangle stairs3 = new Rectangle(20,440,770,20);
      stairs3.setFill(Color.GREY);
      stairs3.setStroke(Color.BLACK);
      Rectangle stairs4 = new Rectangle(0,460,800,20);
      stairs4.setFill(Color.GREY);
      stairs4.setStroke(Color.BLACK);
      Rectangle stairs5 = new Rectangle(-20,480,840,20);
      stairs5.setFill(Color.GREY);
      stairs5.setStroke(Color.BLACK);
      Rectangle stairs6 = new Rectangle(-40,500,880,20);
      stairs6.setFill(Color.GREY);
      stairs6.setStroke(Color.BLACK);
      Rectangle stairs7 = new Rectangle(-60,520,920,20);
      stairs7.setFill(Color.GREY);
      stairs7.setStroke(Color.BLACK);
      
    
      
      
      Group building = new Group(leftLine, rightLine, bottomLine, box,pillar, molding, 
            door, stairs1,stairs2,stairs3,stairs4,stairs5,stairs6,stairs7);
      
      
      
      building.setTranslateX(250);
      building.setTranslateY(250);
      
      Rectangle sky = new Rectangle(0,0,10000,500);
      sky.setFill(Color.LIGHTBLUE);
      Group root = new Group(sky,building);
      Scene scene = new Scene(root,1100,900,Color.GREEN);
      
      stage.setTitle("Building");
      stage.setScene(scene);
      stage.show(); 
    } 
}
