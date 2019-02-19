/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgclass.dan.object.pkg1;

import java.lang.*;

/**
 *
 * @author ASUS
 */
public class Line {
    Point p1 = new Point();
    Point p2 = new Point();
    
    double calculate(){
        double horizontalDistance = Math.pow(p2.getX() - p1.getX(),2);
        double verticalDistance = Math.pow((p2.getY() - p1.getY()),2);
        double result = Math.sqrt(horizontalDistance + verticalDistance);
        System.out.println(result);
        return result;
    }
     
}
