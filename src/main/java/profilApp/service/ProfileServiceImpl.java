package profilApp.service;

import profilApp.dao.FileProfileDao;
import profilApp.interfaceAll.ProfilDao;
import profilApp.interfaceAll.ProfileService;
import profilApp.userprofil.Profile;

import java.io.IOException;
import java.util.List;

public class ProfileServiceImpl implements ProfileService {
    ProfilDao memoryProfilDao = new FileProfileDao();

    @Override
    public void save(Profile profileFields) {
        if (profileFields.getPassword().length() >= 8){
            memoryProfilDao.save(profileFields);
        }else{
            System.out.println("invalid password");
        }
    }

    @Override
    public List<Profile> findAll() throws IOException {
       return memoryProfilDao.findAll();
    }
}