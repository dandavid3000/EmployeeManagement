/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.util.ArrayList;
import Entity.Department;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Dan
 */
public class DepartmentDAL extends DataAccessHelper{
    private final String GET_BY_ID = "select * from Department where depID =?";
    private final String GET_ALL ="select * from Department";
    
    public ArrayList<Department> getByID(int id)
    {
        ArrayList<Department> objs = new ArrayList<>();
        try {
            getConnect();
            PreparedStatement ps = con.prepareStatement(GET_BY_ID);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs!=null&&rs.next())
            {
                Department item = new Department();
                item.setDepID(rs.getInt("depID"));
                item.setDepName(rs.getString("depName"));
                objs.add(item);
            }
            getClose();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return objs;
    }

    public ArrayList<Department> getAll()
    {
        ArrayList<Department> objs = new ArrayList<>();
        try {
            getConnect();
            PreparedStatement ps = con.prepareCall(GET_ALL);
            ResultSet rs = ps.executeQuery();
            if(rs!=null)
            {
                while(rs.next())
                {
                    Department item = new Department();
                    item.setDepID(rs.getInt("depID"));
                    item.setDepName(rs.getString("DepName"));
                    objs.add(item);
                }
                
            }
            getClose();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return objs;
    }
}