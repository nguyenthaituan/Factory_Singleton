/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1.pkg1_1.pkg2;


public class Triangle extends Shape{

    public Triangle() {
        System.out.println("Đây là hình tam giác!");
        
    }
 
    @Override
    public String draw() {
        
        brush ="\nVẽ tam giác bằng bút mực";
        paper ="\nVẽ tam giác giấy to";
        frame ="\nVẽ tam giác trên khung đồng";
        
        return brush + paper + frame;
    }
}
