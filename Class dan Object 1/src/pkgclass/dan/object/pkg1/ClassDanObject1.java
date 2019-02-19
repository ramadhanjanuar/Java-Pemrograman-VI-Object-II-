/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgclass.dan.object.pkg1;

/**
 *
 * @author ASUS
 */
public class ClassDanObject1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Line line = new Line();
        
        line.p1.setX(3);
        line.p2.setX(7);
        line.p1.setY(2);
        line.p2.setY(8);
        
        line.calculate();
    }
    
}
