package ru.itis.lab15;

public interface IMap {
    /**
     * Значение ключа уникально, при попытке положить пару с
     * уже существующим ключем, меням значение value на новое
     * @param key unique not null
     * @param value not null
     */
    void put(String key, String value);

    /**
     * @param key
     * @return null или найденное значение
     */
    String getValueByKey(String key);

    /**
     * @param value
     * @return null или массив ключей, соответствующих значению
     */
    String[] getKeysByValue(String value);

    void removeByKey(String key);

    /**
     * удалить все пары, соответствующие значению
     * @param value
     */
    void removeByValue(String value);

    String[] getAllKeys();
}
