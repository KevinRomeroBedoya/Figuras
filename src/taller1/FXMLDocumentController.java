/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.animation.PathTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.util.Duration;

/**
 *
 * @author kevin.romero
 */
public class FXMLDocumentController implements Initializable {
    
    
    @FXML
    private MenuBar menubar;
    
    @FXML
    private ColorPicker colorpicker;
    
     @FXML
    private Canvas lienzo;

    @FXML
    private GraphicsContext g;
    
    @FXML
    private Circle cr; 

    @FXML
    private Label xpos; 
    
    @FXML
    private Label ypos; 
    
    LinkedList<Object>ListaPuntos;
       
   @FXML
   private void transicion (ActionEvent event){
       System.out.println("Transision");
       cr.setVisible(true);
       Polygon camino = new Polygon(759,0,814,299,654,38,899,232,600,130, 923, 130, 618, 230, 864, 37, 707, 299, 759, 0);
       PathTransition transition = new PathTransition();
       transition.setNode(cr);
       transition.setPath(camino);
       transition.setCycleCount(PathTransition.INDEFINITE);
       transition.setDuration(Duration.seconds(1));
       transition.play();
       
       
   }
      @FXML
    private void limpiar(ActionEvent event) {
        //label.setText("Hello World!");
         System.out.println("You clicked me!");
          double w = lienzo.getWidth();
          double h = lienzo.getHeight();
         g.clearRect(0, 0, w, h);
         cr.setVisible(false);
    }
    
     @FXML
    private void changecolor(ActionEvent event) {
        //label.setText("Hello World!");
         System.out.println("You clicked me!");
         Color c=colorpicker.getValue();
         g.setStroke(c);
    }
        
    LinkedList<Object> ListaPuntos;
    
  @FXML
    private void C_Fig1(ActionEvent event) {

         System.out.println("You clicked me!");
         g.setLineWidth(3);

       
        double [] x = new double [10];
        
        x [0] = 162; 
        x [1] = 328;
        x [2] = 220;
        x [3] = 23;
        x [4] = 58;
        x [5] = 268;
        x [6] = 302;
        x [7] = 109;
        x [8] = 0;
        x [9] = 162;
        
        double [] y = new double [10];       
        
        y [0] = 0;
        y [1] = 129;
        y [2] = 298;
        y [3] = 229;
        y [4] = 35;
        y [5] = 35;
        y [6] = 229;
        y [7] = 298;
        y [8] = 126;
        y [9] = 0;

       g.strokePolyline(x, y, 10);
    }
    
    @FXML
    private void agregar_figura(ActionEvent event) {
 
    }
    
    @FXML
    private void guardar_figura(ActionEvent event) {
        
    }
    
    @FXML
    private void M_coords (MouseEvent e){
    double x = e.getX();
    double y = e.getY();
    
    xpos.setText(""+x);
    ypos.setText(""+y); 
    
    }
    
    
    @FXML
    private void C_Fig2(ActionEvent event) {
        //label.setText("Hello World!");
         System.out.println("You clicked me!");
        g.setLineWidth(3);
       //g.strokeRect(250, 100, 100, 100);
        double [] x = new double [4];
        double [] y = new double [4];
        x [0] = 560; 
        x [1] = 705;
        x [2] = 421;
        x [3] = 560;
              
        y [0] = 0;
        y [1] = 234;
        y [2] = 234;  
        y [3] = 0; 

       g.strokePolyline(x, y, 4);    

       g.setLineWidth(3);
       //g.strokeRect(250, 100, 100, 100);
        double [] a = new double [4];
        double [] b = new double [4];
        a [0] = 458; 
        a [1] = 722;
        a [2] = 506;
        a [3] = 458;
              
        b [0] = 36;
        b [1] = 127; 
        b [2] = 298;  
        b [3] = 36; 

       g.strokePolyline(a, b, 4);  
       
       
       g.setLineWidth(3);
       //g.strokeRect(250, 100, 100, 100);
        double [] s = new double [4];
        double [] d = new double [4];
        s [0] = 400; 
        s [1] = 667;
        s [2] = 620;
        s [3] = 400;
              
        d [0] = 126;
        d [1] = 35; 
        d [2] = 298;  
        d [3] = 126; 

       g.strokePolyline(s, d, 4); 
       
       
    }
    
    @FXML
    private void C_Fig3(ActionEvent event) {
        //label.setText("Hello World!");
         System.out.println("You clicked me!");
        
        g.setLineWidth(3);
       //g.strokeRect(250, 100, 100, 100);
        double [] x = new double [10];
        double [] y = new double [10];
        x [0] = 959; 
        x [1] = 1014;
        x [2] = 854;
        x [3] = 1099;
        x [4] = 800;
        x [5] = 1123;
        x [6] = 818;
        x [7] = 1064;
        x [8] = 907;
        x [9] = 959;
        
        y [0] = 0;
        y [1] = 299;
        y [2] = 38;
        y [3] = 232;
        y [4] = 130;
        y [5] = 130;
        y [6] = 230;
        y [7] = 37;
        y [8] = 299;
        y [9] = 0;

       g.strokePolyline(x, y, 10);
    }
    
@Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        g = lienzo.getGraphicsContext2D();
        cr.setVisible(false);
       // double w = lienzo.getWidth();
       // double h = lienzo.getHeight();
       
    }    
    
}
