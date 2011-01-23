package org.flobakk.clic;

import org.flobakk.clic.exception.MustUseCliAnnotation;

public class Bootstrapper {

    public Bootstrapper(Object cliService) {
        throw new MustUseCliAnnotation(cliService);
    }

}
