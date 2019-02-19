/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.pattern.stars.and.hastag;

/**
 *
 * @author ASUS
 */
public class HelloPatternStarsAndHastag {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int size = 10;
        System.out.println("Hello World!");
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                if (i == j){
                    System.out.print("#");
                }else if (i == 0){
                    System.out.print("!");
                }else if (i == size-1){
                    System.out.print("!");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
    
}
