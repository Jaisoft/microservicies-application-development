public class UserLogin {



    private final DataBase db;

    public UserLogin(DataBase db) {
        this.db = db;
    }

    void login(String userName, String password) {
        User user = db.findUserByUserName(userName);
        if (user == null) {
            // do something
        }
        sendEmail(user,"login succes");
    }

    void sendEmail(User user, String msg) {
        new EmailSender().sendEmail(user, msg);
    }


}
