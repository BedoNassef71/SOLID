/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid.isp.vlioate;

/**
 *
 * @author hp
 */
public class Amazon implements CloudProvider {

    @Override
    public void storeFile(String name) {
        System.out.println("Implemented");
    }

    @Override
    public void getFile() {
        System.out.println("Implemented");
    }

    @Override
    public void createServer(String region) {
        System.out.println("Implemented");
    }

    @Override
    public void listServers(String region) {
        System.out.println("Implemented");
    }

    @Override
    public void getCDNAddress() {
        System.out.println("Implemented");
    }

}
