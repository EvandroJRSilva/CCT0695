package aula02;

import java.lang.annotation.Documented;

@Documented
public @interface IsExemplo
{
    boolean isExemplo() default false;
}
