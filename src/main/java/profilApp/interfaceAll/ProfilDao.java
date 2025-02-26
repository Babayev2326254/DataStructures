package profilApp.interfaceAll;

import profilApp.userprofil.Profile;

import java.io.IOException;
import java.util.List;

public interface ProfilDao {
    void save(Profile profilFields);

    List<Profile> findAll() throws IOException;
}

