package com.tac.guns.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * An annotation to mark that an object field should be ignored when the validator attempts to
 * look at and validate the object's members.
 * <p>
 * Author: Forked from MrCrayfish, continued by Timeless devs
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Ignored
{
}
