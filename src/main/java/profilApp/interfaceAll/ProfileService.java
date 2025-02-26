package profilApp.interfaceAll;

import profilApp.userprofil.Profile;

import java.io.IOException;
import java.util.List;

public interface ProfileService {
    void save(Profile profileFields);
    List<Profile> findAll() throws IOException;
}
