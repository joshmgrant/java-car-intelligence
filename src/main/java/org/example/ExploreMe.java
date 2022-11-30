package org.example;

public class ExploreMe {

    public Integer fibonacci(Integer n){
        if (n == 1){
            return 1;
        }
        else if (n == 0){
            return 0;
        }
        return fibonacci(n-1);
    }

    // Function with multiple paths that can be discovered by a fuzzer.
    public void exploreMe(int a, int b, String c) {
        if (a >= 20000) {
            if (b >= 2000000) {
                if (b - a < 100000) {
                    // Create reflective call
                    if (c.startsWith("@")) {
                        String className = c.substring(1);
                        try {
                            Class.forName(className);
                        } catch (ClassNotFoundException ignored) {
                        }
                    }
                }
            }
        }
    }

}
