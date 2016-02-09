/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.util.Scanner;

/**
 *
 * @author Phillip
 */
public class KeyboardReader implements Reader {
    public String readln(){
        System.out.println("Enter something then hit 'Enter'.");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}
