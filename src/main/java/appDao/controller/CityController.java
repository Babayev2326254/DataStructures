package appDao.controller;

import appDao.City;
import appDao.service.CityService;

public class CityController {
    private CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    public City findid(int id) {
        return cityService.getID(id);
    }

    public void addCity(City city) {
        cityService.addCIty(city);
    }


}
