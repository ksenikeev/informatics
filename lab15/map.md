# Map -карта

Структура типа ключ - значение

class Entry {
    public String key;
    public String value;
}

1. Ключ - уникален <> null
2. значение <> null

put(key, value)

getValueByKey(key) -> value

getKeysByValue(value) -> key[]

removeByKey(key)

removeByValue(value)

getAllKeys() -> key[]