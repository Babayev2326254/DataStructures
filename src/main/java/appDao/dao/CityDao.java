package appDao.dao;

import appDao.City;

import java.util.ArrayList;
import java.util.List;

public class CityDao {
    private List<City> cityList = new ArrayList<>();

    public City cityid(int id) {
        return cityList.get(id);
    }

    public void cityadd(City city) {
        cityList.add(city);
    }
}
