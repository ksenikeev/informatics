package ru.itis.lab15;

public interface IMapT<K, V> {
    /**
     * Значение ключа уникально, при попытке положить пару с
     * уже существующим ключем, меням значение value на новое
     * @param key unique not null
     * @param value not null
     */
    void put(K key, V value);

    /**
     * @param key
     * @return null или найденное значение
     */
    V getValueByKey(K key);

    /**
     * @param value
     * @return null или массив ключей, соответствующих значению
     */
    <K> K[] getKeysByValue(V value);

    void removeByKey(K key);

    /**
     * удалить все пары, соответствующие значению
     * @param value
     */
    void removeByValue(V value);

    <K> K[] getAllKeys();
}
