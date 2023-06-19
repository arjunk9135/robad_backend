package com.estrobacknew.servernew.model;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Users")
public class UserModel {

    private String email;
    private String password;

    private String phno;
    public UserModel(String email, String password, String phno) {
        this.email = email;
        this.password = password;
        this.phno = phno;
    }



    public String getUsername() {
        return email;
    }

    public void setUsername(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }
}
