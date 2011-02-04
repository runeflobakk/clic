package org.flobakk.clic.servicespy;

import org.flobakk.clic.Cli;

public class TwoArgumentsService extends ServiceSpy {

    @Cli
    public void service(String arg1, String arg2) {
        invoked();
    }

}
