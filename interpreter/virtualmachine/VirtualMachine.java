package interpreter.virtualmachine;

import java.util.Stack;

public class VirtualMachine {

    private RunTimeStack   runTimeStack;
    private Stack<Integer> returnAddress;
    private Program        program;
    private int            programCounter;
    private boolean        isRunning;

    public VirtualMachine(Program program) {
        this.program = program;
    }

    public void executeProgram()
    {
        System.out.println("executeProgram() isn't inplemented in VirtualMachine.");
    }
}
