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
         MessageWriter msgWriter2 = new ConsoleMessageWriter();
         MessageReader msgReader1 = new KeyBoardMessageReader();
         MessageReader msgReader2 = new GreetingMessageReader();
         
         MessageService msg = new MessageService(msgReader1, msgWriter1);
         MessageService msg1 = new MessageService(msgReader2, msgWriter2);
         
         msg.sendMessage();
         msg1.sendMessage();
    }
}
