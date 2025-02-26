package appDao.dao;

import appDao.City;

import java.util.ArrayList;
import java.util.List;

public class CityDao {
    private List<City> cityList = new ArrayList<>();

    public City cityid(int id) {
        return cityList.get(id);
    }


//    public String cityName(City city) {
//        return city.getName();
//    }
//
//    public void cityTrueFalse(City city) {
//
//    }

    public int citylistlengt() {
        return cityList.toArray().length;
    }

    public void cityadd(City city) {
        cityList.add(city);
    }
}
