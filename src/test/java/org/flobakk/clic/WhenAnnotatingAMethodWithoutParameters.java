package org.flobakk.clic;

import static org.junit.Assert.assertTrue;

import org.flobakk.clic.servicespy.NoArgumentsService;
import org.junit.Test;


public class WhenAnnotatingAMethodWithoutParameters {

    @Test
    public void itShouldBeInvoked() {
        NoArgumentsService service = new NoArgumentsService();
        new Bootstrapper(service).execute();
        assertTrue(service.wasInvoked());
    }

    @Test
    public void itShouldBeInvokedWithoutAnyCommandLineArguments() {
        NoArgumentsService service = new NoArgumentsService();
        new Bootstrapper(service).execute("arg1", "arg2");
        assertTrue(service.wasInvoked());
    }
}
