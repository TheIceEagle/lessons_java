package svyatoslav_petukhov_oop2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainCity {
    public static void main(String[] Args) {

        City city = new City("Moscow");

        String[] addresses = {
                "Ivanov St., 5",
                "Petrova St., 28",
                "Pavlova St., 17",
                "Lapochkina St., 2",
                "Koroleva St., 153"
        };

        int flatNumber = 1;
        for (String address : addresses) {
            House house = new House(address);
            for (int j = 1; j <= 2; j++) {  // По 2 квартиры в каждом доме
                house.addFlat(new Flat(flatNumber++));  // Номера квартир идут от 1 до 10
            }
            city.addHouse(house);
        }

        Settler[] settlers = new Settler[15];
        for (int i = 0; i < settlers.length; i++) {
            settlers[i] = new Settler("\u001B[47m-- Settler " + (i + 1) + "\u001B[0m");
        }

        Random random = new Random();
        // Собираем все квартиры в список
        List<Flat> allFlats = new ArrayList<>();
        for (House house : city.getHouseList()) {
            allFlats.addAll(house.getFlatList()); // Добавляем все квартиры из каждого дома в общий список
        }

        // Перемешиваем квартиры случайным образом
        Collections.shuffle(allFlats, random);

        int settlerIndex = 0;
        for (Flat flat : allFlats) {
            for (int k = 0; k < 2 && settlerIndex < settlers.length; k++) {
                flat.addSettler(settlers[settlerIndex++]);
            }
        }

            // Попробуем добавить дополнительного жильца в первую квартиру первого дома
            Settler settler16 = new Settler("settler16");
            House house1 = city.getHouseList().get(0); // Возьмем первый дом
            Flat flat1 = house1.getFlatList().get(0); // Первая квартира в доме
            flat1.addSettler(settler16); // Попытка добавить дополнительного жильца в первую квартиру

        city.showSettledList();
    }
}

