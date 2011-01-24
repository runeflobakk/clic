package org.flobakk.clic;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import org.apache.commons.collections15.Predicate;
import org.flobakk.clic.function.HasAnnotation;

public final class Functions {

    public static Predicate<Method> annotatedWith(Class<? extends Annotation> annotation) {
        return new HasAnnotation(annotation);
    }

    private Functions() {} static { new Functions(); }
}
