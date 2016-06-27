/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Dan
 */
public class Project {
    int prID;
    String PrName;

    public Project() {
    }

    public Project(int prID, String PrName) {
        this.prID = prID;
        this.PrName = PrName;
    }

    public int getPrID() {
        return prID;
    }

    public void setPrID(int prID) {
        this.prID = prID;
    }

    public String getPrName() {
        return PrName;
    }

    public void setPrName(String PrName) {
        this.PrName = PrName;
    }
    
    
}
