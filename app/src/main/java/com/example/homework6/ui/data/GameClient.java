package com.example.homework6.ui.data;

import java.util.ArrayList;

public class GameClient {
    public static ArrayList<GameModel> gameList = new ArrayList<>();

    public static  ArrayList<GameModel> getGameList() {
        gameList.add(new GameModel("one","Самый богатый человек?","Джефф Безос","Бернар Арно"," Илон Маск","Билл Гейтс"
                ,"Джефф Безос"));

        gameList.add(new GameModel("two","Самый старый человек?","Сара Кнаусс","Люсиль Рандон"," ДКанэ Танака","Жанна Кальман"
                ,"Жанна Кальман"));

        gameList.add(new GameModel("three","Самый умный человек?","ТТеренс Тао","ККристофер Хирата"," ММэрилин вос Савант","ККристофер Ланган"
                ,"ККристофер Хирата"));

        gameList.add(new GameModel("four","Для отделения спирта от воды можно использовать","выпаривание и кристаллизацию","отстаивание","дистилляцию","фильтрование"
                ,"дистилляцию"));

        return gameList;
    }

}
