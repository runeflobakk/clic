package org.flobakk.clic.servicespy;

public abstract class ServiceSpy {

    private boolean invoked;

    public boolean wasInvoked() {
        return invoked;
    }

    protected void invoked() {
        this.invoked = true;
    }

}
