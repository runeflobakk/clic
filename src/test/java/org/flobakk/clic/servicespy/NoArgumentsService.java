package org.flobakk.clic.servicespy;

import org.flobakk.clic.Cli;

public class NoArgumentsService {

    private boolean invoked;

    @Cli
    public void service() {
        this.invoked = true;
    }

    public boolean wasInvoked() {
        return invoked;
    }
}
