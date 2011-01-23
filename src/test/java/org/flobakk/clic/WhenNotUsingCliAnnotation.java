package org.flobakk.clic;

import org.flobakk.clic.exception.MustUseCliAnnotation;
import org.junit.Test;


public class WhenNotUsingCliAnnotation {

    @Test(expected=MustUseCliAnnotation.class)
    public void anExceptionShouldBeThrown() {
        new Bootstrapper(this);
    }
}
