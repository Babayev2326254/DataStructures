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
        } else {
            city.setName("Row 20 den az olduguna gore melumat daxil edilmedi ");
            city.setCode(0);
            city.setRow(0);
            cityDao.cityadd(city);
        }
    }

//    public void cityTrueFalse(City city){
//        if (cityDao.cityTrueFalse(city) == true){
//            System.out.println("Okay ");
//        }else {
//            System.out.println("nO problem");
//        }
//    }

    public void allCity() {
        for (int i = 0; i < cityDao.citylistlengt(); i++) {
            System.out.println(cityDao.cityid(i));
        }
    }


}
