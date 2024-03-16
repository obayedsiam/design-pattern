package creational.builder;

public class User {
    private final String userId;
    private final String userName;
    private final String emailId;

    private User(String userId, String userName, String emailId){
        this.userId = userId;
        this.userName = userName;
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }

    private User(UserBuilder userBuilder){
        this.userId = userBuilder.userId;
        this.userName = userBuilder.userName;
        this.emailId = userBuilder.emailId;
    }

    public static UserBuilder build(){
        return new UserBuilder();
    }


    public String getUserId() {
        return this.userId;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getEmailId() {
        return this.emailId;
    }



    // inner class to create Object

    static class UserBuilder{
        private  String userId;
        private  String userName;
        private  String emailId;

        public UserBuilder(){

        }

        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        public User build(){
            User user = new User(this);
            return user;
        }
    }
}
