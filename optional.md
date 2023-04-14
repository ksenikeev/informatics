# Optional<T>

1. Создание пустого объекта: `Optional.empty()`
2. Создание объекта с содержанием: `Optional<String> opt = Optional.of("Hello!")`
3. Создание объекта с потенциально пустым содержанием: `Optional<String> opt = Optional.ofNullable(name)`
4. Проверка наличия не пустого содержания: `isPresent()`, `isEmpty()`
5. Выполнение условного выражения: `ifPresent(lambda)`
6. Выдача значения по умолчанию: `orElse(value)`
7. Выдача значения по умолчанию в функциональном стиле: `orElseGet(lambda)`
8. Получение значения: `get()`

