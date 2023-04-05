/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid.srp.refactor;

/**
 *
 * @author hp
 */
// Responsability: Handle core student profile data

public class Student {

    private String id;
    private String address;
    private String name;

    public void save() {
        new StudentRepository().save(this);
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }
// others getter and setters...

}
