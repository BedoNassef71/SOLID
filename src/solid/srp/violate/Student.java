/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid.srp.violate;

import com.sun.jdi.connect.spi.Connection;
import java.beans.Statement;

/**
 *
 * @author hp
 */
public class Student {

    private String id;
    private String name;
    private String address;

    public void save() {
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDB", "root", "password");
            statement = connection.createStatement();
            statement.execute("INSERT INTO student VALUES (" + this.getId() + ", " + this.getAddress() + ", " + this.getBirth() + ")");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }
// others getter and setters...

    private String getAddress() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getBirth() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
