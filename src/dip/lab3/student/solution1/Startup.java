/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author Phillip
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Reader reader = new KeyboardReader();
        Writer writer = new ConsoleWriter();
        Writer writer2 = new GuiWriter();
        
        Copier copier = new Copier(reader, writer);
        Copier copier2 = new Copier(reader, writer2);
        copier.copy();
        copier2.copy();
    }
    
}
