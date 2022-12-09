package ru.itis.lab15;

public class MapImp implements IMap {

    int countEntryes = 0;
    private Entry[] entries = new Entry[10];

    public void put(String key, String value) {

        if (key != null && value != null) {
            // Проверяем уникальность key
            for (Entry entry : entries) {
                if (entry.key.equals(key)) {
                    entry.value = value;
                    return;
                }
            }
            // есть ли место куда класть
            if (countEntryes < entries.length) {

            }
        }
        //countEntryes++;
    }

    public String getValueByKey(String key) {
        for (Entry entry : entries) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }

    public String[] getKeysByValue(String value) {
        int count = 0;
        for (int i = 0; i < countEntryes; ++i) {
            if (entries[i].value.equals(value)) {
                ++count;
            }
        }

        if (count > 0) {
            String[] result = new String[count];
            int k = 0;
            for (int i = 0; i < countEntryes; ++i) {
                if (entries[i].value.equals(value)) {
                    result[k++] = entries[i].key;
                }
            }
            return result;
        }
        return null;
    }

    public void removeByKey(String key) {}

    public void removeByValue(String value) {}

    public String[] getAllKeys() {
        String[] result = new String[countEntryes];
        int i = 0;
        for (Entry entry : entries) {
            result[i++] = entry.key;
        }
        return result;
    }


    private class Entry {
        String key;
        String value;
    }
}
