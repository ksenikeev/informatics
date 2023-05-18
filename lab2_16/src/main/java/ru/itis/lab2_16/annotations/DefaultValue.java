package ru.itis.lab2_16.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD) // аннотация используется только для поля класса
@Retention(RetentionPolicy.RUNTIME) // аннотация будет работать во время выполнения программы
public @interface DefaultValue {
    String value(); // атрибут аннотации
}
