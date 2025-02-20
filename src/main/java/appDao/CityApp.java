package appDao;

import appDao.controller.CityController;
import appDao.dao.CityDao;
import appDao.service.CityService;

public class CityApp {
    public static void main(String[] args) {
        City city = new City("Baku", 220, 10);
        City city1 = new City("Ganja", 12, 11);
        City city2 = new City("Qusar", 22, 11);


        CityController cityController = new CityController(new CityService(new CityDao()));
        cityController.addCity(city);
        cityController.addCity(city1);
        cityController.addCity(city2);

        System.out.println(cityController.findid(0));
        System.out.println(cityController.findid(1));
        System.out.println(cityController.findid(2));
    }
}
