public enum UserType {
    USER("http://web-for-user"),
    ADMIN("");

    private String string ="http://web-for-user";

    UserType(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }
}
