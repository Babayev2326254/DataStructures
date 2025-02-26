package appDao;

import appDao.controller.CityController;
import appDao.dao.CityDao;
import appDao.service.CityService;

import java.util.ArrayList;
import java.util.List;

public class CityApp {
    public static void main(String[] args) {
        City city = new City("Baku", 220, 10);
        City city1 = new City("ganja", 12, 11);
        City ganja = new City("Qusar", 22, 11);

//        List<String> exmp = new ArrayList<>();
//        exmp.add("aaa");
//        exmp.add("jj");
//        System.out.println(exmp.contains("jj"));


        CityController cityController = new CityController(new CityService(new CityDao()));
        cityController.addCity(city);
        cityController.addCity(city1);
        cityController.addCity(ganja);

//        System.out.println(cityController.findid(0));
//        System.out.println(cityController.findid(1));
//        System.out.println(cityController.findid(2));
        cityController.cityAll();

    }
}
