package org.flobakk.clic;

import static java.util.Arrays.asList;
import static org.apache.commons.collections15.CollectionUtils.find;
import static org.flobakk.clic.Functions.annotatedWith;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.flobakk.clic.exception.MustUseCliAnnotation;

public class Bootstrapper {

    private final Method cliMethod;

    private final Object cliService;

    public Bootstrapper(Object cliService) {
        this.cliService = cliService;
        this.cliMethod = resolveCliMethod();
    }

    private Method resolveCliMethod() {
        Method method = find(asList(cliService.getClass().getMethods()), annotatedWith(Cli.class));
        if (method != null) {
            return method;
        } else {
            throw new MustUseCliAnnotation(cliService);
        }

    }

    public void execute(String ... args) {
        try {
            cliMethod.invoke(cliService, actualArguments(args));
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e.getMessage(), e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e.getMessage(), e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    private Object[] actualArguments(String[] args) {
        Object[] actualArguments = new Object[cliMethod.getParameterTypes().length];
        for (int i = 0; i < actualArguments.length && i < args.length; i++) {
            actualArguments[i] = args[i];
        }
        return actualArguments;
    }

}
