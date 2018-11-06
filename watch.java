/* <applet code="watch.class" height="300" width="300">
/* <applet code="watch.class" height="300" width="300">
 </applet>  */
import java.applet.*;
import java.awt.*;

public class watch extends Applet implements Runnable{
 
 int theta;
 double rad;
 double sectheta,mintheta,hrtheta;
 int x1,y1,x2,y2;
 public void run(){
  while(true){
    try{Thread.sleep(1000);}
    catch(Exception e){};
 
   sectheta=sectheta+6.0;
   mintheta=mintheta+(6.0/60);
   hrtheta=hrtheta+(30.0/3600);
   repaint();
  }
 }
 public void init(){
  sectheta=270;
  mintheta=270;
  hrtheta=270;
  Thread th=new Thread(this);
  th.start();
 }
 public void paint(Graphics g){
  g.drawOval(50,50,200,200);
  theta=0;
  
  while(theta<=360){
   rad=Math.toRadians(theta);
   x1=(int)(100*Math.cos(rad));
   y1=(int)(100*Math.sin(rad));
   
   x2=(int)(80*Math.cos(rad));
   y2=(int)(80*Math.sin(rad));
   
   g.drawLine((150+x1),(150+y1),(150+x2),(150+y2));
   theta=theta+30;
  }
  theta=0;
  while(theta<=360){
   rad=Math.toRadians(theta);
   x1=(int)(100*Math.cos(rad));
   y1=(int)(100*Math.sin(rad));
   
   x2=(int)(95*Math.cos(rad));
   y2=(int)(95*Math.sin(rad));
   
   g.drawLine((150+x1),(150+y1),(150+x2),(150+y2));
   theta=theta+6;
  }
  g.drawLine(150,150,150+(int)(75*Math.cos(Math.toRadians(sectheta))),150+(int)(75*Math.sin(Math.toRadians(sectheta))));
  
  g.drawLine(150,150,150+(int)(65*Math.cos(Math.toRadians(mintheta))),150+(int)(65*Math.sin(Math.toRadians(mintheta))));
  
  
  g.drawLine(150,150,150+(int)(55*Math.cos(Math.toRadians(hrtheta))),150+(int)(55*Math.sin(Math.toRadians(hrtheta))));
  }
 }