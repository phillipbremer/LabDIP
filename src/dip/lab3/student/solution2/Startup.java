/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution2;

/**
 *
 * @author pbremer
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MessageInput input = new KeyboardInputMessage();
        MessageOutput output = new ConsoleOutput();
        //MessageOutput output = new GuiOutput();
        
        MessageService service = new MessageService(input, output);
        service.produceMessage();
    }
    
}
