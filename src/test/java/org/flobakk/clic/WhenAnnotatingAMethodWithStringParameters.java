package org.flobakk.clic;

import static org.junit.Assert.assertTrue;

import org.flobakk.clic.servicespy.TwoArgumentsService;
import org.junit.Test;


public class WhenAnnotatingAMethodWithStringParameters {

    @Test
    public void itShouldBeInvokedWithTwoGivenArguments() {
        TwoArgumentsService service = new TwoArgumentsService();
        new Bootstrapper(service).execute("Hello", "World");
        assertTrue(service.wasInvoked());
    }
}
