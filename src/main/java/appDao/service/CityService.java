package appDao.service;

import appDao.City;
import appDao.dao.CityDao;

public class CityService {
    private CityDao cityDao;

    public CityService(CityDao cityDao) {
        this.cityDao = cityDao;
    }

    public City getID(int id) {
        return cityDao.cityid(id);
    }


    public void addCIty(City city) {
        if (city.getRow() > 20) {
            cityDao.cityadd(city);
        }else {
            city.setName("Row 20 den az olduguna gore melumat daxil edilmedi ");
            city.setCode(0);
            city.setRow(0);
            cityDao.cityadd(city);
        }
    }


}
