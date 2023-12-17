package org.example;

import java.lang.reflect.Method;

public class ParseAnnotation {
    public static void main(String[] args) {
        parseClassDocumentation(TestClass.class);
        parseMethodDocumentation(TestClass.class);
    }

    private static void parseMethodDocumentation(Class<?> clazz) {
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            MethodDocumentation methodDoc = method.getAnnotation(MethodDocumentation.class);
            if (methodDoc != null) {
                System.out.println("Method: " + method.getName() + ", Documentation: " + methodDoc.value());
            } else {
                System.out.println("Method: " + method.getName() + ", No Documentation");
            }
        }
    }

    private static void parseClassDocumentation(Class<?> clazz) {
        ClassDocumentation classDoc = clazz.getAnnotation(ClassDocumentation.class);
        if (classDoc != null) {
            System.out.println("Class Documentation: " + classDoc.value());
        } else {
            System.out.println("No Class Documentation");
        }
    }

}
