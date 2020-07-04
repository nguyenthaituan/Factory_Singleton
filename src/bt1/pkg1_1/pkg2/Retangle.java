/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1.pkg1_1.pkg2;


public class Retangle extends Shape{

     public Retangle() {
        System.out.println("\nĐây là hình chữ nhật");
    }

    @Override
    public String draw() {
        
        brush ="\nVẽ bằng bút lông";
        paper ="\nVẽ giấy cứng";
        frame ="\nVẽ trên khung nhôm";
        
        return brush + paper + frame;
    }
    
    
}
