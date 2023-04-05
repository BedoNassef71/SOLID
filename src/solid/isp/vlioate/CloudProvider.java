/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package solid.isp.vlioate;

/**
 *
 * @author hp
 */
public interface CloudProvider {

    void storeFile(String name);

    void getFile();

    void createServer(String region);

    void listServers(String region);

    void getCDNAddress();

}
