package org.flobakk.clic.servicespy;

import org.flobakk.clic.Cli;

public class NoArgumentsService extends ServiceSpy {

    @Cli
    public void service() {
        invoked();
    }
}
