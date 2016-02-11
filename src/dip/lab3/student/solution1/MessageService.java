/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author nstokesbeamon
 */
public class MessageService {
    
    private final MessageReader reader;
    private final MessageWriter writer;

    public MessageService(MessageReader reader, MessageWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public final void sendMsg() {
        String line = reader.readln();
        writer.writeln(line);
    }
}
