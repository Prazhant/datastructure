package practice.datastructure.stack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {

    @Test
    public  void push_addsNewElementToStack() throws Exception {
        MyStack<String> stack = new MyStack<String>();

        stack.push("Salah");
        stack.push("Oxlade");
        stack.push("Mane");
        stack.push("Firminio");
        stack.push("Dijk");


        assertEquals("Dijk",stack.pop());
        assertEquals("Firminio",stack.pop());
    }

}