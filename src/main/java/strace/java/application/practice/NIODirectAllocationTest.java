/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package strace.java.application.practice;

import java.nio.ByteBuffer;

public class NIODirectAllocationTest {
    
    public static void main(String[] args) {
        System.out.println("byteBuffer allocation start..");
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        byteBuffer.putChar('c');
        System.out.println("byteBuffer allocated!");

        System.out.println("byteBuffer direct allocation start..");
        ByteBuffer directByteBuffer = ByteBuffer.allocateDirect(10);
        directByteBuffer.putChar('c');
        System.out.println("byteBuffer directly allocated!");
    }
}
