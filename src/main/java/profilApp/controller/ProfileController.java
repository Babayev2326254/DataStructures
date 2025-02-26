package profilApp.controller;

import profilApp.interfaceAll.ProfileService;
import profilApp.service.ProfileServiceImpl;
import profilApp.userprofil.Profile;

import java.io.IOException;
import java.util.List;

public class ProfileController {
    ProfileService profileService=new ProfileServiceImpl();

    public void save(Profile profile){
        profileService.save(profile);
    }
    public List<Profile> getAll() throws IOException {
        return  profileService.findAll();
    }
}
