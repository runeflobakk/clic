package org.flobakk.clic.function;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import org.apache.commons.collections15.Predicate;

public class HasAnnotation implements Predicate<Method> {

    private final Class<? extends Annotation> annotation;

    public HasAnnotation(Class<? extends Annotation> annotation) {
        this.annotation = annotation;
    }

    @Override
    public boolean evaluate(Method method) {
        return method.isAnnotationPresent(annotation);
    }
}