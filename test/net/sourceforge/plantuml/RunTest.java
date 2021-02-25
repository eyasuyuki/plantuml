package net.sourceforge.plantuml;


import org.junit.jupiter.api.Test;

import java.io.IOException;

class RunTest {
    public static String[] TEST_FILES = {"src/test/resources/address.puml"};

    @Test
    public void runTest() throws IOException, InterruptedException {
        System.out.println(System.getProperty("user.dir"));
        Run.main(TEST_FILES);
    }
}
