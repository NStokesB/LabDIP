/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author l115student
 */
public class ConsoleMessageWriter implements MessageWriter{
    
    @Override
    public final void writeln(String line){
        System.out.print("Incoming Message:");
        System.out.println(line);
    }
}
