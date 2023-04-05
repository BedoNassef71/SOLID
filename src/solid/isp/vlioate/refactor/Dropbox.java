/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid.isp.vlioate.refactor;

/**
 *
 * @author hp
 */
public class Dropbox implements CloudStorageProvider {

    @Override
    public void storeFile(String name) {
        System.out.println("Implemented");
    }

    @Override
    public void getFile() {
        System.out.println("Implemented");
    }

}
