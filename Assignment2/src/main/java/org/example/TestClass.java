package org.example;
@ClassDocumentation("This is a class i am testing on.")
public class TestClass {
    /**
     * This is a sample method.
     * @param param Sample parameter
     * @return Sample result
     */
    @MethodDocumentation("This method performs a sample operation.")
    public String methodWithDoc(String param) {
        return "Result: " + param;
    }

    // Another method without MethodDocumentation annotation
    public void methodWithoutDoc() {
        // No body,No annotation,No Documentation
    }
}
