package profilApp.dao;

import profilApp.interfaceAll.ProfilDao;
import profilApp.userprofil.Profile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileProfileDao implements ProfilDao {
    private String fileName = "src/main/java/profilApp/resource/profiles.txt";

    @Override
    public void save(Profile profilFields) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName, true);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

            objectOutputStream.writeObject(profilFields);
            System.out.println("Profil məlumatları yadda saxlanıldı.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Profile> findAll() throws IOException {
        List<Profile> profiles = new ArrayList<>();
        try(FileInputStream fileInputStream = new FileInputStream(fileName)) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            while (true) {
                try {
                    Profile profile = (Profile) objectInputStream.readObject();
                    profiles.add(profile);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return profiles;
    }
}
