// Native methods implementation of
// C:/Users/kenny/Documents/GitHub/JNIExample/JavaApplication1/src/test/Test1.java

#include "Test1.h"
#include <iostream>

void JNICALL Java_test_Test1_sayHi
  (JNIEnv * env, jclass object) {
    std::cout << "Hello from C++!!" << std::endl;
}

JNIEXPORT void JNICALL Java_test_Test1_sayGoodBye
  (JNIEnv * env, jclass object){
    std::cout << "GoodBye from C++!!" << std::endl;
}