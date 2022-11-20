/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package strace.java.application.practice;

import java.nio.ByteBuffer;

public class NIODirectAllocationTest {
    
    public static void main(String[] args) throws InterruptedException {
        System.out.println("byteBuffer allocation start..");
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putChar('c');
        byteBuffer.flip();
        System.out.println("byteBuffer allocated! " + byteBuffer.getChar() + " done");

        System.out.println("byteBuffer direct allocation start..");
        Thread.sleep(1000);

        ByteBuffer directByteBuffer = ByteBuffer.allocateDirect(4);
        directByteBuffer.putChar('e');
        directByteBuffer.flip();
        System.out.println("byteBuffer directly allocated!" + directByteBuffer.getChar());
    }
}
