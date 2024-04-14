/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author kenny
 */
public class Test1 {
    
    static {
        System.loadLibrary("libCppJNILibrary_1");
    }
    
    public static native void sayHi();
    public static native void sayGoodBye();
    
    public Test1(){}
        
    public static void main(String[] args){
        sayHi();
        sayGoodBye();
    }
}
