package ru.itis.lab15;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MapImp map = new MapImp();

/*
        String[] keys = map.getAllKeys();

        if (keys != null)
            for (String key : keys) {
                System.out.println(key + ": " + map.getValueByKey(key));
            }
*/

        map.put("1","Ахметов Айдар Илькамович");
        map.put("2","Багатов Багат Арсенович");
        map.put("3","Вафин Камиль Вахидович");
        map.put("4","Волков Артемий Анатольевич");
        map.put("5","Гайнуллова Аделя Рифкатовна");
        map.put("6","Гайфуллин Азамат Ильдарович");
        map.put("7","Галимов Булат Сайдашевич");
        map.put("8","Гапеев Иван Владимирович");
        map.put("9","Жукова Дария Сергеевна");
        map.put("10","Заитова Юлия Димовна");
        map.put("11","Закиров Михаил Сергеевич");
        map.put( "12","Калматова Карима Искандеровна");
        map.put("13","Касимов Даниил Юрьевич");
        map.put("14","Кондаков Степан Иванович");
        map.put("15","Мартынова Алина Денисовна");
        map.put("16","Мостякова Анна Сергеевна");
        map.put("17","Новожилов Артур Ирекович");
        map.put("18","Сафиуллин Рашид Алмазович");
        map.put("19","Сидорова Александра Петровна");
        map.put("20","Халитов Айдар Марсович");
        map.put("21","Халяпова Аделя Альбертовна");
        map.put("22","Хузин Камиль Фаридович");
        map.put("23","Шарафутдинов Ильмир Ильмасович");
    }
}
