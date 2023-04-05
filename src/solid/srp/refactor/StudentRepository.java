/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid.srp.refactor;

/**
 *
 * @author hp
 */
// Responsability: Handle Database operations for students
public class StudentRepository {

    public void save(Student student) {
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDB", "root", "password");
statement = connection.createStatement();
            statement.execute("INSERT INTO student VALUES ("
                    + student.getId() + ", '" + student.getName() + "', '"
                    + student.getAddress() + "')");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
