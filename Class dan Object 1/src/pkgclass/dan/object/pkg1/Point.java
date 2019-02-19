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
public class Point {
    private double x, y;
    
    public void setX(double x){
        this.x = x;
    }
    
    public void setY(double y){
        this.y = y;
    }
    
    double getX(){
        return this.x;
    }
    
    double getY(){
        return this.y;
    }
    
    double multiply(){
        return this.x * this.y;
    }
    
    double divide(){
        if (this.y != 0){
            return this.x / this.y;
        }else{
            System.out.println("Y tidak boleh kosong");
            return 0;
        }       
    }
}
