/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printstudentdetails;

/**
 * store and print student details
 * view class - user interaction
 * @author nandi
 */
public class PrintStudentDetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //store 3 student details
        Student[] list = new Student[3];    //HERE STUDENT IS THE NAME OF THE CLASS, CLASS NAME IS GIVEN BEFORE THE SQUARE BRACES
        
        Student s1 = new Student(); //OBJECT s1 CREATED 
        Student s2 = new Student();
        Student s3 = new Student();
        
        s1.setName("Peter");
        s1.setSid(23);
        
        s2.setName("Roy");
        s2.setSid(25);
        
        s3.setName("Kartik");
        s3.setSid(27);
        
        //Store object in array
        list[0]=s1;
        list[1]=s2;
        list[2]=s3;
        
        for(int i=0;i<list.length;i++)
        {
             System.out.println(list[i].getName() + " " + list[i].getSid());
        }
        
    }
    
}
