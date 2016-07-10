/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DLL;

import DAL.DepartmentDAL;
import java.util.ArrayList;
import Entity.Department;

/**
 *
 * @author Dan
 */
public class DepartmentDLL {
    DepartmentDAL dal = new DepartmentDAL();
    
    public ArrayList<Department> getByID(int id)
    {
        return dal.getByID(id);
    }
    
    public ArrayList<Department> getAll()
    {
        return dal.getAll();
    }
    
}
