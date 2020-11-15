/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author colin
 */
public class EmployeeApp {
    
    public static void main(String[] args){
   
    Employee e1 = new Employee();
    e1.setName("Colin");
    e1.setId("x123410");
    e1.setDob("june 17th 1991");
    
    System.out.println(e1.getName()+ "," + e1.getId() + "," + e1.getDob());
    
    Manager m1 = new Manager(50000, "Ste", "x1596", "5th Aug 1992");
   System.out.println(m1.getName()+ "," + m1.getId() + "," + m1.getDob());
   
   FloorStaff f1 = new FloorStaff(10000,"jack", "x1475", "4th July 2001");
   System.out.println(f1.getName()+ "," + f1.getId() + "," + f1.getDob());
}
    
}
