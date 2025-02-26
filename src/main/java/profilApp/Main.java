package profilApp;

import profilApp.controller.ProfileController;
import profilApp.userprofil.Profile;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Profile profile = new Profile( 1L,"Faxi", "12267323");
        Profile profile2 = new Profile( 2L,"Lale", "127622323");

        ProfileController memoryProfileDao = new ProfileController();
        memoryProfileDao.save(profile);
        memoryProfileDao.save(profile2);

        System.out.println(memoryProfileDao.getAll());
        System.out.println("Successful!");
    }
}