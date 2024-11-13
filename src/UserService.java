public class UserService implements IUserService{

    public User user;


    @Override
    public void registr(User user) {
               Validation validation = new Validation();

     if(!validation.validationUserName(user) || !validation.validationPassword(user)){
         System.out.println("invalid username");
         return;
     }

       System.out.println("User successfully registered: " + user.getUserName());

    }

    @Override
    public void login(String username, String password) {
        if (username.equals(user.getUserName()) && password.equals(user.getPassword())){
           System.out.println("login successfully completed");
       }
       else {
           System.out.println("username or password is incorrect");
       }
   }
    }






