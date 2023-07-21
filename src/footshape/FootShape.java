/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footshape;

import java.util.Scanner;

/**
 *
 * @author KTMAIT
 */
public class FootShape {
    private Foot foot;
    
    public void DrawEllipse(){
       foot = new Ellipse();
        
    }
    public void DrawRectangle(){
        foot = new Rectangle();
        
    }
    public String draw() {
        return foot.draw();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FootShape app = new FootShape();
        Scanner inp = new Scanner(System.in);
        System.out.print("What to draw? 1. Ellipse, 2. Rectangle");
        int type = inp.nextInt();
        switch(type) {
            case 1:
                app.DrawEllipse();
                break;
            case 2:
                app.DrawRectangle();
                break;

        }
        System.out.println(app.draw());    
    }
    
}
