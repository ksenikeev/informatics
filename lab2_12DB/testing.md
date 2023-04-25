# Модульное тестирование
## Тестирование с помощью фреймворка JUnit

- нужна библиотека
``` 
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.13.2</version>
        <scope>test</scope>
    </dependency>
```
- Подготовка Test Case
- Разработка методов, тестирующих модули программы
- Сопоставление результатов тестирования с заранее определенным ответом (`Assert`)

Виды проверок:
- assertTrue
- assertFalse
- assertEquals
- assertArrayEquals
- assertNotEquals
- assertSame
- assertNotSame
- fail – гарантированное падение теста.
