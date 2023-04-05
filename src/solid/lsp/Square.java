/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid.lsp;

/**
 *
 * @author hp
 */
public class Square extends Rectangle {

    @Override
    public void setHeight(int width) {
        this.setWidth(width);
        this.setHeight(width);
    }
    
    @Override
    public void setWidth(int width) {
        this.setWidth(width);
        this.setHeight(width);
    }
}
