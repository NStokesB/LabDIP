/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author L115student
 */
public class StartUp {
    public static void main(String[] args) {
        
         MessageWriter msgWriter1 = new GuiJOptionMessageWriter();

         MessageReader msgReader1 = new KeyBoardMessageReader();
         MessageService msg = new MessageService(msgReader1, msgWriter1);
        
    }
}
