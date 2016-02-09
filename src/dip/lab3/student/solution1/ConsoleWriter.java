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
public class ConsoleWriter implements Writer {
    public void writeln(String line){
        System.out.println("What you typed was:");
        System.out.println(line);
    }
}
