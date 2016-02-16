/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;
import javax.swing.JOptionPane;
/**
 *
 * @author pbremer
 */
public class GuiWriter implements Writer {
    @Override 
    public void writeln(String line){
        //I'm not quite sure why this part isn't working as needed
            //Looked at instructor code and couldn't think of an exact solution
            //for my problem with my code without copying what you had.
         JOptionPane.showMessageDialog(null, line);
     }
}
