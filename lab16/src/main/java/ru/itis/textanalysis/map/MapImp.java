package ru.itis.textanalysis.map;

public class MapImp implements IMap {

    int countEntryes = 0;
    private Entry[] entries = new Entry[10];

    public void put(String key, Integer value) {

        if (key != null && value != null) {
            // Проверяем уникальность key
            for (int i = 0; i < countEntryes; ++i) {
                if (entries[i].key.equals(key)) {
                    entries[i].value = value;
                    return;
                }
            }
            Entry entry = new Entry(key, value);
            // если кончилось место куда класть
            if (countEntryes >= entries.length) {
                Entry[] temp = new Entry[countEntryes * 2];
                System.arraycopy(entries,0, temp, 0, entries.length);
                entries = temp;
            }
            entries[countEntryes++] = entry;
        }
    }

    public Integer getValueByKey(String key) {
        for (int i = 0; i < countEntryes; ++i) {
            if (entries[i].key.equals(key)) {
                return entries[i].value;
            }
        }
        return null;
    }

    public String[] getKeysByValue(Integer value) {
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

    public void removeByKey(String key) {
        int i = -1;
        for(int n = 0; n < countEntryes; ++n) {
            if (entries[n].key.equals(key)) {
                i = n;
                break;
            }
        }

        if (i >= 0) {
            if (i == countEntryes - 1) {
                entries[i] = null;
            } else {
                entries[i] = entries[countEntryes - 1];
            }
            countEntryes--;
        }
    }

    public void removeByValue(Integer value) {
        int i = -1;
        for(int n = 0; n < countEntryes; ) {
            if (entries[n].value.equals(value)) {
                i = n;
                if (i == countEntryes - 1) {
                    entries[i] = null;
                } else {
                    entries[i] = entries[countEntryes - 1];
                    entries[countEntryes - 1] = null;
                }
                countEntryes--;
            } else {
                ++n;
            }
        }
    }

    public String[] getAllKeys() {
        String[] result = new String[countEntryes];
        for (int i = 0; i < countEntryes; ++i) {
            result[i] = entries[i].key;
        }
        return result;
    }

    public void print() {
        for(Entry entry : entries) {
            if (entry == null) System.out.print("{null}, ");
            else
                System.out.printf("{%s : %s},", entry.key, entry.value);
        }
        System.out.println();
    }

    void sortDesk() {
        for(int i = 0; i < countEntryes - 1; ++i) {
            for (int j = 0; j < countEntryes - i - 1; ++j) {
                if (entries[j].compare(entries[j+1]) < 0) {
                    Entry tmp = entries[j];
                    entries[j] = entries[j+1];
                    entries[j+1] = tmp;
                }
            }
        }
    }

    public Entry[] get100max() {
        sortDesk();

        Entry[] tmp = new Entry[100];
        System.arraycopy(entries,0, tmp, 0, 100);
        return tmp;
    }

    public class Entry {
        public String key;
        public Integer value;

        Entry(String a1, Integer a2) {
            key = a1;
            value = a2;
        }

        int compare(Entry p) {
            if (this.value == p.value) {
                return 0;
            } else if (this.value > p.value) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
