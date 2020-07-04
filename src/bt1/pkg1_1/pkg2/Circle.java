/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1.pkg1_1.pkg2;

/**
 *
 * @author Admin
 */
public class Circle extends Shape{

    public Circle() {
        System.out.println("Đây là hình tròn");
    }

    
     @Override
    public String draw() {
        brush ="\nVẽ hình tròn bằng bút da";
        paper ="\nVẽ hình tròn giấy gỗ";
        frame ="\nVẽ hình tròn trên khung sắt";
        
        return brush + paper + frame;
    }
    
}
