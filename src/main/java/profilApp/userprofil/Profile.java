package profilApp.userprofil;

import java.io.Serializable;
import java.util.Objects;

public class Profile implements Serializable {
    private Long id;
    private String username;
    private String password;

    public Profile(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Profile that)) return false;

        return Objects.equals(id, that.id) && Objects.equals(username, that.username) && Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(id);
        result = 31 * result + Objects.hashCode(username);
        result = 31 * result + Objects.hashCode(password);
        return result;
    }

    @Override
    public String toString() {
        return "ProfilFields{" +
               "id=" + id +
               ", username='" + username + '\'' +
               ", password='" + password + '\'' +
               '}';
    }
}