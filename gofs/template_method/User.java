public class User extends ActiveRecord {
    private String username;

    public User(String username) {
        this.username = username;
    }

    protected void beforeSave() {
        System.out.println("Before saving the user");
    }

    protected void afterSave() {
        System.out.println("After saving the user");
    }
}