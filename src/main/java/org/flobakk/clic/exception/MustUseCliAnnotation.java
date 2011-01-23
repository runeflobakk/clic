package org.flobakk.clic.exception;

import org.flobakk.clic.Cli;

public class MustUseCliAnnotation extends RuntimeException {

    private static final long serialVersionUID = -8555306861273939767L;

    public MustUseCliAnnotation(Object cliService) {
        super(cliService.getClass().getName() +
                " must have a method annotated with @" + Cli.class.getSimpleName());
    }

}
