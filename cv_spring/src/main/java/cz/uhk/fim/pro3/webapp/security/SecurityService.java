package cz.uhk.fim.pro3.webapp.security;

public interface SecurityService {
    String findLoggedInUser(String username);
    void autoLogin(String username, String password);
}
