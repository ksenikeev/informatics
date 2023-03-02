package ru.itis.textanalysis.map;

public interface IMap {
    /**
     * Значение ключа уникально, при попытке положить пару с
     * уже существующим ключем, меням значение value на новое
     * @param key unique not null
     * @param value not null
     */
    void put(String key, Integer value);

    /**
     * @param key
     * @return null или найденное значение
     */
    Integer getValueByKey(String key);

    /**
     * @param value
     * @return null или массив ключей, соответствующих значению
     */
    String[] getKeysByValue(Integer value);

    void removeByKey(String key);

    /**
     * удалить все пары, соответствующие значению
     * @param value
     */
    void removeByValue(Integer value);

    String[] getAllKeys();


}
