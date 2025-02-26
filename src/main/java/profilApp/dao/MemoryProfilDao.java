package profilApp.dao;

import profilApp.interfaceAll.ProfilDao;
import profilApp.userprofil.Profile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MemoryProfilDao implements ProfilDao {
    List<Profile> profiles = new ArrayList<>();

    public void vor() {
        profiles.stream().count();
    }

    @Override
    public void save(Profile profile) {
        profiles.add(profile);
    }

    @Override
    public List<Profile> findAll() throws IOException {
        return List.of();
    }
}