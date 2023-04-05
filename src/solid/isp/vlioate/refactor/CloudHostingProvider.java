/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package solid.isp.vlioate.refactor;

/**
 *
 * @author hp
 */
public interface CloudHostingProvider {

    void createServer(String region);

    void listServers(String region);

}
