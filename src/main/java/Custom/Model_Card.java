/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Custom;

/**
 *
 * @author Admin
 */
public class Model_Card {
    int id;
    Double grade;
    String personName;

    public Model_Card() {
    }

    public Model_Card(int id, double grade, String personName) {
        this.id = id;
        this.grade = grade;
        this.personName = personName;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    
}
