package security;

public interface PasswordEncoder {
    String hashPassword(String password);
}
