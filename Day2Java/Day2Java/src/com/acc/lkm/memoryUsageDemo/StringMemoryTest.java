package com.acc.lkm.memoryUsageDemo;

public class StringMemoryTest {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        // Run garbage collector to clear prior data
        runtime.gc();

        long memoryBefore = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Used memory before creating strings: " + memoryBefore + " bytes");

        String string1 = new String(new char[0]); // Example string
        String string2 = "Java"; // String literal,// This should not allocate more memory for the string data
        String string3 = new String("Java"); // Explicitly creating a new String object

        // Run garbage collector again to ensure creation-related overheads are accounted for
        runtime.gc();

        long memoryAfter = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Used memory after creating strings: " + memoryAfter + " bytes");

        System.out.println("Memory used by string variables: " + (memoryAfter - memoryBefore) + " bytes");
    }
}