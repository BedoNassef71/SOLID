/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid.srp.violate;

/**
 *
 * @author hp
 */
public class Square {

    private boolean highResolutionMonitor = true;
    private int side = 5;

    public int calculateArea() {
        return side * side; // side² - side ^ 2;
    }

    public int calculatePerimeter() {
        return side * 4;
    }

    public void draw() {
        if (highResolutionMonitor) {
// Render a high resolution image of a square
        } else {
// Render a high normal image of a square
        }
    }

    public void rotate() {
// Rotate the image of the square clockwise to
// the required degree and re-render
    }
}
