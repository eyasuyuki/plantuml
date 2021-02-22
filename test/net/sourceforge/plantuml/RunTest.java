package net.sourceforge.plantuml;


import org.junit.jupiter.api.Test;

import java.io.IOException;

class RunTest {
    public static String[] TEST_FILES = {"address.puml"};

    @Test
    public void runTest() throws IOException, InterruptedException {
        Run.main(TEST_FILES);
    }
}
