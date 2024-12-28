package org.jusan.week2.oop2.lesson.HomeWork2SarbasAidos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Создаем город
        City city = new City("Москва");

        // Создаем дома
        House house1 = new House("ул. Иванова, д.5");
        House house2 = new House("ул. Петрова, д.28");
        House house3 = new House("ул. Павлова, д.17");
        House house4 = new House("ул. Лапочкина, д.2");
        House house5 = new House("ул. Королева, д.153");

        // Добавляем дома в город
        city.addHouse(house1);
        city.addHouse(house2);
        city.addHouse(house3);
        city.addHouse(house4);
        city.addHouse(house5);

        // Создаем квартиры и добавляем их в дома
        Flat flat1 = new Flat(1, house1);
        Flat flat2 = new Flat(2, house1);

        Flat flat3 = new Flat(3, house2);
        Flat flat4 = new Flat(4, house2);

        Flat flat5 = new Flat(5, house3);
        Flat flat6 = new Flat(6, house3);

        Flat flat7 = new Flat(7, house4);
        Flat flat8 = new Flat(8, house4);

        Flat flat9 = new Flat(9, house5);
        Flat flat10 = new Flat(10, house5);

        house1.addFlat(flat1);
        house1.addFlat(flat2);

        house2.addFlat(flat3);
        house2.addFlat(flat4);

        house3.addFlat(flat5);
        house3.addFlat(flat6);

        house4.addFlat(flat7);
        house4.addFlat(flat8);

        house5.addFlat(flat9);
        house5.addFlat(flat10);

        // Создаем жителей
        Settler settler1 = new Settler("settler1");
        Settler settler2 = new Settler("settler2");
        Settler settler3 = new Settler("settler3");
        Settler settler4 = new Settler("settler4");
        Settler settler5 = new Settler("settler5");
        Settler settler6 = new Settler("settler6");
        Settler settler7 = new Settler("settler7");
        Settler settler8 = new Settler("settler8");
        Settler settler9 = new Settler("settler9");
        Settler settler10 = new Settler("settler10");
        Settler settler11 = new Settler("settler11");
        Settler settler13 = new Settler("settler13");
        Settler settler14 = new Settler("settler14");
        Settler settler15 = new Settler("settler15");
        Settler settler16 = new Settler("settler16");
        Settler settler17 = new Settler("settler17");
        Settler settler18 = new Settler("settler18");

        // Заселяем жителей
        flat1.addSettler(settler1);
        flat1.addSettler(settler2);

        flat2.addSettler(settler3);
        flat2.addSettler(settler4);

        flat3.addSettler(settler6);

        flat4.addSettler(settler7);
        flat4.addSettler(settler8);

        flat5.addSettler(settler9);
        flat5.addSettler(settler10);

        flat6.addSettler(settler11);

        flat7.addSettler(settler13);
        flat7.addSettler(settler14);

        flat8.addSettler(settler15);
        flat8.addSettler(settler16);

        flat9.addSettler(settler17);
        flat9.addSettler(settler18);

        // Проверка ограничения (ошибка)
        flat2.addSettler(settler5); // Превышение лимита жителей
        flat9.addSettler(new Settler("settler19")); // Превышение лимита жителей

        // Вывод информации о городе
        city.showSettledList();
    }
}
